package subsystem;

public class Projector {
    private final String description;
    private final DvdPlayer dvd;

    public Projector(String description, DvdPlayer dvd) {
        this.description = description;
        this.dvd = dvd;
    }

    public void on() {
        System.out.println("  [Projector] ON: " + description);
    }

    public void off() {
        System.out.println("  [Projector] OFF");
    }

    public void wideScreenMode() {
        System.out.println("  [Projector] Wide-screen mode (16:9)");
    }

    public void tvMode() {
        System.out.println("  [Projector] TV mode (4:3)");
    }
}