package sbt.jrakhm.decorator.coffee;

import sbt.jrakhm.decorator.beverage.Beverage;

/**
 * @author rassoll
 * @ created 26.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "House Blend Coffee";
    }

    @Override
    public double cost()
    {
        double cost;

        switch (getBeverageSize())
        {
            case SMALL:
                cost = 0.60D;
                break;
            case AVERAGE:
                cost = 0.99D;
                break;
            case BIG:
                cost = 1.40D;
                break;
            default:
                cost = 0.99D;
                break;
        }

        return cost;
    }
}
