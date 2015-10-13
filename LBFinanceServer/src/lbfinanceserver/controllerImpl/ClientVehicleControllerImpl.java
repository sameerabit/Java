/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.controller.ClientVehicleController;

/**
 *
 * @author Hasitha
 */
public class ClientVehicleControllerImpl extends UnicastRemoteObject implements ClientVehicleController {

    public ClientVehicleControllerImpl() throws RemoteException {
    }
}
