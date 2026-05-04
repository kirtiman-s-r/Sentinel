package practice.week3;

public class WeekThreeSummary {
    static void main(String[] args) {

        int systemCheck = 0;
        boolean isOk = false;
        int countLogs = 0;
        String info = "yo";
        int errorCount = 0;
        int skippedCount = 0;
        int totalCount = 0;


        System.out.println("=== SENTINEL LOG PROCESSOR ===\n");
        System.out.println("System initializing...");

        do {
            systemCheck++;
            String aPrint = "Check #" + systemCheck + " complete.";
            if (systemCheck <=2) {
                System.out.println(aPrint);
            } else if (systemCheck == 3) {
                System.out.println(aPrint + " System ready.");
                isOk = true;
            }
        } while (systemCheck <= 3 && !isOk);

        System.out.println("");
        System.out.println("Processing 50 logs\n");

        String service = "a";


        for (int i = 0; i <= 50; i++) {

            if (i % 3 == 0) {
                info = "ERROR";
                errorCount++;
            } else if (i % 4 == 0) {
                info = "CRITICAL";
                break;
            } else if (i % 5 == 0) {
                info = "INFO";
                skippedCount++;
                continue;
            } else {
                info = "WARN";
            }

            if ( i % 2 == 0) {
                System.out.println("PaymentService");
            } else {
                System.out.println("AuthService");
            }


        }

        String aStatus = (errorCount > 0)? "DEGRADED" : "HEALTHY";
    }
}
