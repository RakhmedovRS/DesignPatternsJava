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
public class Whip extends CondimentDecorator
{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageSize beverageSize()
    {
        return beverage.getBeverageSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost()
    {
        double cost = beverage.cost();

        switch (beverageSize())
        {
            case SMALL:
                cost += 0.30D;
                break;
            case AVERAGE:
                cost += 0.4D;
                break;
            case BIG:
                cost += 0.50D;
                break;
        }

        return cost;
    }
}
