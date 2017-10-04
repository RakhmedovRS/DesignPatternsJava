package sbt.jrakhm.command.commands;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public interface Command
{
    void execute();
    void undo();
}
