package subsystem;

public class Amplifier {
    private final String description;
    private DvdPlayer dvd;
    private StreamingPlayer streaming;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("  [Amplifier] ON: " + description);
    }

    public void off() {
        System.out.println("  [Amplifier] OFF");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("  [Amplifier] DVD input selected");
    }

    public void setStreamingPlayer(StreamingPlayer streaming) {
        this.streaming = streaming;
        System.out.println("  [Amplifier] Streaming input selected");
    }

    public void setSurroundSound() {
        System.out.println("  [Amplifier] Surround sound (5.1) enabled");
    }

    public void setVolume(int level) {
        System.out.println("  [Amplifier] Volume set to " + level);
    }
}
