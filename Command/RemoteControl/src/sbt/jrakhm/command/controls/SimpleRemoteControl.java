package sbt.jrakhm.command.controls;

import sbt.jrakhm.command.commands.Command;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class SimpleRemoteControl
{
    Command slot;

    public SimpleRemoteControl()
    {
    }

    public void setCommand(Command command)
    {
        slot = command;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }
}
