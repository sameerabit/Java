/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.ClientIncomeTaxController;
import lbfinancecommon.model.ClientIncomeTax;
import lbfinanceserver.dbAccess.ClientIncomeTaxDBAccess;

/**
 *
 * @author Hasitha
 */
public class ClientIncomeTaxControllerImpl extends UnicastRemoteObject implements ClientIncomeTaxController {

    private ClientIncomeTaxDBAccess dBAccess = new ClientIncomeTaxDBAccess();

    public ClientIncomeTaxControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addIncomeTax(ArrayList<ClientIncomeTax> taxList) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addIncomeTax(taxList);
    }
}
