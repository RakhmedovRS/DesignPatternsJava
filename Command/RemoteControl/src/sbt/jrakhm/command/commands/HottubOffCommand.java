package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.Hottub;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class HottubOffCommand implements Command
{
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub)
    {
        this.hottub = hottub;
    }

    @Override
    public void execute()
    {
        hottub.off();
    }

    @Override
    public void undo()
    {
        hottub.on();
    }
}
