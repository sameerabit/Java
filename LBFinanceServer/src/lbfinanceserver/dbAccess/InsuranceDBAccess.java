/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lbfinanceserver.dbAccess;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author Hasitha
 */
public class InsuranceDBAccess {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
}
