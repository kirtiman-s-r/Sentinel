package practice.week3;

public class LogFilter {
    public static void main(String[] args) {

        System.out.println("=== SENTINEL LOG FILTER ===");
        System.out.println("");

        int errorCount = 0;
        int skippedCount = 0;

        // do-while for initial system check
        int checkAttempt = 0;
        boolean systemReady = false;

        do {
            checkAttempt++;
            System.out.println("System check #" + checkAttempt );
            if (checkAttempt >= 2) systemReady = true;
        } while (!systemReady);

        System.out.println("System ready. Starting log scan. \n");

        // for loop with break and continue
        for (int i = 1; i <= 20; i++) {
            String level =  i % 5 == 0 ? "CRITICAL" :
                            i % 3 == 0 ? "INFO" :
                            i % 2 == 0 ? "WARN" : "ERROR";
            // Skip INFO LOGS
            if (level.equals("INFO")) {
                skippedCount++;
                continue;
            }

            // stop at first CRITICAL
            if (level.equals("CRITICAL")) {
                System.out.println("CRITICAL at log #" + i + " - halting scan");
                break;
            }

            System.out.println("Log #" + i + " [" + level + "] - processed");
            if (level.equals("ERROR")) errorCount++;
        }

        System.out.println("");
        System.out.println("Errors processed: " + errorCount);
        System.out.println("INFO logs skipped: " + skippedCount);
    }
}
