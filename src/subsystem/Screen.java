package subsystem;

public class Screen {
    private final String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println("  [Screen] Raised");
    }

    public void down() {
        System.out.println("  [Screen] Lowered");
    }
}