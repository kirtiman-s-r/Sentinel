package practice;

public class OperatorsPractice {
    public static void main (String[] args) {

        // Log stats
        int totalLogs = 1000;
        int errorLogs = 47;
        int infoLogs = totalLogs - errorLogs;
        double errorRate = (double) errorLogs / totalLogs * 100;

        System.out.println("Total logs: " + totalLogs);
        System.out.println("Error logs: " + errorLogs);
        System.out.println("Info logs: " + infoLogs);
        System.out.println("Error rate: " + errorRate + "%");

        // Logic
        boolean isCritical = true;
        boolean shouldAlert = errorLogs > 40 && isCritical;
        System.out.println("Should alert? " + shouldAlert);
    }
}