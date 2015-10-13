/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import lbfinancecommon.observer.ClientBankersObserver;

/**
 *
 * @author Hasitha
 */
public class ClientBankersObservable {

    private List<ClientBankersObserver> clientBankersObserverList;

    public ClientBankersObservable() {
        clientBankersObserverList = new ArrayList<ClientBankersObserver>();
    }

    public void addClientBankersObserver(ClientBankersObserver clientBankersObserver) {
        clientBankersObserverList.add(clientBankersObserver);
    }

    public void notifyClientBankersObserver(String msg) throws RemoteException {
        for (ClientBankersObserver cbo : clientBankersObserverList) {
            cbo.update(msg);
        }
    }
}
