package sbt.jrakhm.command.controls.types;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public enum GarageType
{
    MAIN("main garage"),
    GUEST("guest garage");

    private String description;

    GarageType(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
}
