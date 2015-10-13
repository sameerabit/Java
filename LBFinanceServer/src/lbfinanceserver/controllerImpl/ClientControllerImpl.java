/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import lbfinancecommon.controller.ClientController;
import lbfinancecommon.model.Client;
import lbfinanceserver.dbAccess.ClientDBAccess;

/**
 *
 * @author Hasitha
 */
public class ClientControllerImpl extends UnicastRemoteObject implements ClientController {

    private ClientDBAccess dBAccess = new ClientDBAccess();

    public ClientControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addClient(Client client) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addClient(client);
    }

    @Override
    public Client searchClientDetailsByNIC(String text) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.searchClientDetailsByNIC(text);
    }

    @Override
    public Client searchClientDetailsByID(String searchText) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.searchClientById(searchText);
    }

    @Override
    public Client searchClientByName(String searchText) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.searchClientByName(searchText);
    }
}
