package practice;

public class Main {
    public static void main(String[] args) {
        // Variables for log entry
        String level = "ERROR";
        String service = "PaymentService";
        String message = "Payment failed for user 42";
        int userId = 33;
        double responseTime = 2.35;
        boolean isResolved = false;

        // Print them
        System.out.println(level);
        System.out.println(service);
        System.out.println(message);
        System.out.println(userId);
        System.out.println(responseTime);
        System.out.println(isResolved);

    }
}