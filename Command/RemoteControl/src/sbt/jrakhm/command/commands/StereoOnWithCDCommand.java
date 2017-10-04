package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.Stereo;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class StereoOnWithCDCommand implements Command
{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }

    @Override
    public void execute()
    {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo()
    {
        stereo.off();
    }
}
