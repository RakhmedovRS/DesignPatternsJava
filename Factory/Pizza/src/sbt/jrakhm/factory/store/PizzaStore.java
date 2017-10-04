package sbt.jrakhm.factory.store;

import sbt.jrakhm.factory.pizza.Pizza;
import sbt.jrakhm.factory.pizza.PizzaType;

/**
 * @author rassoll
 * @ created 29.05.2017
 * @ $Author$
 * @ $Revision$
 */
public abstract class PizzaStore
{
    public Pizza orderPizza(PizzaType pizzaType)
    {
        Pizza pizza;

        pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
