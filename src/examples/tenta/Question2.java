package examples.tenta;

public class Question2 {
    public static void main(String[] args) {
        // 2. Aşağıdakilerden hangileri Java'da primitif türlerdir?

        // Primitif türler: char, double, int, long, byte, short, float, boolean.

        // Non-primitive -> String, Array, Class, Interface


        System.out.println("Primitive types in Java: char, double, int, long.");
        // Primitif türler
        char karakter = 'A';
        int sayi = 42;
        double pi = 3.14;
        long buyukSayi = 123456789L;

        // Non-Primitif türler
        String mesaj = "Merhaba, Java!";
        int[] dizi = {1, 2, 3};//arrays

        System.out.println("Char: " + karakter);
        System.out.println("Int: " + sayi);
        System.out.println("Double: " + pi);
        System.out.println("Long: " + buyukSayi);
        System.out.println("String: " + mesaj);
        System.out.println("Array'in ilk elemanı: " + dizi[0]);
    }
}
