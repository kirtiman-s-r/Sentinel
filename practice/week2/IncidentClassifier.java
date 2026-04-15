package practice.week2;

public class IncidentClassifier {
    public static void main (String[] args) {

        String level = "INFO";
        String service = "PaymentService";
        double responseTime = 6.0;
        int errorCount = 120;
        boolean isDatabaseDown = true;

        System.out.println("=== SENTINEL INCIDENT ANALYSIS ===");
        System.out.println("Service: " + service);
        System.out.println("Level: " + level);
        System.out.println("Response time: " + responseTime);
        System.out.println("Error count: " + errorCount);
        System.out.println("---");

        if (level.equals("ERROR")) {

            if (isDatabaseDown && level.equals("ERROR")) {
                System.out.println("DATABASE FAILURE--all services affected");
            } else if (errorCount > 200 && service.equals("PaymentService")) {
                System.out.println("P0-CRITICAL---ESCALATE TO CTO");
            } else if (service.equals("PaymentService")) {
                System.out.println("Priority: P0");
                System.out.println("Status: PAYMENT SYSTEM DOWN");
                System.out.println("Action: Page on-call engineer");
            } else if (errorCount > 100) {
                System.out.println("Priority: P1");
                System.out.println("Status: HIGH ERROR RATE");
                System.out.println("Action: Investigate immediately");
            } else {
                System.out.println("Priority: P2");
                System.out.println("Status: ERROR detected");
                System.out.println("Action: Monitor closely");
            }

        } else if (level.equals("WARN")) {
            if (responseTime > 5.0) {
                System.out.println("Priority: P2");
                System.out.println("Status: WARN + slow response");
                System.out.println("Action: Check database connections");
            } else {
                System.out.println("Priority: P3");
                System.out.println("Status: WARNING only");
                System.out.println("Action: Monitor");
            }
        } else {
            System.out.println("Priority: P4");
            System.out.println("Status: Normal");
            System.out.println("Action: No action needed");
        }
    }
}