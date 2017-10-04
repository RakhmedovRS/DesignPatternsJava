package sbt.jrakhm.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class CafeMenu implements Menu
{
    private Hashtable menuItems = new Hashtable();

    public CafeMenu()
    {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99D);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69D);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", false, 4.29D);
    }

    public void addItem(String name, String description, boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator()
    {
        return menuItems.values().iterator();
    }
}
