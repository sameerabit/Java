/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.GuarentorController;
import lbfinancecommon.model.Guarentor;
import lbfinanceserver.dbAccess.GuarentorDBAccess;

/**
 *
 * @author Hasitha
 */
public class GuarentorControllerImpl extends UnicastRemoteObject implements GuarentorController {

    private GuarentorDBAccess dBAccess = new GuarentorDBAccess();

    public GuarentorControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addGuarentor(Guarentor guarentor) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addGuarentor(guarentor);
    }

    @Override
    public ArrayList<Guarentor> getGuarentorList(String leasingNo) throws RemoteException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
