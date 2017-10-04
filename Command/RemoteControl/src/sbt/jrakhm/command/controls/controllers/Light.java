package sbt.jrakhm.command.controls.controllers;

import sbt.jrakhm.command.controls.types.RoomType;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class Light
{
    private static Light ligth = null;
    private RoomType roomType;

    public static Light getInstance(RoomType roomType)
    {
        if((ligth == null) ||(ligth.roomType != roomType))
        {
            synchronized (Light.class)
            {
                ligth = new Light(roomType);
            }
        }

        return ligth;
    }

    private Light(RoomType roomType)
    {
        this.roomType = roomType;
    }

    public void on()
    {
        System.out.println("In the " + roomType.getDescription() + " light is ON");
    }

    public void off()
    {
        System.out.println("In the " + roomType.getDescription() + " light is OFF");
    }
}
