package sbt.jrakhm.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class PancakeHouseMenu implements Menu
{
    private ArrayList menuItems;

    public PancakeHouseMenu()
    {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99D);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99D);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49D);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.49D);
}

    public void addItem(String name, String description, boolean vegetarian, double price)
    {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator createIterator()
    {
        return menuItems.iterator();
    }
}
