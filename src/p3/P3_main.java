package p3;

public class P3_main {
    public static void main(String[] args) {
        boolean x = true, y = false, a = false;
        a = !(x!=y && x==y);
        System.out.println(a);
        a = x || true;
        System.out.println(a);
        a = x && false;
        System.out.println(a);
        a = (x&&!y) || (!x);
        System.out.println(a);
    }
}
