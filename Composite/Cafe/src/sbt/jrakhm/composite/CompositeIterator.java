package sbt.jrakhm.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author rassoll
 * @created 25.08.2017
 * @$Author$
 * @$Revision$
 */
public class CompositeIterator implements Iterator
{
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator)
    {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext()
    {
        if (stack.isEmpty())
        {
            return false;
        }
        else
        {
            Iterator iterator = (Iterator)stack.peek();
            if (!iterator.hasNext())
            {
                stack.pop();
                return hasNext();
            }
            else
            {
                return true;
            }
        }
    }

    @Override
    public Object next()
    {
        if (hasNext())
        {
            Iterator iterator = (Iterator)stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if (component instanceof Menu)
            {
                stack.push(component.createIterator());

            }
            return component;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
