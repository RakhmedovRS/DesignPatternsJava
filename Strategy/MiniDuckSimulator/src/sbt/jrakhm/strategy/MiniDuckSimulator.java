package sbt.jrakhm.strategy;

import sbt.jrakhm.strategy.ducks.MallardDuck;
import sbt.jrakhm.strategy.ducks.ModelDuck;
import sbt.jrakhm.strategy.behaviors.FlyRocketPowered;
import sbt.jrakhm.strategy.ducks.Duck;

public class MiniDuckSimulator
{

    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
