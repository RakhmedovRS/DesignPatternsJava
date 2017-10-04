package sbt.jrakhm.factory.store.chicago;

import sbt.jrakhm.factory.ingredient.PizzaIngredientFactory;
import sbt.jrakhm.factory.ingredient.chicago.ChicagoPizzaIngredientFactory;
import sbt.jrakhm.factory.pizza.*;
import sbt.jrakhm.factory.store.PizzaStore;

/**
 * @author rassoll
 * @ created 29.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class ChicagoPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(PizzaType pizzaType)
    {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        switch (pizzaType)
        {
            case CHEESE:
                pizza = new CheseePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
