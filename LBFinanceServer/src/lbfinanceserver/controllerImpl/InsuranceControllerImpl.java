/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.controller.InsuranceController;

/**
 *
 * @author Hasitha
 */
public class InsuranceControllerImpl extends UnicastRemoteObject implements InsuranceController {

    public InsuranceControllerImpl() throws RemoteException {
    }
}
