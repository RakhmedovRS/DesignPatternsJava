package sbt.jrakhm.templatemethod;

import sbt.jrakhm.templatemethod.beverage.CoffeeWithHook;
import sbt.jrakhm.templatemethod.beverage.TeaWithHook;

/**
 * @author rassoll
 * @created 08.06.2017
 * @$Author$
 * @$Revision$
 */
public class BeverageTestDrive
{
    public static void main(String[] args)
    {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
