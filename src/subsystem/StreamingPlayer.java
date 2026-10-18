package subsystem;

public class StreamingPlayer {
    private final String description;

    public StreamingPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("  [Streaming] ON: " + description);
    }

    public void off() {
        System.out.println("  [Streaming] OFF");
    }

    public void play(String movie) {
        System.out.println("  [Streaming] Streaming: \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("  [Streaming] Streaming stopped");
    }
}