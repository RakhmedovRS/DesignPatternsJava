package sbt.jrakhm.factory.ingredient.chicago;

import sbt.jrakhm.factory.ingredient.PizzaIngredientFactory;
import sbt.jrakhm.factory.ingredient.ingredients.*;

/**
 * @author rassoll
 * @ created 30.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies()
    {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
