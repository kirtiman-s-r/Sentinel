package practice;
// test code only for understanding
public class NestedIfExamples {
    public static void main (String[] args) {
        if (age >= 18) { // Door 1: Age

            if (isHandicap) { // Door 2: Handicap

                // --- DOOR 3: The "Deep" Check ---
                if (isFaking) {
                    System.out.println("Wait... you are faking! No special booth for you.");
                }
                else {
                    System.out.println("Proceed to Booth A (Accessible)");
                }
                // --- End of Door 3 ---

            } else if (isSeniorCitizen) {
                System.out.println("Proceed to Booth B (Express)");
            } else {
                System.out.println("General Booth");
            }

        } else {
            System.out.println("Too young.");
        }
    }
}
