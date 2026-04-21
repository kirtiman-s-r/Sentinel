package practice.week3;

public class LogScanner {
    public static void main(String[] args) {

        System.out.println("=== SENTINEL LOG SCANNER ===");
        System.out.println("");

        int logNumber = 1;
        boolean warnFound = false;
        int scannedCount = 0;
        int maxScan = 0;
        int errorCount = 0;

        while (!warnFound && logNumber <= 20) {

            String status;
            if (logNumber % 4 == 0) {
                status = "ERROR";
                warnFound = true;
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

        System.out.println("");

        if (errorCount == 0 && scannedCount <= 10) {
            System.out.println("No errors in first 10 logs. System stable.");
        } else if (errorCount > 0) {
            System.out.println("Errors found within " + scannedCount + " logs. System unstable.");
        }

        System.out.println("");

        if (warnFound) {
            System.out.println("WARN issue found. Alerting on-call engineer");
        } else {
            System.out.println("Scan complete. No warn issues. ");
        }
        System.out.println("Total logs scanned: " + scannedCount);
    }
}