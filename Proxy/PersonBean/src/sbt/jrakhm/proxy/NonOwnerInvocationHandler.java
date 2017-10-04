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
public class NonOwnerInvocationHandler implements InvocationHandler
{
    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean)
    {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable
    {
        try
        {
            if (method.getName().startsWith("get"))
            {
                return method.invoke(personBean, args);
            }
            else if (method.getName().equals("setHotOrNotRating"))
            {
                return method.invoke(personBean, args);
            }
            else if (method.getName().startsWith("set"))
            {
                throw new IllegalAccessException();
            }
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
