/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import lbfinancecommon.controller.RentalPaymentController;
import lbfinancecommon.model.RentalPayment;
import lbfinanceserver.dbAccess.RentalPaymentDBAccess;

/**
 *
 * @author Hasitha
 */
public class RentalPaymentControllerImpl extends UnicastRemoteObject implements RentalPaymentController {

    private RentalPaymentDBAccess dBAccess=new RentalPaymentDBAccess();
    
    
    public RentalPaymentControllerImpl() throws RemoteException {
    }

    @Override
    public RentalPayment getRentalPaymentDetails(String leaseNo) throws RemoteException, SQLException, ClassNotFoundException {
        return dBAccess.getRentalPaymentDetails(leaseNo);
    }

    @Override
        public RentalPayment getReceivedPecentage(String leaseNo) throws RemoteException, SQLException, ClassNotFoundException {
        return dBAccess.getReceivedPecentage(leaseNo);
    }

    /**
     *
     * @param rentalPayment
     * @return
     * @throws RemoteException
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public int pay(RentalPayment rentalPayment) throws RemoteException, SQLException, ClassNotFoundException {
        return dBAccess.pay(rentalPayment);
    }
}
