// Define the ExamHall class
class ExamHall {
    String hallName;
    int seatsFilled;

    // Constructor to initialize the hall name
    public ExamHall(String hallName) {
        this.hallName = hallName;
        this.seatsFilled = 0; // Starts at 0 by default
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Create two ExamHall objects with different hallName values
        ExamHall hallA = new ExamHall("Block-3 Hall A");
        ExamHall hallB = new ExamHall("Block-3 Hall B");

        // 2. Increase seatsFilled for hallA only, four separate times
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        // 3. Print both halls' seatsFilled values to show independent state
        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}