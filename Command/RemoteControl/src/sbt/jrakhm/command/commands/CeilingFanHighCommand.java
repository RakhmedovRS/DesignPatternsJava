package sbt.jrakhm.command.commands;

import sbt.jrakhm.command.controls.controllers.CeilingFan;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFanHighCommand extends CeilingFunBase
{
    public CeilingFanHighCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        super.execute();
        ceilingFan.high();
    }
}
