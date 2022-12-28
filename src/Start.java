public class Start {
    public static void main(String[] args) {
        boolean b1 = 2 <= 2 && !true;
        boolean b2 = !false && 3 > 2;
        boolean f = false;
        boolean t = true;
        boolean b3 = !(!t || f);
        boolean b4 = 6 > 6 ^ !(true && true);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
