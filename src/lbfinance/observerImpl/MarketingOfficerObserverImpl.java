/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinance.observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.observer.MarketingOfficerObserver;

/**
 *
 * @author Hasitha
 */
public class MarketingOfficerObserverImpl extends UnicastRemoteObject implements MarketingOfficerObserver{

    public MarketingOfficerObserverImpl() throws RemoteException{
        super();
    }

    @Override
    public void update(String msg) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
