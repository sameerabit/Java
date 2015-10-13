/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinance.observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.observer.GuarantorVehicleObserver;

/**
 *
 * @author Hasitha
 */
public class GuarantorVehicleObserverImpl extends UnicastRemoteObject implements GuarantorVehicleObserver{

    public GuarantorVehicleObserverImpl() throws RemoteException{
        super();
    }

    @Override
    public void update(String msg) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
