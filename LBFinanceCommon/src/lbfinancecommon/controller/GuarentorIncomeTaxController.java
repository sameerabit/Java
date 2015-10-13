/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.GuarentorIncomeTax;

/**
 *
 * @author Hasitha
 */
public interface GuarentorIncomeTaxController extends Remote{

    public boolean addIncomeTax(ArrayList<GuarentorIncomeTax> taxList) throws RemoteException, ClassNotFoundException, SQLException;
    
}
