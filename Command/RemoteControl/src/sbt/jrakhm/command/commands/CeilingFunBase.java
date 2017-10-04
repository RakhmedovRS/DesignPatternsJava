package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.CeilingFan;
import sbt.jrakhm.command.controls.types.FanSpeed;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFunBase implements Command
{
    CeilingFan ceilingFan;
    FanSpeed prevFanSpeed;

    @Override
    public void execute()
    {
        prevFanSpeed = ceilingFan.getSpeed();
    }

    @Override
    public void undo()
    {
        switch (prevFanSpeed)
        {
            case HIGH:
                ceilingFan.high();
                System.out.println("The ceiling fan speed was returned to: " + prevFanSpeed.getFanSpeed());
                break;
            case MEDIUM:
                ceilingFan.medium();
                System.out.println("The ceiling fan speed was returned to: " + prevFanSpeed.getFanSpeed());
                break;
            case LOW:
                ceilingFan.low();
                System.out.println("The ceiling fan speed was returned to: " + prevFanSpeed.getFanSpeed());
                break;
            case ZERO_SPEED:
                ceilingFan.off();
                System.out.println("The ceiling fan speed was returned to: " + prevFanSpeed.getFanSpeed());
                break;
        }
    }
}
