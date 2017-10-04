package sbt.jrakhm.strategy.ducks;

import sbt.jrakhm.strategy.behaviors.FlyBehavior;
import sbt.jrakhm.strategy.behaviors.QuackBehavior;

/**
 * @author rassoll
 * @ created 24.05.2017
 * @ $Author$
 * @ $Revision$
 */
public abstract class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck()
    {
    }

    public abstract void display();

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void swim()
    {
        System.out.println("All sbt.jrakhm.strategy.ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
