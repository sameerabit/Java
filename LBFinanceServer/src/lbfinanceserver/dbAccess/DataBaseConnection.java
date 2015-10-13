/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hasitha
 */
public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection;
    private static Connection connection;

    private DataBaseConnection() throws SQLException ,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/LEASINGCOMPANY", "root", "ijse");
    }

    private static DataBaseConnection getDataBaseConnection() throws SQLException, ClassNotFoundException {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        return getDataBaseConnection().connection;
    }
}
