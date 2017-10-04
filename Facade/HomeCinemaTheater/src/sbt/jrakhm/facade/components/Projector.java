package sbt.jrakhm.facade.components;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class Projector
{
    private DvdPlayer dvdPlayer;

    public void on()
    {
        System.out.println("Top-O-Line projector on");
    }

    public void off()
    {
        System.out.println("Top-O-Line projector on");
    }

    public void tvMode()
    {
        System.out.println("Top-O-Line projector in tv mode");
    }

    public void wideScreenMode()
    {
        System.out.println("Top-O-Line projector in widescreen mode (16x9 aspect ration)");
    }
}
