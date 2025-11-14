package h2;

public class H2_main {
    public static void main(String[] args){
        boolean x = true, y = false, a = true, b = false, c = false;
        int input = 10;
        boolean e1 = (x == true);
        boolean e2 = (y == true);
        // E3 = x,y unterschiedlich
        if (input == 10 || input ==11){
            x = true;
        } else {
            x = false;
        }
        if (input == 11 || input == 1){
            y = true;
        } else {
            y = false;
        }
        if (e1 && e2){
            a = true;
        } else {
            a = false;
        }
        if (e1 || (x != y)){
            b = true;
        }
        if ((e1 && e2) || (!e1 && e2)){
            c = false;
        } else if ((e1 && !e2) || (!e1 && !e2)){
            c = true;
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
