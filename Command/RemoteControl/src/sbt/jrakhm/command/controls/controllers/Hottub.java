package sbt.jrakhm.command.controls.controllers;

import sbt.jrakhm.command.controls.types.RoomType;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class Hottub
{
    private static Hottub hottub = null;

    public static Hottub getInstance()
    {
        if(hottub == null)
        {
            synchronized (Light.class)
            {
                hottub = new Hottub();
            }
        }

        return hottub;
    }

    private Hottub()
    {

    }

    public void on()
    {
        System.out.println("Hottub is ON");
    }

    public void off()
    {
        System.out.println("Hottub is OFF");
    }
}
