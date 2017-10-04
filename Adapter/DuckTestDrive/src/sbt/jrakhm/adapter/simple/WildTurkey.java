package sbt.jrakhm.adapter.simple;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class WildTurkey implements Turkey
{
    @Override
    public void gobble()
    {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly()
    {
        System.out.println("I'm flying a short");
    }
}
