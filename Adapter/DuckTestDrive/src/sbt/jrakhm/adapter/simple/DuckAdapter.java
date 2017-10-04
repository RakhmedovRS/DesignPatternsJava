package sbt.jrakhm.adapter.simple;

import java.util.Random;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class DuckAdapter implements Turkey
{
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck)
    {
        this.duck = duck;
        random = new Random(5);
    }

    @Override
    public void gobble()
    {
        duck.quack();
    }

    @Override
    public void fly()
    {
        if (random.nextInt() == 5)
        {
            duck.fly();
        }
    }
}
