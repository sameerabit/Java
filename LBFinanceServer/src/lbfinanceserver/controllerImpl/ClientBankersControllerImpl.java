/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.ClientBankersController;
import lbfinancecommon.model.ClientBankers;
import lbfinanceserver.dbAccess.ClientBankersDBAccess;

/**
 *
 * @author Hasitha
 */
public class ClientBankersControllerImpl extends UnicastRemoteObject implements ClientBankersController {

    private ClientBankersDBAccess dBAccess = new ClientBankersDBAccess();

    public ClientBankersControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addBankers(ArrayList<ClientBankers> bankerList) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addBankers(bankerList);
    }
}
