package sbt.jrakhm.factory.store.newyork;

import sbt.jrakhm.factory.ingredient.PizzaIngredientFactory;
import sbt.jrakhm.factory.ingredient.newyork.NYPizzaIngredientFactory;
import sbt.jrakhm.factory.pizza.*;
import sbt.jrakhm.factory.store.PizzaStore;

/**
 * @author rassoll
 * @ created 29.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(PizzaType pizzaType)
    {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (pizzaType)
        {
            case CHEESE:
                pizza = new CheseePizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
