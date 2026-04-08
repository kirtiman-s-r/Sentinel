package practice;

public class ServiceRouter {
    public static void main(String[] args) {

        String service = "PaymentService";
        System.out.println("Routing traffic for: " + service);

        switch (service) {
            case "PaymentService":
                System.out.println("Route: Finance Security Group");
                break;
            case "AuthService":
                System.out.println("Route: Identity Management Team");
                break;
            case "MeadiaService":
                System.out.println("Route: Content Delivery Network");
                break;
            default:
                System.out.println("Route: General Support Pool");
                break;

        }
    }
}