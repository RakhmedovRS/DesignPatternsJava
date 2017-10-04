package sbt.jrakhm.factory.pizza;

/**
 * @author rassoll
 * @ created 30.05.2017
 * @ $Author$
 * @ $Revision$
 */
public enum PizzaType
{
    CHEESE("Cheese"),
    VEGGIE("Veggie"),
    CLAM("Clam"),
    PEPPERONI("Pepperoni");

    private String name;

    PizzaType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
