package sbt.jrakhm.state.states;

import sbt.jrakhm.state.GumballMachine;

import java.util.Random;

/**
 * @author rassoll
 * @created 31.08.2017
 * @$Author$
 * @$Revision$
 */
public class HasQuarterSate implements State
{
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterSate(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter()
    {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1))
        {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else
        {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispence()
    {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString()
    {
        return "waiting for turn crank";
    }
}
