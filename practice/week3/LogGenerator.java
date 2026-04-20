package practice.week3;

public class LogGenerator {
    public static  void main (String[] args) {
        System.out.println("=== GENERATING 10 FAKE LOGS ===");
        System.out.println("");

        int errorCount = 0;

        for (int i = 0; i < 10; i++) {
            int logId = i +1;

            // Every 3rd log is ERROR, every 3rd+1 is WARN, rest INFO
            String level;
            if (i % 3 == 0) {
                level = "ERROR";
                errorCount++;
            } else if (i % 3 == 1) {
                level = "WARN";
            } else {
                level = "INFO";
            }
            System.out.println("Log #" + logId + " [" + level + "] PaymentService | Entry generated");
        }

        System.out.println("");
        System.out.println("Total logs generated: 10");

        System.out.println("Errors found: " + errorCount);

    }
}
