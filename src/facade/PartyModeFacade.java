package facade;

import subsystem.*;

public class PartyModeFacade {

    private final Amplifier amp;
    private final TheaterLights lights;
    private final StreamingPlayer streaming;

    public PartyModeFacade(Amplifier amp,
                           TheaterLights lights,
                           StreamingPlayer streaming) {
        this.amp = amp;
        this.lights = lights;
        this.streaming = streaming;
    }

    public void startParty(String playlist) {
        if (playlist == null || playlist.isBlank()) {
            throw new IllegalArgumentException("Playlist name must not be empty");
        }

        System.out.println("\n=== Party mode ON ===");
        lights.on();
        lights.dim(50);
        amp.on();
        amp.setStreamingPlayer(streaming);
        amp.setSurroundSound();
        amp.setVolume(40);
        streaming.on();
        streaming.play(playlist);
        System.out.println("=== Party started! Dance! ===\n");
    }

    public void stopParty() {
        System.out.println("\n=== Party ended. ===");
        streaming.stop();
        streaming.off();
        amp.off();
        lights.off();
        System.out.println("=== System is off. ===\n");
    }
}