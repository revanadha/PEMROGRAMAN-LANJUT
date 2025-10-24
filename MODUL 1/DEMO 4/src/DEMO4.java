public class DEMO4 {

    public static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        // Skenario 1
        int hasil1 = findMin(1, 2, 3);
        System.out.println("Skenario 1: Min dari (1, 2, 3) = " + hasil1);

        // Skenario 2
        int hasil2 = findMin(-1, -2, -3);
        System.out.println("Skenario 2: Min dari (-1, -2, -3) = " + hasil2);

        // Skenario 3
        int hasil3 = findMin(0, 0, 1);
        System.out.println("Skenario 3: Min dari (0, 0, 1) = " +hasil3);
}
}