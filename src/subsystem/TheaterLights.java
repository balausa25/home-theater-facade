package subsystem;

public class TheaterLights {
    private final String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("  [Lights] ON");
    }

    public void off() {
        System.out.println("  [Lights] OFF");
    }

    public void dim(int level) {
        System.out.println("  [Lights] Dimmed to " + level + "%");
    }
}
