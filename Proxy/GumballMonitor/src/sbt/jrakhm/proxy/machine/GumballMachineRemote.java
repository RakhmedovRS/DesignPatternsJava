package sbt.jrakhm.proxy.machine;

import sbt.jrakhm.proxy.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author rassoll
 * @created 18.09.2017
 * @$Author$
 * @$Revision$
 */
public interface GumballMachineRemote extends Remote
{
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
