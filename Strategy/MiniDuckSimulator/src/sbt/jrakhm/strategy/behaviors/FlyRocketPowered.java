package sbt.jrakhm.strategy.behaviors;

/**
 * @author rassoll
 * @ created 24.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class FlyRocketPowered implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("I'm flying with a rocket!");
    }
}
