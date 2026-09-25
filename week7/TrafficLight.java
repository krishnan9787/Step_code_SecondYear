public class TrafficLight {
    // Requirements: final ID fixed at creation and private color state
    private final String id;
    private String color;

    // Expected Behavior: A new light starts on "RED"
    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED";
    }

    // Requirement: Provide a read-only way to check the current color
    public String getColor() {
        return this.color;
    }

    // Requirement: Provide a read-only way to check the ID
    public String getId() {
        return this.id;
    }

    // Requirement: Cycle strictly through RED -> GREEN -> YELLOW -> RED
    public void next() {
        if ("RED".equals(this.color)) {
            this.color = "GREEN";
        } else if ("GREEN".equals(this.color)) {
            this.color = "YELLOW";
        } else if ("YELLOW".equals(this.color)) {
            this.color = "RED";
        }
    }
}