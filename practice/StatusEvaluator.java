package practice;

public class StatusEvaluator {
    public static void main(String[] args) {

        String level = "ERROR";
        String service = "PaymentService";
        int errorCount = 47;
        double responseTime = 6.5;
        boolean isDatabaseDown = false;

        String Severity = level.equals("ERROR") ? "CRITICAL" : "NON-CRITICAL";
        String responseStatus = responseTime > 5.0 ? "SLOW" : "FAST";
        String dbStatus = isDatabaseDown ? "DOWN" : "UP";
        String systemHealth = (errorCount == 0 && !isDatabaseDown) ? "HEALTHY" : "DEGRADED";
        String alertStatus = errorCount > 40 ? "ALERT SENT" : "NO ALERT";

        System.out.println("=== SENTINEL STATUS REPORT ===");
        System.out.println("Service " + service);
        System.out.println("Severity: " + Severity);
        System.out.println("Response: " + responseStatus);
        System.out.println("Database: " + dbStatus);
        System.out.println("Health: " + systemHealth);
        System.out.println("Alert: " + alertStatus);
    }
}
