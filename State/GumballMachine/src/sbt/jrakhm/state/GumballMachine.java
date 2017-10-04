package sbt.jrakhm.state;

import sbt.jrakhm.state.states.*;

/**
 * @author rassoll
 * @created 31.08.2017
 * @$Author$
 * @$Revision$
 */
public class GumballMachine
{
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldState;
    private int count = 0;

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

    public int getCount()
    {
        return count;
    }

    public GumballMachine(int numberGumballs)
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
        state.dispence();
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
