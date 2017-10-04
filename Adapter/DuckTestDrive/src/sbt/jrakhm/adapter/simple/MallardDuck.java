package sbt.jrakhm.adapter.simple;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class MallardDuck implements Duck
{
    @Override
    public void quack()
    {
        System.out.println("Quack");
    }

    @Override
    public void fly()
    {
        System.out.println("I'm flying");
    }
}
