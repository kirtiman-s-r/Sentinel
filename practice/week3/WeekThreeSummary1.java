package practice.week3;

public class WeekThreeSummary1 {
    public static void main(String[] args) {

        System.out.println("=== SENTINEL LOG PROCESSOR ===\n");
        System.out.println("System initializing...");

        int systemCheck = 0;
        boolean isInitializationComplete = false;

        do {
            systemCheck++;
            if (systemCheck <= 2) {
                System.out.println("Check #" +systemCheck + " complete.");
            } else if (systemCheck == 3) {
                System.out.println("Check #" + systemCheck + " complete. System ready.");
                isInitializationComplete = true;
            }

        } while (systemCheck <= 3 && !isInitializationComplete);

        System.out.println("\nProcessing 50 logs...\n");
        int totalLogsProcessed = 0;
        int errorCount = 0;
        int skippedLogs = 0;
        boolean isLogNumberExceed = false;

        for (int i = 1; i <=50; i++) {

            String errorType;

            if (i % 3 == 0) {
                errorType = "ERROR";
                errorCount++;
            } else if (i % 20 == 0) {
                errorType = "CRITICAL";
                isLogNumberExceed = true;
                System.out.println("CRITICAL detected at Log #" + i + " - halting scan.");
                break;
            } else if (i % 5 == 0) {
                errorType = "INFO";
                skippedLogs++;
                continue;
            }else{
                errorType = "WARN";
                continue;
            }
            totalLogsProcessed++;

            String service;
            if (i % 2 == 0) {
                service = "PaymentService";
            } else {
                service = "AuthService";
            }

            String decisionTaken = "";
            if (errorType.equals("ERROR")) {
                decisionTaken = "ALERT SENT";
            } else if (errorType.equals("CRITICAL")) {
                decisionTaken = "halting scan";
            }

            if (i <= 50 && !isLogNumberExceed ) {
                System.out.println("[" + errorType + "] " + service + " | "+ "Log #" + i+ " - " + decisionTaken);
            } else if  ((i <= 50 && !isLogNumberExceed )){
                System.out.println(errorType + " detected at Log #" + i + " - " + decisionTaken);
            }

        }

        String systemCondition = (errorCount > 0)? "DEGRADED" : "HEALTHY";

        System.out.println("\n=== FINAL REPORT ===");
        System.out.println("Total processes: " + totalLogsProcessed);
        System.out.println("Errors found: " + errorCount);
        System.out.println("INFO skipped: " + skippedLogs);
        System.out.println("System status: " + systemCondition);
    }
}