/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import lbfinancecommon.controller.UserController;
import lbfinancecommon.model.User;
import lbfinanceserver.dbAccess.UserDBAccess;

/**
 *
 * @author Hasitha
 */
public class UserControllerImpl extends UnicastRemoteObject implements UserController {

    private UserDBAccess dBAccess = new UserDBAccess();

    public UserControllerImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean addNewUser(User user) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addNewUser(user);
    }

    @Override
    public int searchUser(User user) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.searchUser(user);
    }
}
