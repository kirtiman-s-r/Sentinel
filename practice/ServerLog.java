package practice;

public class ServerLog {
    public static void main(String[] args) {

        // Log entries
        String level = "WARN";
        String timeStamp = "2025-01-02 08:15:00";
        String service = "DatabaseService";
        String message = "Slow query detected";

        // Extras
        double responseTime = 4.7;
        int queryCount = 1500;
        boolean isCritical = false;

        //Build result
        String logLine = "[" + level + "] " + timeStamp + " | " + service + " | " + message;
        String details = "Response time: " + responseTime + " | " + "Queries: " + queryCount + " | " + "Critical: " + isCritical;

        // Print
        System.out.println(logLine);
        System.out.println(details);
    }
}