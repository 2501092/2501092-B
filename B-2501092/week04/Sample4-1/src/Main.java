public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = -a;
        int c = (((a++) + 2) - (--b));
        // b = b - 1;
        // c = a + 2;
        // a = a + 1;
        int d = (((a--) + (++b)) + 2);
        // b = b + 1;
        // d = b + 2;
        // a = a - 1;

        float e = (float) (5.0/ 4);

        a += 4;  // a = a + 4;



        System.out.printf("a = %d, b = %d,c = %d, d = %d,e = %.2f", a,b,c,d,e);
    }
}