package sbt.jrakhm.decorator.supplements;

import sbt.jrakhm.decorator.beverage.Beverage;
import sbt.jrakhm.decorator.beverage.BeverageSize;
import sbt.jrakhm.decorator.beverage.CondimentDecorator;

/**
 * @author rassoll
 * @ created 26.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class Mocha extends CondimentDecorator
{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageSize beverageSize()
    {
        return beverage.getBeverageSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost()
    {
        double cost = beverage.cost();

        switch (beverageSize())
        {
            case SMALL:
                cost += 0.20D;
                break;
            case AVERAGE:
                cost += 0.25D;
                break;
            case BIG:
                cost += 0.30D;
                break;
        }

        return cost;
    }
}
