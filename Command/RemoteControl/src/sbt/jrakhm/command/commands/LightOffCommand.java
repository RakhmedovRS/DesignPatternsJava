package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.Light;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class LightOffCommand implements Command
{
    Light light;

    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.off();
    }

    @Override
    public void undo()
    {
        light.on();
    }
}
