package sbt.jrakhm.iterator;

import java.util.Iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class DinnerMenu implements Menu
{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu()
    {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99D);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99D);
        addItem("Soup of the day", "Soup of the day with a side of potato salad", false, 3.29D);
        addItem("Hotdog", "A hot dog with saurkraut, relish, onions, topped with cheese", false, 3.29D);
    }

    public void addItem(String name, String description, boolean vegetarian, double price)
    {
        if (numberOfItems >= MAX_ITEMS)
        {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        }
        else
        {
            menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
        }
    }

    @Override
    public Iterator createIterator()
    {
        return new DinnerMenuIterator(menuItems);
    }
}
