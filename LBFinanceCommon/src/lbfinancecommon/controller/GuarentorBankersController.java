/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.GuarentorBankers;

/**
 *
 * @author Hasitha
 */
public interface GuarentorBankersController extends Remote{

    public boolean addBankers(ArrayList<GuarentorBankers> bankerList) throws RemoteException, ClassNotFoundException, SQLException;
    
}
