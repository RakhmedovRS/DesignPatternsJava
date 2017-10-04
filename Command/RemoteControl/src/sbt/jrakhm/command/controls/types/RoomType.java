package sbt.jrakhm.command.controls.types;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$ontrols
 */
public enum RoomType
{
    LIVING_ROOM("living room"),
    KITCHEN("kitchen"),
    GARAGE("garage");

    private String description;

    RoomType(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
}
