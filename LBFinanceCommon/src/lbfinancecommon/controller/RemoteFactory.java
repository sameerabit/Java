/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Hasitha
 */
public interface RemoteFactory extends Remote {

    public ClientBankersController getClientBankersController() throws RemoteException;

    public ClientController getClientController() throws RemoteException;

    public ClientIncomeTaxController getClientIncomeTaxController() throws RemoteException;

    public ClientVehicleController getClientVehicleController() throws RemoteException;

    public GuarentorBankersController getGuarentorBankersController() throws RemoteException;

    public GuarentorController getGuarentorController() throws RemoteException;

    public GuarentorIncomeTaxController getGuarentorIncomeTaxController() throws RemoteException;

    public GuarentorVehicleController getGuarentorVehicleController() throws RemoteException;

    public InsuranceController getInsuranceController() throws RemoteException;

    public LeasedVehicleController getLeasedVehicleController() throws RemoteException;

    public LeasingController getLeasingController() throws RemoteException;

    public MarketingOfficerController getMarketingOfficerController() throws RemoteException;

    public RecoveryOfficerControler getRecoveryOfficerControler() throws RemoteException;

    public RentalPaymentController getRentalPaymentController() throws RemoteException;

    public VehicleCategoryController getVehicleCategoryController() throws RemoteException;

    public UserController getUserController() throws RemoteException;
}
