/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.GuarentorBankersController;
import lbfinancecommon.model.GuarentorBankers;
import lbfinanceserver.dbAccess.GuarentorBankersDBAccess;

/**
 *
 * @author Hasitha
 */
public class GuarentorBankersControllerImpl extends UnicastRemoteObject implements GuarentorBankersController {

    private GuarentorBankersDBAccess dBAccess = new GuarentorBankersDBAccess();

    public GuarentorBankersControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addBankers(ArrayList<GuarentorBankers> bankerList) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addBankers(bankerList);
    }
}
