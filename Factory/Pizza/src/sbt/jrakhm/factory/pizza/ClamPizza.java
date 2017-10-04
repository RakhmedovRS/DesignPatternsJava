package sbt.jrakhm.factory.pizza;

import sbt.jrakhm.factory.ingredient.PizzaIngredientFactory;

/**
 * @author rassoll
 * @ created 30.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class ClamPizza extends Pizza
{
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory)
    {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
    }

    @Override
    public String toString()
    {
        return PizzaType.CHEESE.getName();
    }
}
