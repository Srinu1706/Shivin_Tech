public class Fibb {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        // System.out.println(a + " " + b);

        // for (int i = 1; i <= 9; i++) {
        // int c = a + b;

        // System.out.print(" " + c);

        // a = b;
        // b = c;
        // }

        int start = 10;
        int end = 100;

        while (a < end) {
            if (a >= start) {
                System.out.print(" " + a);

            }
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
