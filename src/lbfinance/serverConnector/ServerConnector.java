/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinance.serverConnector;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
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
public class ServerConnector {

    public static ServerConnector serverConnector;
    public RemoteFactory remoteFactory;
    public ClientBankersController clientBankersController;
    public ClientController clientController;
    public ClientIncomeTaxController clientIncomeTaxController;
    public ClientVehicleController clientVehicleController;
    public GuarentorBankersController guarentorBankersController;
    public GuarentorController guarentorController;
    public GuarentorIncomeTaxController guarentorIncomeTaxController;
    public GuarentorVehicleController guarentorVehicleController;
    public InsuranceController insuranceController;
    public LeasedVehicleController leasedVehicleController;
    public LeasingController leasingController;
    public MarketingOfficerController marketingOfficerController;
    public RecoveryOfficerControler recoveryOfficerControler;
    public RentalPaymentController rentalPaymentController;
    public VehicleCategoryController vehicleCategoryController;
    public String lookUpstring;
    private UserController userController;

    public ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        lookUpstring = "rmi://localhost:1099/RemoteServer";
        remoteFactory = (RemoteFactory) Naming.lookup(lookUpstring);
    }

    /**
     * @return the serverConnector
     */
    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if (serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }

    /**
     * @return the clientBankersController
     */
    public ClientBankersController getClientBankersController() throws NotBoundException, MalformedURLException, RemoteException {
        if (clientBankersController == null) {
            clientBankersController = remoteFactory.getClientBankersController();
        }
        return clientBankersController;
    }

    /**
     * @return the clientController
     */
    public ClientController getClientController() throws NotBoundException, MalformedURLException, RemoteException {
        if (clientController == null) {
            clientController = remoteFactory.getClientController();
        }
        return clientController;
    }

    /**
     * @return the clientIncomeTaxController
     */
    public ClientIncomeTaxController getClientIncomeTaxController() throws NotBoundException, MalformedURLException, RemoteException {
        if (clientIncomeTaxController == null) {
            clientIncomeTaxController = remoteFactory.getClientIncomeTaxController();
        }
        return clientIncomeTaxController;
    }

    /**
     * @return the clientVehicleController
     */
    public ClientVehicleController getClientVehicleController() throws NotBoundException, MalformedURLException, RemoteException {
        if (clientVehicleController == null) {
            clientVehicleController = remoteFactory.getClientVehicleController();
        }
        return clientVehicleController;
    }

    /**
     * @return the guarentorBankersController
     */
    public GuarentorBankersController getGuarentorBankersController() throws NotBoundException, MalformedURLException, RemoteException {
        if (guarentorBankersController == null) {
            guarentorBankersController = remoteFactory.getGuarentorBankersController();
        }
        return guarentorBankersController;
    }

    /**
     * @return the guarentorController
     */
    public GuarentorController getGuarentorController() throws NotBoundException, MalformedURLException, RemoteException {
        if (guarentorController == null) {
            guarentorController = remoteFactory.getGuarentorController();
        }
        return guarentorController;
    }

    /**
     * @return the guarentorIncomeTaxController
     */
    public GuarentorIncomeTaxController getGuarentorIncomeTaxController() throws NotBoundException, MalformedURLException, RemoteException {
        if (guarentorIncomeTaxController == null) {
            guarentorIncomeTaxController = remoteFactory.getGuarentorIncomeTaxController();
        }
        return guarentorIncomeTaxController;
    }

    /**
     * @return the guarentorVehicleController
     */
    public GuarentorVehicleController getGuarentorVehicleController() throws NotBoundException, MalformedURLException, RemoteException {
        if (guarentorVehicleController == null) {
            guarentorVehicleController = remoteFactory.getGuarentorVehicleController();
        }
        return guarentorVehicleController;
    }

    /**
     * @return the insuranceController
     */
    public InsuranceController getInsuranceController() throws NotBoundException, MalformedURLException, RemoteException {
        if (insuranceController == null) {
            insuranceController = remoteFactory.getInsuranceController();
        }
        return insuranceController;
    }

    /**
     * @return the leasedVehicleController
     */
    public LeasedVehicleController getLeasedVehicleController() throws NotBoundException, MalformedURLException, RemoteException {
        if (leasedVehicleController == null) {
            leasedVehicleController = remoteFactory.getLeasedVehicleController();
        }
        return leasedVehicleController;
    }

    /**
     * @return the leasingController
     */
    public LeasingController getLeasingController() throws NotBoundException, MalformedURLException, RemoteException {
        if (leasingController == null) {
            leasingController = remoteFactory.getLeasingController();
        }
        return leasingController;
    }

    /**
     * @return the marketingOfficerController
     */
    public MarketingOfficerController getMarketingOfficerController() throws NotBoundException, MalformedURLException, RemoteException {
        if (marketingOfficerController == null) {
            marketingOfficerController = remoteFactory.getMarketingOfficerController();
        }
        return marketingOfficerController;
    }

    /**
     * @return the recoveryOfficerControler
     */
    public RecoveryOfficerControler getRecoveryOfficerControler() throws NotBoundException, MalformedURLException, RemoteException {
        if (recoveryOfficerControler == null) {
            recoveryOfficerControler = remoteFactory.getRecoveryOfficerControler();
        }
        return recoveryOfficerControler;
    }

    /**
     * @return the rentalPaymentController
     */
    public RentalPaymentController getRentalPaymentController() throws NotBoundException, MalformedURLException, RemoteException {
        if (rentalPaymentController == null) {
            rentalPaymentController = remoteFactory.getRentalPaymentController();
        }
        return rentalPaymentController;
    }

    /**
     * @return the vehicleCategoryController
     */
    public VehicleCategoryController getVehicleCategoryController() throws NotBoundException, MalformedURLException, RemoteException {
        if (vehicleCategoryController == null) {
            vehicleCategoryController = remoteFactory.getVehicleCategoryController();
        }
        return vehicleCategoryController;
    }

    public UserController getUserController() throws NotBoundException, MalformedURLException, RemoteException {
        if (userController == null) {
            userController = remoteFactory.getUserController();
        }
        return userController;
    }
}
