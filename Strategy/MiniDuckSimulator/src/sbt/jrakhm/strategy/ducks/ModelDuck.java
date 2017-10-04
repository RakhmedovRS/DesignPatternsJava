package sbt.jrakhm.strategy.ducks;

import sbt.jrakhm.strategy.behaviors.FlyNoWay;
import sbt.jrakhm.strategy.behaviors.Quack;

/**
 * @author rassoll
 * @ created 24.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class ModelDuck extends Duck
{

    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("I'm a model strategy");
    }
}
