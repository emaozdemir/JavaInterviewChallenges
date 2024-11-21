package examples;

public class GCD {
    // İki sayının en büyük ortak bölenini (GCD) hesaplamak için Euclid'in algoritmasını kullanın.
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 56, b = 98;
        System.out.println("GCD of " + a + " and " + b + ": " + findGCD(a, b));
    }
}
