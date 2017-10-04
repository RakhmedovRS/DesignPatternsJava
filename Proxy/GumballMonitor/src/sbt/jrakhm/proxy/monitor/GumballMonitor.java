package sbt.jrakhm.proxy.monitor;

import sbt.jrakhm.proxy.machine.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * @author rassoll
 * @created 18.09.2017
 * @$Author$
 * @$Revision$
 */
public class GumballMonitor
{
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine)
    {
        this.machine = machine;
    }

    public void report()
    {
        try
        {
            System.out.println(String.format("\nGumball Machine: %s", machine.getLocation()));
            System.out.println(String.format("\nGumball inventory: %s gumballs", machine.getCount()));
            System.out.println(String.format("\nGumball state: %s", machine.getState()));
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
    }
}
