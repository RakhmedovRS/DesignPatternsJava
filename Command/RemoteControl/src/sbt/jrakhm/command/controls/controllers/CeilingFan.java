package sbt.jrakhm.command.controls.controllers;

import sbt.jrakhm.command.controls.types.FanSpeed;
import sbt.jrakhm.command.controls.types.RoomType;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFan
{
    private static CeilingFan ceilingFan = null;

    protected FanSpeed fanSpeed;
    private RoomType roomType;

    private CeilingFan(RoomType roomType)
    {
        this.roomType = roomType;
    }

    public static CeilingFan getInstance(RoomType roomType)
    {
        if((ceilingFan == null) ||(ceilingFan.roomType != roomType))
            synchronized (GarageDoor.class)
            {
                ceilingFan = new CeilingFan(roomType);
            }
        return ceilingFan;
    }

    public void high()
    {
        fanSpeed = FanSpeed.HIGH;
        System.out.println("In the " + roomType.getDescription() + " ceiling fun speed set to: " + fanSpeed.getFanSpeed());
    }

    public void medium()
    {
        fanSpeed = FanSpeed.MEDIUM;
        System.out.println("In the " + roomType.getDescription() + " ceiling fun speed set to: " + fanSpeed.getFanSpeed());
    }

    public void low()
    {
        fanSpeed = FanSpeed.LOW;
        System.out.println("In the " + roomType.getDescription() + " ceiling fun speed set to: " + fanSpeed.getFanSpeed());
    }

    public FanSpeed getSpeed()
    {
        return fanSpeed;
    }

    public void off()
    {
        fanSpeed = FanSpeed.ZERO_SPEED;
        System.out.println("In the " + roomType.getDescription() + " ceiling fun speed set to: " + fanSpeed.getFanSpeed());
    }

}
