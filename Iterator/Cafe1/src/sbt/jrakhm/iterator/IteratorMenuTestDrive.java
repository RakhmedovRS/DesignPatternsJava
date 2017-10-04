package sbt.jrakhm.iterator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author rassoll
 * @created 24.08.2017
 * @$Author$
 * @$Revision$
 */
public class IteratorMenuTestDrive
{
    public static void main(String[] args)
    {
        new Waitress(new ArrayList(Arrays.asList(new PancakeHouseMenu(), new DinnerMenu(), new CafeMenu()))).printMenu();
    }
}
