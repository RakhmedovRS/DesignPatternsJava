package sbt.jrakhm.composite;

import java.util.Iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class MenuItem extends MenuComponent
{
    private String name;
    private String description;
    private boolean vegetarians;
    private double price;

    public MenuItem(String name, String description, boolean vegetarians, double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarians = vegetarians;
        this.price = price;
    }

    @Override
    public Iterator createIterator()
    {
        return new NullIterator();
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public boolean isVegetarian()
    {
        return vegetarians;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    @Override
    public void print()
    {
        System.out.println(String.format(" %s%s, %s   \n-- %s", getName(), isVegetarian() == true ? "(v)":"", getPrice(), getDescription() ));
    }
}
