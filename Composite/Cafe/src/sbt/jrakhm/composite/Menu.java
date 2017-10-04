package sbt.jrakhm.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author rassoll
 * @created 25.08.2017
 * @$Author$
 * @$Revision$
 */
public class Menu extends MenuComponent
{
    private ArrayList menuComponents = new ArrayList();
    private String name;
    private String description;
    private Iterator iterator = null;

    public Menu(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    @Override
    public Iterator createIterator()
    {
        return iterator == null ? new CompositeIterator(menuComponents.iterator()) : iterator;
    }

    @Override
    public void add(MenuComponent menuComponent)
    {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent)
    {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i)
    {
        return (MenuComponent)menuComponents.get(i);
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
    public void print()
    {
        System.out.println(String.format("\n%s, %s \n------------ ", getName(), getDescription()));

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext())
        {
            ((MenuComponent)iterator.next()).print();
        }
    }
}
