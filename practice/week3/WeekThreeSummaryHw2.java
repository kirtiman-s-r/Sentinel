package practice.week3;

public class WeekThreeSummaryHw2 {
    public static void main(String[] args) {
        System.out.println("=== SENTINEL LOG PROCESSOR ===\n");
        System.out.println("System initializing...");

        int systemCheck = 0;
        boolean isInitializationComplete = false;

        do {
            systemCheck++;
            if (systemCheck <= 2) {
                System.out.println("Check #" + systemCheck + " complete.");
            } else if (systemCheck == 3) {
                System.out.println("Check #" + systemCheck + " complete. System ready.");
                isInitializationComplete = true;
            }
        } while (!isInitializationComplete);

        System.out.println("\nProcessing 50 logs...\n");

        int totalLogsProcessed = 0;
        int errorCount = 0;
        int skippedLogs = 0;

        for (int i = 1; i <= 50; i++) {

            if (i % 20 == 0) {
                totalLogsProcessed = i;
                System.out.println("CRITICAL detected at Log #" + i + " - halting scan.");
                break;
            }

            if (i % 5 == 0) {
                skippedLogs++;
                continue;
            }

            totalLogsProcessed++;

            if (i % 3 == 0) {
                String service = (i % 2 == 0) ? "PaymentService" : "AuthService";
                errorCount++;
                System.out.println("[ERROR] " + service + " | Log #" + i + " - ALERT SENT");
            }
        }

        String systemCondition = errorCount > 0 ? "DEGRADED" : "HEALTHY";

        System.out.println("\n=== FINAL REPORT ===");
        System.out.println("Total processed: " + totalLogsProcessed);
        System.out.println("Errors found: " + errorCount);
        System.out.println("INFO skipped: " + skippedLogs);
        System.out.println("System status: " + systemCondition);




    }
}