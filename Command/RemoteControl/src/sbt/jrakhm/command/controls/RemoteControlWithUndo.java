package sbt.jrakhm.command.controls;

import sbt.jrakhm.command.commands.Command;
import sbt.jrakhm.command.commands.NoCommand;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class RemoteControlWithUndo
{
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo()
    {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    public void onButtonWasPressed(int slot)
    {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot)
    {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed()
    {
        undoCommand.undo();
    }

    @Override
    public String toString()
    {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++)
        {
            stringBuffer.append("[slot " + i+ "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
