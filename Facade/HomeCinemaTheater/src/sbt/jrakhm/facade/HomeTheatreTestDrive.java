package sbt.jrakhm.facade;

import sbt.jrakhm.facade.components.*;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class HomeTheatreTestDrive
{
    public static void main(String[] args)
    {
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer(amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer(amplifier);
        Tuner tuner = new Tuner(amplifier);
        Projector projector = new Projector();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, lights, screen, popper);

        homeTheatreFacade.watchMovie("Star wars");
        homeTheatreFacade.endMovie();
    }
}
