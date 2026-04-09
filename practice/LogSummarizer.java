package practice;

public class LogSummarizer {
    public static void main(String[] args) {

        int logCount = 250;
        int errorCount = 30;
        boolean isWeekend = false;

        String volume = logCount > 200 ? "HIGH" : "LOW";
        String rate = errorCount < 50 ? "LOW" : "HIGH";
        boolean day = !isWeekend;
        String count = errorCount > 50 ? "P1" : (errorCount > 20 ? "P2" : "P3");
        System.out.println("Volume: " + volume);
        System.out.println("Error rate: " + rate );
        System.out.println("Working day: " + day);

    }
}
