/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lbfinancecommon.controller.ClientBankersController;
import lbfinancecommon.controller.ClientController;
import lbfinancecommon.controller.ClientIncomeTaxController;
import lbfinancecommon.controller.ClientVehicleController;
import lbfinancecommon.controller.GuarentorBankersController;
import lbfinancecommon.controller.GuarentorController;
import lbfinancecommon.controller.GuarentorIncomeTaxController;
import lbfinancecommon.controller.GuarentorVehicleController;
import lbfinancecommon.controller.InsuranceController;
import lbfinancecommon.controller.LeasedVehicleController;
import lbfinancecommon.controller.LeasingController;
import lbfinancecommon.controller.MarketingOfficerController;
import lbfinancecommon.controller.RecoveryOfficerControler;
import lbfinancecommon.controller.RemoteFactory;
import lbfinancecommon.controller.RentalPaymentController;
import lbfinancecommon.controller.UserController;
import lbfinancecommon.controller.VehicleCategoryController;

/**
 *
 * @author Hasitha
 */
public class RemoteFactoryImpl extends UnicastRemoteObject implements RemoteFactory {

    public RemoteFactoryImpl() throws RemoteException {
    }

    @Override
    public ClientBankersController getClientBankersController() throws RemoteException {
        return new ClientBankersControllerImpl();
    }

    @Override
    public ClientController getClientController() throws RemoteException {
        return new ClientControllerImpl();
    }

    @Override
    public ClientIncomeTaxController getClientIncomeTaxController() throws RemoteException {
        return new ClientIncomeTaxControllerImpl();
    }

    @Override
    public ClientVehicleController getClientVehicleController() throws RemoteException {
        return new ClientVehicleControllerImpl();
    }

    @Override
    public GuarentorBankersController getGuarentorBankersController() throws RemoteException {
        return new GuarentorBankersControllerImpl();
    }

    @Override
    public GuarentorController getGuarentorController() throws RemoteException {
        return new GuarentorControllerImpl();
    }

    @Override
    public GuarentorIncomeTaxController getGuarentorIncomeTaxController() throws RemoteException {
        return new GuarentorIncomeTaxControllerImpl();
    }

    @Override
    public GuarentorVehicleController getGuarentorVehicleController() throws RemoteException {
        return new GuarentorVehicleControllerImpl();
    }

    @Override
    public InsuranceController getInsuranceController() throws RemoteException {
        return new InsuranceControllerImpl();
    }

    @Override
    public LeasedVehicleController getLeasedVehicleController() throws RemoteException {
        return new LeasedVehicleControllerImpl();
    }

    @Override
    public LeasingController getLeasingController() throws RemoteException {
        return new LeasingControllerImpl();
    }

    @Override
    public MarketingOfficerController getMarketingOfficerController() throws RemoteException {
        return new MarketingOfficerControllerImpl();
    }

    @Override
    public RecoveryOfficerControler getRecoveryOfficerControler() throws RemoteException {
        return new RecoveryOfficerControllerImpl();
    }

    @Override
    public RentalPaymentController getRentalPaymentController() throws RemoteException {
        return new RentalPaymentControllerImpl();
    }

    @Override
    public VehicleCategoryController getVehicleCategoryController() throws RemoteException {
        return new VehicleCategoryControllerImpl();
    }

    @Override
    public UserController getUserController() throws RemoteException {
        return new UserControllerImpl();
    }
}
