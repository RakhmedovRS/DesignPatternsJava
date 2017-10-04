package sbt.jrakhm.command.controls.controllers;

import sbt.jrakhm.command.controls.types.RoomType;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class Stereo
{
    private static Stereo stereo = null;
    private RoomType roomType;

    public static final Stereo getInstance(RoomType roomType)
    {

        if((stereo == null) || (stereo.roomType != roomType))
        {
            synchronized (Stereo.class)
            {
                stereo = new Stereo(roomType);
            }
        }

        return stereo;

    }

    private Stereo(RoomType roomType)
    {
        this.roomType = roomType;
    }

    public void on()
    {
        System.out.println("In the " + roomType.getDescription() + " stereo is ON");
    }

    public void off()
    {
        System.out.println("In the " + roomType.getDescription() + " stereo is OFF");
    }

    public void setCD()
    {
        System.out.println("In the " + roomType.getDescription() + "  a CD disc is inserted in the stereo");
    }

    public void setDVD()
    {
        System.out.println("In the " + roomType.getDescription() + " a DVD disc is inserted in the stereo");
    }

    public void setRadio()
    {
        System.out.println("In the " + roomType.getDescription() + " a radio station is installed in the stereo");
    }

    public void setVolume(int volume)
    {
        System.out.println("In the " + roomType.getDescription() + " stereo volume is set to volume:" + volume);
    }
}
