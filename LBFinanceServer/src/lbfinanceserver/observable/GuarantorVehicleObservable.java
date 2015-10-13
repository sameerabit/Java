/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import lbfinancecommon.observer.GuarantorVehicleObserver;

/**
 *
 * @author Hasitha
 */
public class GuarantorVehicleObservable {

    private List<GuarantorVehicleObserver> guarantorVehicleObserverList;

    public GuarantorVehicleObservable() {
        guarantorVehicleObserverList = new ArrayList<GuarantorVehicleObserver>();
    }

    public void addGuarantorVehicleObserver(GuarantorVehicleObserver guarantorVehicleObserver) {
        guarantorVehicleObserverList.add(guarantorVehicleObserver);
    }

    public void notifyGuarantorVehicleObserver(String msg) throws RemoteException {
        for (GuarantorVehicleObserver gvo : guarantorVehicleObserverList) {
            gvo.update(msg);
        }
    }
}
