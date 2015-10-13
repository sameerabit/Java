/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import lbfinancecommon.observer.GuarantorObserver;

/**
 *
 * @author Hasitha
 */
public class GuarantorObservable {
    private List<GuarantorObserver> guarantorObserverList;

    public GuarantorObservable() {
        guarantorObserverList = new ArrayList<GuarantorObserver>();
    }
    
    public void addGuarantorObserver(GuarantorObserver guarantorObserver){
        guarantorObserverList.add(guarantorObserver);
    }
            
    public void notifyGuarantorObserver(String msg) throws RemoteException{
        for(GuarantorObserver go : guarantorObserverList){
            go.update(msg);
        }
    }
}
