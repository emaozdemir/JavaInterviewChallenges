package examples.tenta;

public class Question4 {
    public static void main(String[] args) {
        // Primitif türler ve örnekleri:
// char: Tek bir karakter saklar.
        char karakter = 'A';

// double: Ondalıklı sayıları saklar, yüksek hassasiyete sahiptir.
        double ondalikliSayi = 3.14159;

// int: Tamsayılar için kullanılır.
        int tamsayi = 42;

// long: Çok büyük tamsayılar için kullanılır.
        long buyukTamsayi = 123456789L;

// float: Ondalıklı sayılar için kullanılır, hassasiyeti double'dan düşüktür.
        float kucukOndalikliSayi = 3.14f;

// byte: Çok küçük tamsayılar için kullanılır (-128 ile 127 arası).
        byte kucukTamsayi = 127;

// short: Küçük tamsayılar için kullanılır (-32,768 ile 32,767 arası).
        short kucukTamSayi = 32000;

// boolean: true veya false değerlerini saklar.
        boolean mantikDegeri = true;

// Non-primitive türler ve örnekleri:
// String: Karakter dizilerini saklar.
        String metin = "Merhaba, Java!";

// Array: Belirli bir türde birden fazla değer saklar.
        int[] sayilar = {1, 2, 3, 4, 5};

// Class: Kullanıcı tanımlı türleri ifade eder.
        class Ogrenci {
            String isim;
            int yas;
        }

// Interface: Davranışları tanımlar, kullanıcı tanımlı olabilir.
        interface Canli {
            void nefesAl();
        }


        // Soru 4: Aşağıdaki ifadelerde x değişkenine hangi değer atanır?
        // a. int x = 16 / 4 + 3; -> 7
        // b. boolean x = !((6 * 3) == 18); -> false
        // c. char x = A + 4; -> 'E'

        int x1 = 16 / 4 + 3; // x1 = 7

        int x1x = 16 / (4 + 3); // x1 = 2
        double x1x1 = 16 / (4 + 3); // x1 = 2.285714285714286

       //5 % 2=1 kalanı yazma

        boolean x2 = !((6 * 3) == 18); // x2 = false

        char x3 = (char) ('A' + 4); // x3 = 'E' // asci tablosu
        char x3x3 = 'A'; // x3 = 'E' // asci tablosu


        System.out.println("a. x = " + x1);
        System.out.println("a. x = " + x1x1);
        System.out.println("b. x = " + x2);
        System.out.println("c. x = " + x3);
        System.out.println("c. x = " + x3x3);

    }
}