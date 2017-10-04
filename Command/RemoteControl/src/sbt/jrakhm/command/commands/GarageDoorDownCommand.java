package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.GarageDoor;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class GarageDoorDownCommand implements Command
{
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.down();
        garageDoor.stop();
    }

    @Override
    public void undo()
    {
        garageDoor.up();
        garageDoor.stop();
    }
}
