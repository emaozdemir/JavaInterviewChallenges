package examples;

public class WhileLoopExample {
    // 0'dan 14'e kadar olan sayıları yazdırmak için bir while döngüsü kullanın.
    // Döngü koşulu her seferinde "iterations" değişkeninin 15'e ulaşmasını kontrol etmelidir.
    public static void main(String[] args) {
        int iterations = 0;

        // while döngüsü
        while (iterations < 15) {
            System.out.println(iterations + ": This while-loop is now executing!");
            iterations++;
        }
    }
}