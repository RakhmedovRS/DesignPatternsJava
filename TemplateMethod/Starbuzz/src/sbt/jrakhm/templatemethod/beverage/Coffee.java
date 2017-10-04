package sbt.jrakhm.templatemethod.beverage;

/**
 * @author rassoll
 * @created 08.06.2017
 * @$Author$
 * @$Revision$
 */
public class Coffee extends CaffeineBeverage
{
    @Override
    void brew()
    {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments()
    {
        System.out.println("Adding Sugar and Milk");
    }
}
