package examples.tenta;

public class Question5 {
    public static void main(String[] args) {
        // Soru 5: Aşağıdaki kod yürütüldüğünde myReducedNumber değişkenine hangi değer atanır?
        // Açıklama:
        // double bir değer int'e dönüştürüldüğünde kesirli kısmı (ondalık kısmı) atılır.
        // Bu nedenle değer 7 olarak atanır.

        double myNumber = 7.83;
        int myReducedNumber = (int) myNumber;

        System.out.println("myReducedNumber = " + myReducedNumber); // Çıktı: 7
    }
}
