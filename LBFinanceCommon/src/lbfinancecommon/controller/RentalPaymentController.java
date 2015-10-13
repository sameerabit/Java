/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import lbfinancecommon.model.RentalPayment;

/**
 *
 * @author Hasitha
 */
public interface RentalPaymentController extends Remote{

    public RentalPayment getRentalPaymentDetails(String leaseNo) throws RemoteException,SQLException,ClassNotFoundException;

    public RentalPayment getReceivedPecentage(String text) throws RemoteException,SQLException,ClassNotFoundException;

    public int pay(RentalPayment rentalPayment) throws RemoteException,SQLException,ClassNotFoundException;
    
}
