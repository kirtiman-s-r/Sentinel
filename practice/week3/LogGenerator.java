package practice.week3;

public class LogGenerator {
    public static  void main (String[] args) {
        System.out.println("=== GENERATING 10 FAKE LOGS ===");
        System.out.println("");

        int errorCount = 0;
        int warnCount = 0;
        String service = "HI";

        for (int i = 0; i < 20; i++) {
            int logId = i +1;

            if (i < 10) {
                service = "Payment" +
                        "Service";
            } else if (i >= 10) {
                service = "AuthService";
            }


            // Every 3rd log is ERROR, every 3rd+1 is WARN, rest INFO
            String level;
            if (i % 3 == 0) {
                level = "ERROR";
                errorCount++;
            } else if (i % 3 == 1) {
                level = "WARN";
                warnCount++;
            } else {
                level = "INFO";
            }
            System.out.println("Log #" + logId + " [" + level + "] " + service + " | " + "Entry generated");
        }

        System.out.println("");
        System.out.println("Total logs generated: 20");

        System.out.println("Errors found: " + errorCount);
        System.out.println("Warning Counts: " + warnCount);

    }
}
