package sbt.jrakhm.decorator.coffee;

import sbt.jrakhm.decorator.beverage.Beverage;

/**
 * @author rassoll
 * @ created 26.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class Espresso extends Beverage
{
    public Espresso()
    {
        description = "Espresso";
    }

    @Override
    public double cost()
    {
        double cost;

        switch (getBeverageSize())
        {
            case SMALL:
                cost = 1.00D;
                break;
            case AVERAGE:
                cost = 1.70D;
                break;
            case BIG:
                cost = 1.99D;
                break;
            default:
                cost = 1.70D;
                break;
        }

        return cost;
    }
}
