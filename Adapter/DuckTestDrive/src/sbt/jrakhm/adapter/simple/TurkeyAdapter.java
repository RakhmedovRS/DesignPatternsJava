package sbt.jrakhm.adapter.simple;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class TurkeyAdapter implements Duck
{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey = turkey;
    }

    @Override
    public void quack()
    {
        turkey.gobble();
    }

    @Override
    public void fly()
    {
        for (int i = 0; i < 5; i++)
        {
            turkey.fly();
        }
    }
}
