package sbt.jrakhm.strategy.ducks;

import sbt.jrakhm.strategy.behaviors.FlyWithWings;
import sbt.jrakhm.strategy.behaviors.Quack;

/**
 * @author rassoll
 * @ created 24.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("I'm a real Mallard strategy");
    }
}
