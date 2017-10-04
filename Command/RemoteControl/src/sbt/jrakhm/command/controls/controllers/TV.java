package sbt.jrakhm.command.controls.controllers;

import sbt.jrakhm.command.controls.types.RoomType;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class TV
{
    private static TV tv = null;
    private RoomType roomType;

    public static TV getInstance(RoomType roomType)
    {
        if((tv == null) ||(tv.roomType != roomType))
        {
            synchronized (Light.class)
            {
                tv = new TV(roomType);
            }
        }

        return tv;
    }

    private TV(RoomType roomType)
    {
        this.roomType = roomType;
    }

    public void on()
    {
        System.out.println("In the " + roomType.getDescription() + " TV is ON");
    }

    public void off()
    {
        System.out.println("In the " + roomType.getDescription() + " TV is OFF");
    }
}
