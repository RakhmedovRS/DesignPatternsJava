package sbt.jrakhm.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class Waitress
{
    ArrayList menus;

    public Waitress(ArrayList menus)
    {
        this.menus = menus;
    }

    public void printMenu()
    {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext())
        {
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator)
    {
        while (iterator.hasNext())
        {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(String.format("%s, %s -- %s", menuItem.getName(), menuItem.getDescription(), menuItem.getPrice()));
        }
    }
}
