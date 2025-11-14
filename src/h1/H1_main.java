package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 5;
        double price = 9.0;
        switch(zone){
            case 1:
                price = 2.0;
                break;
            case 2:
                price = 2.35;
                break;
            case 3:
                price = 2.85;
                break;
            case 4:
                price = 2.85;
                break;
            case 5:
                price = 3.55;
                break;
            default:
                if (zone >= 6){
                    price = 4.0;
                } else { // Ungültige Zone
                    price = 0.0;
                }
                break;
        }
        System.out.println("Der Preis für die Fahrkarte in Zone: " + zone + " beträgt: " + price);
    }
}
