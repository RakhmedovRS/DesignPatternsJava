package sbt.jrakhm.factory;

import sbt.jrakhm.factory.pizza.Pizza;
import sbt.jrakhm.factory.pizza.PizzaType;
import sbt.jrakhm.factory.store.PizzaStore;
import sbt.jrakhm.factory.store.chicago.ChicagoPizzaStore;
import sbt.jrakhm.factory.store.newyork.NYPizzaStore;

/**
 * @author rassoll
 * @ created 29.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class PizzaTestDrive
{
    public static void main(String[] args)
    {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
