package sbt.jrakhm.composite;

import java.util.Iterator;

/**
 * @author rassoll
 * @created 25.08.2017
 * @$Author$
 * @$Revision$
 */
public abstract class MenuComponent
{
    public Iterator createIterator()
    {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i)
    {
        throw new UnsupportedOperationException();
    }

    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }

    public double getPrice()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian()
    {
        throw new UnsupportedOperationException();
    }

    public void print()
    {
        throw new UnsupportedOperationException();
    }
}
