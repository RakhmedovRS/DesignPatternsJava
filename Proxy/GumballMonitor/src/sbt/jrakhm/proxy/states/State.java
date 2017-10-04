package sbt.jrakhm.proxy.states;

import java.io.Serializable;

/**
 * @author rassoll
 * @created 31.08.2017
 * @$Author$
 * @$Revision$
 */
public interface State extends Serializable
{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
