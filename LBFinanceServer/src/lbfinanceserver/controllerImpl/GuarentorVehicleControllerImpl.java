/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.controller.GuarentorVehicleController;

/**
 *
 * @author Hasitha
 */
public class GuarentorVehicleControllerImpl extends UnicastRemoteObject implements GuarentorVehicleController {

    public GuarentorVehicleControllerImpl() throws RemoteException {
    }
}
