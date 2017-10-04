package sbt.jrakhm.iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class MenuItem
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

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return price;
    }
}
