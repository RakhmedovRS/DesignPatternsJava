package sbt.jrakhm.composite;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class CompositeMenuTestDrive
{
    public static void main(String[] args)
    {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99D));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99D));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49D));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.49D));

        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice sourdough bread", true, 3.89D));

        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99D));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69D));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", false, 4.29D));

        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
        cafeMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59D));

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
