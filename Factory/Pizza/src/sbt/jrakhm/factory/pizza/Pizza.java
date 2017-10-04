package sbt.jrakhm.factory.pizza;

import sbt.jrakhm.factory.ingredient.ingredients.*;

import java.util.ArrayList;

/**
 * @author rassoll
 * @ created 29.05.2017
 * @ $Author$
 * @ $Revision$
 */
public abstract  class Pizza
{
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    ArrayList toppings = new ArrayList();

    public abstract void prepare();

    public void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut()
    {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addTopping(String topping)
    {
        toppings.add(topping);
    }
}
