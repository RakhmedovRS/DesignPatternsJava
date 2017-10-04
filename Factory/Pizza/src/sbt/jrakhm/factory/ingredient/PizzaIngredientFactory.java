package sbt.jrakhm.factory.ingredient;

import sbt.jrakhm.factory.ingredient.ingredients.*;

/**
 * @author rassoll
 * @ created 30.05.2017
 * @ $Author$
 * @ $Revision$
 */
public interface PizzaIngredientFactory
{
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
