/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import lbfinancecommon.model.Client;

/**
 *
 * @author Hasitha
 */
public interface ClientController extends Remote {

    public boolean addClient(Client client) throws RemoteException, ClassNotFoundException, SQLException;

    public Client searchClientDetailsByNIC(String text) throws RemoteException, ClassNotFoundException, SQLException;

    public Client searchClientDetailsByID(String searchText) throws RemoteException, ClassNotFoundException, SQLException;

    public Client searchClientByName(String searchText) throws RemoteException, ClassNotFoundException, SQLException;
}
