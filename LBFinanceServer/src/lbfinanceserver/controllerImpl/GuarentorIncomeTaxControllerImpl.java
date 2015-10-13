/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.GuarentorIncomeTaxController;
import lbfinancecommon.model.GuarentorIncomeTax;
import lbfinanceserver.dbAccess.GuarentorIncomeTaxDBAccess;

/**
 *
 * @author Hasitha
 */
public class GuarentorIncomeTaxControllerImpl extends UnicastRemoteObject implements GuarentorIncomeTaxController {

    private GuarentorIncomeTaxDBAccess dBAccess = new GuarentorIncomeTaxDBAccess();

    public GuarentorIncomeTaxControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addIncomeTax(ArrayList<GuarentorIncomeTax> taxList) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addIncomeTax(taxList);
    }
}
