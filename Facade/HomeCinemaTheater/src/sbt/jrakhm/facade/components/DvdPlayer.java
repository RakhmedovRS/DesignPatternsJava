package sbt.jrakhm.facade.components;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class DvdPlayer
{
    private Amplifier amplifier;
    private String movieName;

    public DvdPlayer(Amplifier amplifier)
    {
        this.amplifier = amplifier;
    }

    public void on()
    {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void off()
    {
        System.out.println("Top-O-Line DVD Player off");
    }

    public void eject()
    {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void pause()
    {
        System.out.println("Top-O-Line DVD Player pause");
    }

    public void play(String movieName)
    {
        this.movieName = movieName;
        System.out.println("Top-O-Line DVD Player playng: " + movieName);
    }

    public void setSurroundAudio()
    {
        amplifier.setSurroundSound();
    }

    public void setTwoChannelAudio()
    {
        amplifier.setStereoSound();
    }

    public void stop()
    {
        System.out.println("Top-O-Line DVD Player stopped: " + movieName);
    }

    @Override
    public String toString()
    {
        return "Top-O-Line DVD Player";
    }
}
