package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.GarageDoor;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class GarageDoorUpCommand implements Command
{
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.up();
        garageDoor.stop();
    }

    @Override
    public void undo()
    {
        garageDoor.down();
        garageDoor.stop();
    }
}
