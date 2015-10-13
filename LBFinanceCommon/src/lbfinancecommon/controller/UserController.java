/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import lbfinancecommon.model.User;

/**
 *
 * @author Hasitha
 */
public interface UserController extends Remote {

    public boolean addNewUser(User user) throws RemoteException, ClassNotFoundException, SQLException;

    public int searchUser(User user) throws RemoteException, ClassNotFoundException, SQLException;
    
}
