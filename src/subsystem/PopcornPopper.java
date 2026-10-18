package subsystem;

public class PopcornPopper {
    private final String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("  [Popcorn] ON");
    }

    public void off() {
        System.out.println("  [Popcorn] OFF");
    }

    public void pop() {
        System.out.println("  [Popcorn] Popping popcorn...");
    }
}