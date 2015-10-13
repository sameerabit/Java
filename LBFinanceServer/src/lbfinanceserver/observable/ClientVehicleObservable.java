/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import lbfinancecommon.observer.ClientVehicleObserver;

/**
 *
 * @author Hasitha
 */
public class ClientVehicleObservable {

    private List<ClientVehicleObserver> clientVehicleObserverList;

    public ClientVehicleObservable() {
        clientVehicleObserverList = new ArrayList<ClientVehicleObserver>();
    }

    public void addClientVehicleObserver(ClientVehicleObserver clientVehicleObserver) {
        clientVehicleObserverList.add(clientVehicleObserver);
    }

    public void notifyClientVehicleObserver(String msg) throws RemoteException {
        for (ClientVehicleObserver cvo : clientVehicleObserverList) {
            cvo.update(msg);
        }
    }
}
