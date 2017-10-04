package sbt.jrakhm.factory.pizza;

import sbt.jrakhm.factory.ingredient.PizzaIngredientFactory;

/**
 * @author rassoll
 * @ created 30.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class VeggiePizza extends Pizza
{
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory)
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
        veggies = pizzaIngredientFactory.createVeggies();
    }

    @Override
    public String toString()
    {
        return PizzaType.VEGGIE.getName();
    }
}
