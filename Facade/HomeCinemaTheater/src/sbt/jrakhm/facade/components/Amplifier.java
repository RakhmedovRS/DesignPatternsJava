package sbt.jrakhm.facade.components;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class Amplifier
{
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Tuner tuner;

    public void on()
    {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off()
    {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setCD(CdPlayer cdPlayer)
    {
        this.cdPlayer = cdPlayer;
        System.out.println("Top-O-Line Amplifier setting CD Player to " + cdPlayer.toString());
    }

    public void setDVD(DvdPlayer dvdPlayer)
    {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Top-O-Line Amplifier setting DVD Player to " + dvdPlayer.toString());
    }

    public void setSurroundSound()
    {
        System.out.println("Top-O-Line Amplifier surround sound on(5 speakers, 1 subwoofer)");
    }

    public void setStereoSound()
    {
        System.out.println("Top-O-Line Amplifier stereo sound on");
    }

    public void setTuner(Tuner tuner)
    {
        this.tuner = tuner;
        System.out.println("Top-O-Line Amplifier setting Tuner to " + tuner.toString());
    }

    public void setVolume(int volume)
    {
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }

}
