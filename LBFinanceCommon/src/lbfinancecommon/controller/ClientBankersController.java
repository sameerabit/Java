/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.ClientBankers;

/**
 *
 * @author Hasitha
 */
public interface ClientBankersController extends Remote{

    public boolean addBankers(ArrayList<ClientBankers> bankerList) throws RemoteException, ClassNotFoundException, SQLException;
    
}
