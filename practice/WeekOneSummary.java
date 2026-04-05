package practice;

public class WeekOneSummary {
    public static void main (String[] args) {

        // Extra Details
        boolean isResolved = false;
        int totalLogs = 3;
        int errorCount = 1;
        int warningLogs = 1;
        int infoLogs = 1;
        boolean systemHealthy = errorCount == 0 && isResolved;
        boolean alertSend = errorCount > 0 && !isResolved;

        // Log 1
        //P1
        String aType = "ERROR";
        String aTime = "2025-01-01 10:23:01";
        String aService = "PaymentService";
        String aReason = "Payment failed for user 42";

        //P2
        double aResponseTime = 2.35;
        boolean aResolved = false;

        System.out.println(" ");
        System.out.println("[" + aType + "] " + aTime + " | " + aService + " | " + aReason);
        System.out.println("Response time: " + aResponseTime + "ms" +  " | " + "Resolved: " + aResolved + " | " + "Alert sent: " + alertSend);
        System.out.println(" ");

        // Log 2
        //P1
        String bType = "WARN";
        String bTime = "2025-01-02 08:15:00";
        String bService = "DatabaseService";
        String bReason = "Slow query detected";

        //P2
        double bResponseTime = 4.7;
        boolean bResolved = false;

        System.out.println("[" + bType + "] " + bTime + " | " + bService + " | " + bReason);
        System.out.println("Response time: " + bResponseTime + "ms" + " | " + "Resolved: " + bResolved + " | " + "Alert sent: " + !alertSend);
        System.out.println(" ");

        // Log 3
        //P1
        String cType = "INFO";
        String cTime = "2025-01-03 14:05:22";
        String cService = "UserService";
        String cReason = "User login successful";

        //P2
        double cResponseTime = 0.8;
        boolean cResolved = true;

        System.out.println("[" + cType + "] " + cTime + " | " + cService + " | " + cReason);
        System.out.println("Response time: " + cResponseTime + "ms" + " | " + "Resolved: " + cResolved + " | " + "Alert sent: " + !alertSend);
        System.out.println(" ");



        // Print Extra Details
        System.out.println("=== SENTINEL SUMMARY ===");
        System.out.println("Total logs: " + totalLogs);
        System.out.println("Error logs: " + errorCount);
        System.out.println("Warning logs: " + warningLogs);
        System.out.println("Info logs: " + infoLogs);
        System.out.println("System healthy: " + systemHealthy);
    }

}
