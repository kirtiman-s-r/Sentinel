package practice.week1;

public class AlterChecker {
    public static void main (String[] args) {

        int errorCount = 120;
        int warningCount = 45;
        String serviceName = "PaymentService";
        boolean isWeekend = false;

        boolean isCritical = true;
        boolean errorLoad = errorCount > 100 && isCritical;
        boolean overLoad = warningCount > 50 && isCritical;
        int problems = errorCount+warningCount;
        boolean alert = errorCount > 100 && !isWeekend;

        System.out.println("High error load? " + errorLoad);
        System.out.println("Warning overload? " + overLoad);
        System.out.println("Total problems? " + problems);
        System.out.println("Alert needed? " + alert);

    }
}