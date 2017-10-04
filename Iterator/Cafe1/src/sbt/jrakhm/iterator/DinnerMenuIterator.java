package sbt.jrakhm.iterator;

import java.util.Iterator;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class DinnerMenuIterator implements Iterator
{
    private MenuItem[] list;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems)
    {
        this.list = menuItems;
    }

    @Override
    public boolean hasNext()
    {
        if (position >= list.length || list[position] == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public Object next()
    {
        return list[position++];
    }

    @Override
    public void remove()
    {
        if (position <= 0)
        {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (list[position-1] != null)
        {
            for (int i = position - 1; i < (list.length - 1); i++ )
            {
                list[i] = list[i+1];
            }
            list[list.length -1 ] = null;
        }
    }
}
