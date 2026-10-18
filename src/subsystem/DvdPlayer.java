package subsystem;

public class DvdPlayer {
    private final String description;
    private int currentTrack;

    public DvdPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("  [DVD] ON: " + description);
    }

    public void off() {
        System.out.println("  [DVD] OFF");
    }

    public void play(String movie) {
        currentTrack = 1;
        System.out.println("  [DVD] Playing: \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("  [DVD] Stopped");
    }

    public void eject() {
        System.out.println("  [DVD] Disc ejected");
    }
}