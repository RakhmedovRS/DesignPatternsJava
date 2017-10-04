package sbt.jrakhm.templatemethod.beverage;

/**
 * @author rassoll
 * @created 08.06.2017
 * @$Author$
 * @$Revision$
 */
public abstract class CaffeineBeverage
{
    public final void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater()
    {
        System.out.println("Boiling water");
    }

    void pourInCup()
    {
        System.out.println("Pouring into cup");
    }
}
