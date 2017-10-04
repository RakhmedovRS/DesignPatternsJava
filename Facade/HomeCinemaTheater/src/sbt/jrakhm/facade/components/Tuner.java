package sbt.jrakhm.facade.components;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class Tuner
{
    private Amplifier amplifier;

    public Tuner(Amplifier amplifier)
    {
        this.amplifier = amplifier;
    }

    public void on()
    {
        System.out.println("Tuner on");
    }

    public void off()
    {
        System.out.println("Tuner off");
    }

    public void setAm()
    {
        System.out.println("AM Tuner channel is set");
    }

    public void setFm()
    {
        System.out.println("FM Tuner channel is set");
    }

    public void setFrequency(int frequency)
    {
        System.out.println("Tuner frequency set to " + frequency);
    }

    @Override
    public String toString()
    {
        return "Top-O-Line Tuner";
    }
}
