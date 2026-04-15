package practice.week2;

public class LogClassifier {
    public static void main(String[] args){

        String level = "WARN";
        String service = "PaymentsService";
        String message = "Payment failed for user 42";

        System.out.println("Analyzing: [" + level + "] " + service);

        if (level.equals("ERROR")) {
            System.out.println("Severity: CRITICAL");
            System.out.println("Action: Alert sent immediately");
        } else if (level.equals("WARN")) {
            System.out.println("Severity: WARNING");
            System.out.println("Action: Monitoring closely");
        } else if (level.equals("INFO")) {
            System.out.println("Severity: NORMAL");
            System.out.println("Action: No action needed");
        } else {
            System.out.println("Severity: UNKNOWN");
            System.out.println("Action: Check log format");
        }
    }
}
