package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.Light;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class LightOnCommand implements Command
{
    Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.on();
    }

    @Override
    public void undo()
    {
        light.off();
    }
}
