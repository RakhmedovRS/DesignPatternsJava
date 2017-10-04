package sbt.jrakhm.composite;

import java.util.Iterator;

/**
 * @author rassoll
 * @created 25.08.2017
 * @$Author$
 * @$Revision$
 */
public class NullIterator implements Iterator
{
    @Override
    public boolean hasNext()
    {
        return false;
    }

    @Override
    public Object next()
    {
        return null;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
