package facade;

import subsystem.*;

/**
 * Main Facade — reduces the complex process of watching a movie
 * to two simple methods: watchMovie() and endMovie().
 *
 * The client never touches the subsystem classes directly;
 * it only calls this Facade.
 */
public class HomeTheaterFacade {

    private final Amplifier amp;
    private final DvdPlayer dvd;
    private final Projector projector;
    private final Screen screen;
    private final TheaterLights lights;
    private final PopcornPopper popper;
    private final StreamingPlayer streaming;

    public HomeTheaterFacade(Amplifier amp,
                             DvdPlayer dvd,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper,
                             StreamingPlayer streaming) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
        this.streaming = streaming;
    }


    public void watchMovie(String movie) {
        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException("Movie title must not be empty");
        }

        System.out.println("\n=== Preparing to watch: \"" + movie + "\" ===");
        try {
            popper.on();
            popper.pop();
            lights.dim(10);
            screen.down();
            projector.on();
            projector.wideScreenMode();
            amp.on();
            amp.setDvd(dvd);
            amp.setSurroundSound();
            amp.setVolume(25);
            dvd.on();
            dvd.play(movie);
            System.out.println("=== Movie started. Enjoy! ===\n");
        } catch (RuntimeException e) {
            System.err.println("ERROR: Could not start the movie: " + e.getMessage());
            endMovie();
            throw e;
        }
    }

    public void watchStreaming(String movie) {
        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException("Movie title must not be empty");
        }

        System.out.println("\n=== Streaming: \"" + movie + "\" ===");
        lights.dim(15);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(streaming);
        amp.setSurroundSound();
        amp.setVolume(20);
        streaming.on();
        streaming.play(movie);
        System.out.println("=== Streaming started. ===\n");
    }

    public void endMovie() {
        System.out.println("\n=== Movie ended. Shutting down... ===");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
        streaming.stop();
        streaming.off();
        System.out.println("=== System is off. Good night! ===\n");
    }
}