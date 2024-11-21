package examples.tenta;

public class Question8 {
    public static void main(String[] args) {

        // Soru 8: Bir integer değişkeni result olarak tanımlayın. 1'den 5'e kadar
        // olan karelerin toplamını hesaplamak için bir for döngüsü yazın.
        // Açıklama:
        // 1^2 + 2^2 + 3^2 + 4^2 + 5^2 = 1 + 4 + 9 + 16 + 25 = 55.

        int result = 0;
        for (int i = 1; i <= 5; i++) {
            result += i * i;
        }
        System.out.println("Result: " + result);

    }
}
