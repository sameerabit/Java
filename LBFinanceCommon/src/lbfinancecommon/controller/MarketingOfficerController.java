/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.MarketingOfficer;

/**
 *
 * @author Hasitha
 */
public interface MarketingOfficerController extends Remote{

    public boolean addMarketingOfficer(MarketingOfficer marketingOfficer) throws RemoteException, ClassNotFoundException, SQLException;

    public MarketingOfficer searchMarketingOfficer(String string)throws RemoteException, ClassNotFoundException, SQLException;

    public ArrayList<String> getMarketingOfficerIds()throws RemoteException, ClassNotFoundException, SQLException;
    
}
