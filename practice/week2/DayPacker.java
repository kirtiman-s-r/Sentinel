package practice.week2;

public class DayPacker {
    public static void main(String[] args) {

        String day = "Saturday";

        switch (day) {
            case "Monday":
                System.out.println("Full System Scan");
                break;
            case "Wednesday":
                System.out.println("Database Backup");
                break;
            case "Friday":
                System.out.println("Performance Report");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Maintenance Mode");
                break;
            default:
                System.out.println("Standard Monitoring");
                break;

        }
    }
}
