/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinance.observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.observer.LeasedVehicleObserver;

/**
 *
 * @author Hasitha
 */
public class LeasedVehicleObserverImpl extends UnicastRemoteObject implements LeasedVehicleObserver{

    public LeasedVehicleObserverImpl() throws RemoteException{
        super();
    }

    @Override
    public void update(String msg) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
