package practice.week2;

public class WeekTwoSummary {
    public static void main (String[] args) {

        //"ERROR"
        String aType = "ERROR";
        String aService = "PaymentService";
        String aPriority = "Yo";
        if (aType.equals("ERROR")){
            if (aService.equals("PaymentService")){
                aPriority = "P0";
            } else {
                System.out.println("Not proper level assigned");
            }
        }

        String aStatus = aPriority.equals("P0") ? "CRITICAL" : (aPriority.equals("P2")? "DEGRADED" : "NORMAL");
        String aAlert = (aStatus.equals("CRITICAL") || aStatus.equals("DEGRADED")) ? "SENT" : "NOT SENT";

        switch (aService) {
            case "PaymentService":
                System.out.println("[" + aType + "] " + aService + " - " + "Priority: " + aPriority + " | " + "Status: " + aStatus + " | " + "Alert: " + aAlert);
                break;
        }

        //"WARN"
        String bType = "WARN";
        String bService = "DatabaseService";
        String bPriority = "Yo";
        if (bType.equals("WARN")){
            if (bService.equals("DatabaseService")){
                bPriority = "P2";
            } else {
                System.out.println("Not proper level assigned");
            }
        }

        String bStatus = bPriority.equals("P0") ? "CRITICAL" : (bPriority.equals("P2")? "DEGRADED" : "NORMAL");
        String bAlert = (bStatus.equals("CRITICAL") || bStatus.equals("DEGRADED")) ? "SENT" : "NOT SENT";

        switch (bService) {
            case "DatabaseService":
                System.out.println("[" + bType + "] " + bService + " - " + "Priority: " + bPriority + " | " + "Status: " + bStatus + " | " + "Alert: " + bAlert);
                break;
        }

        //"INFO"
        String cType = "INFO";
        String cService = "UserService";
        String cPriority = "Yo";
        if (cType.equals("INFO")){
            if (cService.equals("UserService")){
                cPriority = "P4";
            } else {
                System.out.println("Not proper level assigned");
            }
        }

        String cStatus = cPriority.equals("P0") ? "CRITICAL" : (cPriority.equals("P2")? "DEGRADED" : "NORMAL");
        String cAlert = (cStatus.equals("CRITICAL") || cStatus.equals("DEGRADED")) ? "SENT" : "NOT SENT";

        switch (cService) {
            case "UserService":
                System.out.println("[" + cType + "] " + cService + " - " + "Priority: " + cPriority + " | " + "Status: " + cStatus + " | " + "Alert: " + cAlert);
                break;
        }

        boolean isOnCall = aPriority.equals("P0") || aPriority.equals("P1") || bPriority.equals("P0") || bPriority.equals("P1") || cPriority.equals("P0") || cPriority.equals("P1");
        System.out.println("");
        System.out.println("=== SUMMARY ===");
        System.out.println("Total incidents: 3");
        System.out.println("System health: DEGRADED");
        System.out.println("On-call required: " + isOnCall);


    }
}

