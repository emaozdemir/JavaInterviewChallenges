package examples.tenta;

public class Question4 {
    public static void main(String[] args) {
        // Soru 4: Aşağıdaki ifadelerde x değişkenine hangi değer atanır?
        // a. int x = 16 / 4 + 3; -> 7
        // b. boolean x = !((6 * 3) == 18); -> false
        // c. char x = A + 4; -> 'E'

        int x1 = 16 / 4 + 3; // x1 = 7
        boolean x2 = !((6 * 3) == 18); // x2 = false
        char x3 = (char) ('A' + 4); // x3 = 'E'

        System.out.println("a. x = " + x1);
        System.out.println("b. x = " + x2);
        System.out.println("c. x = " + x3);
    }
}