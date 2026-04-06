package practice;

public class ResponseChecker {
    public static void main(String[] args) {

        double responseTime = 6.0;
        String service = "PaymentService";
        int errorCount = 7;

        if (errorCount > 100 && responseTime >5.0) {
            System.out.println("SYSTEM MELTDOWN");

        }else if (responseTime > 5.0 && service.equals("PaymentService")) {
            System.out.println("PAYMENT SERVICE CRITICAL");

        } else if (errorCount > 100 || responseTime > 3.0) {
                System.out.println("DEGRADED");

        } else if (responseTime > 5.0) {
            System.out.println("SLOW investigate");

        } else if (responseTime > 2.0) {
            System.out.println("DEGRADED monitor");

        } else {
            System.out.println("FAST --- healthy");
        }
    }
}
