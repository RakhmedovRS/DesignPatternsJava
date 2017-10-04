package sbt.jrakhm.command.controls.controllers;

import sbt.jrakhm.command.controls.types.GarageType;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class GarageDoor
{
    private static GarageDoor garageDoor = null;
    private GarageType garageType;

    public static GarageDoor getInstance(GarageType garageType)
    {
        if((garageDoor == null) ||(garageDoor.garageType != garageType))
            synchronized (GarageDoor.class)
            {
                garageDoor = new GarageDoor(garageType);
            }
        return garageDoor;
    }

    private GarageDoor(GarageType garageType)
    {
        this.garageType = garageType;
    }

    public void up()
    {
        System.out.println("In the " + garageType.getDescription() + " door is UP");
    }

    public void down()
    {
        System.out.println("In the " + garageType.getDescription() + " door is DOWN");
    }

    public void stop()
    {
        System.out.println("In the " + garageType.getDescription() + " door STOPPED");
    }

    public void lightOn()
    {
        System.out.println("In the " + garageType.getDescription() + " light in the Garage is ON");
    }

    public void lightOff()
    {
        System.out.println("In the " + garageType.getDescription() + " light in the Garage is OFF");
    }
}
