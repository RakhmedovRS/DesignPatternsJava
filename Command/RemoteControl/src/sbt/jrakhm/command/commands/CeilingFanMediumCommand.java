package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.CeilingFan;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFanMediumCommand extends CeilingFunBase
{
    public CeilingFanMediumCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        super.execute();
        ceilingFan.medium();
    }
}
