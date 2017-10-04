package sbt.jrakhm.facade.components;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class CdPlayer
{
    private Amplifier amplifier;
    private String cdName;

    public CdPlayer(Amplifier amplifier)
    {
        this.amplifier = amplifier;
    }

    public void on()
    {
        System.out.println("Top-O-Line CD Player on");
    }

    public void off()
    {
        System.out.println("Top-O-Line CD Player off");
    }

    public void eject()
    {
        System.out.println("Top-O-Line CD Player exect");
    }

    public void pause()
    {
        System.out.println("Top-O-Line CD Player on");
    }

    public void play(String cdName)
    {
        this.cdName = cdName;
        System.out.println("Top-O-Line CD Player playng: " + cdName);
    }

    public void stop()
    {
        System.out.println("Top-O-Line CD Player stopped: " + cdName);
    }

    @Override
    public String toString()
    {
        return "Top-O-Line CD Player";
    }
}
