/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.controller.MarketingOfficerController;
import lbfinancecommon.model.MarketingOfficer;
import lbfinanceserver.dbAccess.MarketingOfficerDBAccess;

/**
 *
 * @author Hasitha
 */
public class MarketingOfficerControllerImpl extends UnicastRemoteObject implements MarketingOfficerController {

    private MarketingOfficerDBAccess dBAccess = new MarketingOfficerDBAccess();

    public MarketingOfficerControllerImpl() throws RemoteException {
    }

    @Override
    public boolean addMarketingOfficer(MarketingOfficer marketingOfficer) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.addMarketingOfficer(marketingOfficer);
    }

    @Override
    public MarketingOfficer searchMarketingOfficer(String marketingOfficer) throws RemoteException, ClassNotFoundException, SQLException {
        return dBAccess.searchMarketingOfficer(marketingOfficer);
    }

    @Override
    public ArrayList<String> getMarketingOfficerIds() throws SQLException, ClassNotFoundException {
        return dBAccess.getMarketingOfficerIds();
    }
}
