package sbt.jrakhm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author rassoll
 * @created 20.09.2017
 * @$Author$
 * @$Revision$
 */
public class OwnerInvocationHandler implements InvocationHandler
{
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean)
    {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws IllegalAccessException
    {
        try
        {
            if (method.getName().startsWith("get"))
            {
                return method.invoke(personBean, args);
            }
            else if (method.getName().equals("setHotOrNotRating"))
            {
                throw new IllegalAccessException();
            }
            else if (method.getName().startsWith("set"))
            {
                return method.invoke(personBean, args);
            }
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
