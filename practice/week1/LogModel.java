package practice.week1;

public class LogModel {
    public static void main(String[] args) {
        // One log entry - all variables
        String level = "ERROR";
        String timestamp = "2025-01-01 10:23:01";
        String service = "PaymentService";
        String message = "Payment failed for user 42";
        int userId = 42;
        double responseTime = 2.35;
        boolean isResolved = false;

        // Join everything into one formatted log line
        String logLine = "[" + level + "] " + timestamp + " | " + service + " | " + message;

        // Print the full log line
        System.out.println(logLine);

        // Print extra details
        System.out.println("User ID: " + userId);
        System.out.println("Response time: " + responseTime + "ms");
        System.out.println("Resolved: " + isResolved);
    }
}