package sbt.jrakhm.state.states;

import sbt.jrakhm.state.GumballMachine;

/**
 * @author rassoll
 * @created 31.08.2017
 * @$Author$
 * @$Revision$
 */
public class NoQuarterState implements State
{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispence()
    {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString()
    {
        return "no quarter";
    }
}
