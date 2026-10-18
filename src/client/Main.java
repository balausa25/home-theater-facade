package client;

import facade.HomeTheaterFacade;
import facade.PartyModeFacade;
import subsystem.*;

public class Main {
    public static void main(String[] args) {


        Amplifier amp = new Amplifier("Sony 5.1 Amplifier");
        DvdPlayer dvd = new DvdPlayer("Sony DVD Player");
        Projector projector = new Projector("Epson 4K Projector", dvd);
        Screen screen = new Screen("120\" Motorized Screen");
        TheaterLights lights = new TheaterLights("Philips Hue");
        PopcornPopper popper = new PopcornPopper("Popcorn Machine");
        StreamingPlayer streaming = new StreamingPlayer("Netflix 4K");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amp, dvd, projector, screen, lights, popper, streaming);

        PartyModeFacade partyMode = new PartyModeFacade(amp, lights, streaming);


        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();


        homeTheater.watchStreaming("Stranger Things");
        homeTheater.endMovie();


        partyMode.startParty("Best of 2024 Hits");
        partyMode.stopParty();
    }
}
