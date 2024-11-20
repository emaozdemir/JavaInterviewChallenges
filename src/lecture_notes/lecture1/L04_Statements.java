package lecture_notes.lecture1;

public class L04_Statements {
    /*
    **Statements (Deyimler):**
    - Java'da bir deyim, doğal dilde bir cümleye benzer.
    - Programlarda meydana gelen işlemlerin temel yapı taşlarıdır.
    - Her deyim `;` (noktalı virgül) ile biter. Noktalı virgül, bir deyimin sonunu belirtir.
    - Deyimler genel olarak üç kategoriye ayrılabilir:
        1. Expression Statements (İfade Deyimleri)
        2. Declaration Statements (Bildirim Deyimleri)
        3. Control Statements (Kontrol Deyimleri)
    */

    /*
    **1. Expression Statements (İfade Deyimleri):**
    - Bir ifade, değerler, sabitler, operatörler ve fonksiyonların bir kombinasyonudur.
    - Bir ifade yürütüldüğünde bir sonuç üretir.
    - Her ifadenin bir türü vardır. Örneğin:
        - Sayısal bir tür (ör. iki değerin toplamı)
        - Referans türü (ör. bir nesnenin bir değişkene atanması)
    - Özel bir ifade türü olan `void`, herhangi bir sonuç üretmeyen ifadeler için kullanılır.
    - Örnek:
        - `System.out.println("Hello");` ifadesi, yan etkiler (side effects) için çalıştırılır.
    */

    public static void expressionExamples() {
        // Sayısal ifadeler:
        System.out.println(7);           // 7
        System.out.println(3 + 7);       // 10
        System.out.println(2 * 5 - 3);   // 7

        // Atama ifadeleri:
        int result = 3 + 7; // Bir değişkene atama işlemi bir ifadedir.
        System.out.println(result); // 10
    }

    /*
    **2. Declaration Statements (Bildirim Deyimleri):**
    - Yeni bir değişken tanımlamak için kullanılan deyimlerdir.
    - Tür ve isim belirtilerek tanımlanır.
    - Örnek:
        */
    int maxStock; // Değişken tanımlaması
    boolean isFull;
    String message;

    // Değişkenlere hemen değer atanabilir:
    int stockCapacity = 1200;
    boolean isAvailable = false;
    String greeting = "Merhaba Java!";

    // Aynı türden birden fazla değişken tek bir deyimle tanımlanabilir:
    int minStock, reorderLevel;
    boolean isCompatible = true, needsUpdate = false;

    /*
    **3. Control Statements (Kontrol Deyimleri):**
    - Programın akışını kontrol eden deyimlerdir.
    - Yaygın örnekler:
        - `if` deyimi
        - `while` ve `for` döngüleri
        - `continue` ve `break` gibi kontrol transfer deyimleri
    */

    public static void controlStatementExample() {
        int stock = 50;
        int maxStock = 100;

        // `if` deyimi:
        if (stock < maxStock) {
            System.out.println("Stok artırılabilir.");
        }

        // `for` döngüsü:
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sayac: " + i);
        }

        // `while` döngüsü:
        int count = 0;
        while (count < 3) {
            System.out.println("Sayac: " + count);
            count++;
        }
    }

    public static void main(String[] args) {
        // İfade örneklerini çalıştır:
        expressionExamples();

        // Kontrol deyimi örneklerini çalıştır:
        controlStatementExample();
    }
}