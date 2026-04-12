package practice;

public class FinalCheckpoint {
    public static void main(String[] args) {

        //ERROR
        String aLevel = "ERROR";
        String aService = "PaymentService";
        double aResponse = 6.5;
        String aPriority = "P0";
        String aRegion = "JP";
        String aCenter = "Yo";

        String aCritical = aPriority.equals("P0")? "CRITICAL" : (aPriority.equals("P2")? "DEGRADED" : "NORMAL");
        String aAlert = aLevel.equals("ERROR") || aLevel.equals("WARN")? "SENT" : "NOT SENT";

        if (aLevel.equals("ERROR")) {

            if (aRegion.equals("JP")) {
                if (aCritical.equals("CRITICAL")) {
                    aCenter = "日本チームに通知";
                } else {
                    aCenter = "No action for INFO logs";
                }
            } else if (aRegion.equals("US")) {
                aCenter = "Notify US team";
            } else {
                aCenter = "Specify center region....";
            }
        }

        switch (aService){
            case("PaymentService"):
                System.out.println("[" + aLevel + "] " + aService + " | " + "Response: " + aResponse);
                System.out.println("Priority: " + aPriority + " | " + "Status: " + aCritical + "Alert: " + aAlert);
                System.out.println("Region: " + aRegion + " >>> " + aCenter + "\n");
                break;
            default:
                System.out.println("RETRY PLS");
        }


        //WARN
        String bLevel = "WARN";
        String bService = "DatabaseService";
        double bResponse = 3.2;
        String bPriority = "P2";
        String bRegion = "US";
        String bCenter = "Yo";

        String bCritical = bPriority.equals("P0")? "CRITICAL" : (bPriority.equals("P2")? "DEGRADED" : "NORMAL");
        String bAlert = bLevel.equals("ERROR") || bLevel.equals("WARN")? "SENT" : "NOT SENT";

        if (bLevel.equals("WARN")) {

            if (bRegion.equals("JP")) {
                if (bCritical.equals("CRITICAL")) {
                    bCenter = "日本チームに通知";
                } else {
                    bCenter = "No action for INFO logs";
                }
            } else if (bRegion.equals("US")) {
                bCenter = "Notify US team";
            } else {
                bCenter = "Specify center region....";
            }
        }

        switch (bService){
            case("DatabaseService"):
                System.out.println("[" + bLevel + "] " + bService + " | " + "Response: " + bResponse);
                System.out.println("Priority: " + bPriority + " | " + "Status: " + bCritical + "Alert: " + bAlert);
                System.out.println("Region: " + bRegion + " >>> " + bCenter + "\n");
                break;
            default:
                System.out.println("RETRY PLS");
        }


        String cLevel = "INFO";
        String cService = "UserService";
        double cResponse = 0.9;
        String cPriority = "P4";
        String cRegion = "JP";
        String cCenter = "Yo";

        String cCritical = cPriority.equals("P0")? "CRITICAL" : (cPriority.equals("P2")? "DEGRADED" : "NORMAL");
        String cAlert = cLevel.equals("ERROR") || cLevel.equals("WARN")? "SENT" : "NOT SENT";

        if (cLevel.equals("INFO")) {

            if (cRegion.equals("JP")) {
                if (cCritical.equals("CRITICAL")) {
                    cCenter = "日本チームに通知";
                } else {
                    cCenter = "No action for INFO logs";
                }
            } else if (cRegion.equals("US")) {
                cCenter = "Notify US team";
            } else {
                cCenter = "Specify center region....";
            }
        }

        switch (cService){
            case("UserService"):
                System.out.println("[" + cLevel + "] " + cService + " | " + "Response: " + cResponse);
                System.out.println("Priority: " + cPriority + " | " + "Status: " + cCritical + "Alert: " + cAlert);
                System.out.println("Region: " + cRegion + " >>> " + cCenter + "\n");
                break;
            default:
                System.out.println("RETRY PLS");
        }


        //EXTRA
        int errorLog = 3;
        int criticalLog = 1;
        int errorRate = criticalLog * 100 / errorLog;
        boolean isOnCall = aPriority.equals("P0") || aPriority.equals("P1") || bPriority.equals("P0") || bPriority.equals("P1") || cPriority.equals("P0") || cPriority.equals("P1")? true: false;

        System.out.println("========================================\n" +  "SENTINEL SUMMARY\n" + "========================================");
        System.out.println("Total logs: " + errorLog);
        System.out.println("Critical logs: " + criticalLog);
        System.out.println("System health: DEGRADED");
        System.out.println("On-call required: " + isOnCall);
        System.out.println("Database status: UP");
        System.out.println("Error rate: " + errorRate + "%");
        System.out.println("========================================");
    }
    //Not from here
}
