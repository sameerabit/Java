/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinancecommon.controller;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import lbfinancecommon.model.Guarentor;

/**
 *
 * @author Hasitha
 */
public interface GuarentorController extends Remote{

    public boolean addGuarentor(Guarentor guarentor) throws RemoteException, ClassNotFoundException, SQLException;

    public ArrayList<Guarentor> getGuarentorList(String leasingNo) throws RemoteException, ClassNotFoundException, SQLException;
    
}
