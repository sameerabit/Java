/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.Client;
import lbfinancecommon.model.Leasing;

/**
 *
 * @author Hasitha
 */
public interface LeasingController extends Remote{

    public ArrayList<Leasing> searchLeasing(String text) throws RemoteException,SQLException,ClassNotFoundException;

    public Client searchClientByLeasingNo(String searchText) throws RemoteException,SQLException,ClassNotFoundException;

    public boolean addNewLeasingDetails(Leasing leasing) throws RemoteException,SQLException,ClassNotFoundException;

    public boolean removeLeasingDetails(Leasing leasing) throws RemoteException,SQLException,ClassNotFoundException;
    
}
