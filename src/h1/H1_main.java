package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 5;
        double price = 2.0;
        switch(zone){
            case 1:
                price = price;
                break;
            case 2:
                price += 0.35;
                break;
            case 3:
                price += 0.85;
                break;
            case 4:
                price += 0.85;
                break;
            case 5:
                price += 1.55;
                break;
            default:
                price = 4.0;
                break;
        }
        System.out.println("Der Preis für die Fahrkarte in Zone: " + zone + " beträgt: " + price);
    }
}
