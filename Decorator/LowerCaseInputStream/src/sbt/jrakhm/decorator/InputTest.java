package sbt.jrakhm.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author rassoll
 * @ created 26.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class InputTest
{
    public static void main(String[] args) throws IOException
    {
        int c;
        try
        {
            // TODO rrs: 26.05.2017 Change filepath 
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("!put path here!")));
            while((c = in.read())>= 0)
            {
                System.out.print((char)c);
            }

            in.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
