/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinance.observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.observer.RentalPaymentObserver;

/**
 *
 * @author Hasitha
 */
public class RentalPaymentObserverImpl extends UnicastRemoteObject implements RentalPaymentObserver{

    public RentalPaymentObserverImpl() throws RemoteException{
        super();
    }

    @Override
    public void update(String msg) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
