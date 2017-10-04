package sbt.jrakhm.strategy.behaviors;

/**
 * @author rassoll
 * @ created 24.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class FlyNoWay implements FlyBehavior
{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
