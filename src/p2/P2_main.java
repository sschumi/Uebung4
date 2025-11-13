package p2;

public class P2_main {
    public static void main(String[] args){
        int a = 3, b = 5, c = 6;
        double x = 1.5, y = 2.3;
        int intResult;
        double doubleResult;

        intResult = c - a * 3;
        intResult = (int) ((double) c / (double) b);
        System.out.println(intResult);
        intResult = a + b / c;
        doubleResult = (double) c / (double) b;
        System.out.println(doubleResult);
        doubleResult = (double) c + (double) a / (double) b;
        System.out.println(doubleResult);
        doubleResult = x + y * (double) b;
        System.out.println(doubleResult);
    }
}
