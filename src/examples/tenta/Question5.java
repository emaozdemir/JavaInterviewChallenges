package examples.tenta;

public class Question5 {
    public static void main(String[] args) {
        // Soru 5: Aşağıdaki kod yürütüldüğünde myReducedNumber değişkenine hangi değer atanır?
        // Açıklama:
        // double bir değer int'e dönüştürüldüğünde kesirli kısmı (ondalık kısmı) atılır.
        // Bu nedenle değer 7 olarak atanır.

        double myNumber = 7.8323456789023456789808780780799999999;
        float myReducedNumber = (float) myNumber;
        int myReducedNumberInt = (int) myNumber;

        System.out.println("myReducedNumber = " + myReducedNumber);
        System.out.println("myReducedNumber = " + myReducedNumberInt);
    }
}
