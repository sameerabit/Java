/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lbfinancecommon.model.User;

/**
 *
 * @author Hasitha
 */
public class UserDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public boolean addNewUser(User user) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "INSERT INTO USER(username,password,privilege) VALUES ('" + user.getUserName() + "',(Select password('" + user.getPassword() + "'))," + user.getPrivilege() + ");";
        int res = createStatement.executeUpdate(sql);

        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int searchUser(User user) throws SQLException, ClassNotFoundException {
        Connection connection = DataBaseConnection.getConnection();
        Statement createStatement = connection.createStatement();
        String sql = "SELECT privilege FROM USER WHERE username = '" + user.getUserName() + "' AND password = (Select password('" + user.getPassword() + "'));";
        ResultSet set = createStatement.executeQuery(sql);

        int privilege = 0;

        if (set.next()) {
            privilege = set.getInt("privilege");
            return privilege;
        } else {
            return -1;
        }
    }
}
