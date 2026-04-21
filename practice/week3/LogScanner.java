package practice.week3;

public class LogScanner {
    public static void main(String[] args) {

        System.out.println("=== SENTINEL LOG SCANNER ===");
        System.out.println("");

        int logNumber = 1;
        boolean criticalFound = false;
        int scannedCount = 0;
        int maxScan = 0;
        int errorCount = 0;

        while (!criticalFound && logNumber <= 20) {

            String status;
            if (logNumber % 4 == 0) {
                status = "ERROR";
                criticalFound = true;
            } else if (logNumber % 5 == 0) {
                status = "CRITICAL";
            } else if (logNumber % 3 == 0) {
                status = "WARN";
            } else {
                status  = "OK";
            }

            System.out.println("Scanning log #" + (logNumber -1) + " - " + status);
            scannedCount++;
            logNumber++;
        }

        while ( !criticalFound && maxScan <= 10) {

            String status;
            if (logNumber % 4 == 0) {
                status = "ERROR";
                errorCount++;
                System.out.println(errorCount + " errors were found in first 10 logs. System not stable");
            } else {
                System.out.println("NO errors found in first 10 logs. System stable");
            }
        }

        System.out.println("");
        if (criticalFound) {
            System.out.println("CRITICAL issue found. Alerting on-call engineer");
        } else {
            System.out.println("Scan complete. No critical issues. ");
        }
        System.out.println("Total logs scanned: " + scannedCount);
    }
}