/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import lbfinancecommon.observer.ClientObserver;

/**
 *
 * @author Hasitha
 */
public class ClientObservable {

    private List<ClientObserver> clientObserverList;

    public ClientObservable() {
        clientObserverList = new ArrayList<ClientObserver>();
    }

    public void addClientObserver(ClientObserver clientObserver) {
        clientObserverList.add(clientObserver);
    }

    public void notifyClientObserver(String msg) throws RemoteException {
        for (ClientObserver co : clientObserverList) {
            co.update(msg);
        }
    }
}
