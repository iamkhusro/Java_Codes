public class Swap {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a+" "+b);

        b = a + b - (a = b);
        System.out.println(a+" "+b);


    }
}
