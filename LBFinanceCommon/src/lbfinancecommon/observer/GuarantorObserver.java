/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.observer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Hasitha
 */
public interface GuarantorObserver extends Remote{
    
    public void update(String msg) throws RemoteException;
}
