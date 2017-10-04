package sbt.jrakhm.state.states;

/**
 * @author rassoll
 * @created 31.08.2017
 * @$Author$
 * @$Revision$
 */
public interface State
{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispence();
}
