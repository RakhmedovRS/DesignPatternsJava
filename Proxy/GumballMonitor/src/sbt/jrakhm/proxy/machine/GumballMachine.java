package sbt.jrakhm.proxy.machine;

import sbt.jrakhm.proxy.states.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author rassoll
 * @created 31.08.2017
 * @$Author$
 * @$Revision$
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote
{
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldState;
    private int count = 0;
    private String location;

    public void setState(State state)
    {
        this.state = state;
    }

    public State getSoldOutState()
    {
        return soldOutState;
    }

    public State getNoQuarterState()
    {
        return noQuarterState;
    }

    public State getHasQuarterState()
    {
        return hasQuarterState;
    }

    public State getSoldState()
    {
        return soldState;
    }

    public State getWinnerState()
    {
        return winnerState;
    }

    @Override
    public State getState()
    {
        return state;
    }

    @Override
    public int getCount()
    {
        return count;
    }

    @Override
    public String getLocation()
    {
        return null;
    }

    public GumballMachine(int numberGumballs) throws RemoteException
    {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterSate(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (count > 0)
        {
            state = noQuarterState;
        }
    }

    public GumballMachine(int count, String location) throws RemoteException
    {
        this(count);
        this.location = location;
    }

    public void insertQuarter()
    {
        state.insertQuarter();
    }

    public void ejectQuarter()
    {
        state.ejectQuarter();
    }

    public void turnCrank()
    {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall()
    {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0)
        {
            count --;
        }
    }

    public void refill(int numberGumballs)
    {
        state = soldState;
        count = numberGumballs;
    }

    @Override
    public String toString()
    {
        return String.format("\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2017\nInventory: %s gumballs\nMachine is %s", count, state);
    }
}
