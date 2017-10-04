package sbt.jrakhm.facade.components;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class TheaterLights
{
    public void on()
    {
        System.out.println("Theater Ceiling Ligths on");
    }

    public void off()
    {
        System.out.println("Theater Ceiling Ligths off");
    }

    public void dim(int value)
    {
        System.out.println("Theater Ceiling Ligths dimming to: " + value);
    }
}
