/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import lbfinancecommon.observer.GuarantorBankersObserver;

/**
 *
 * @author Hasitha
 */
public class GuarantorBankersObservable {

    private List<GuarantorBankersObserver> guarantorBankersObserverList;

    public GuarantorBankersObservable() {
        guarantorBankersObserverList = new ArrayList<GuarantorBankersObserver>();
    }

    public void addGuarantorBankersObserver(GuarantorBankersObserver guarantorBankersObserver) {
        guarantorBankersObserverList.add(guarantorBankersObserver);
    }

    public void notifyGuarantorBankersObserver(String msg) throws RemoteException {
        for (GuarantorBankersObserver gbo : guarantorBankersObserverList) {
            gbo.update(msg);
        }
    }
}
