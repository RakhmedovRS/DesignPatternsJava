package sbt.jrakhm.composite;

import java.util.Iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class Waitress
{
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus)
    {
        this.allMenus = allMenus;
    }

    public void printMenu()
    {
        allMenus.print();
    }

    public void printVegetarianMenu()
    {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext())
        {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try
            {
                if (menuComponent.isVegetarian())
                {
                    menuComponent.print();
                }
            }
            catch (UnsupportedOperationException e)
            {}
        }
    }
}
