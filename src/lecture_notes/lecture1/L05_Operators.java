package lecture_notes.lecture1;

public class L05_Operators {
    /*
    **Operators (Operatörler):**
    - Operatörler, ifadeleri birbirine bağlamak ve işlem yapmak için kullanılan araçlardır.
    - Örneğin: toplama operatörü `+`, çıkarma operatörü `-`.
    - Operatörlerin bir öncelik sıralaması vardır (Precedence). Daha yüksek öncelikli operatörler önce işlenir.
    */

    public static void arithmeticOperators() {
        System.out.println("Arithmetic Operators:");
        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b)); // Toplama
        System.out.println("a - b = " + (a - b)); // Çıkarma
        System.out.println("a * b = " + (a * b)); // Çarpma
        System.out.println("a / b = " + (a / b)); // Bölme
        System.out.println("a % b = " + (a % b)); // Kalan (Modulus)
    }

    /*
    **Unary Operators (Tekil Operatörler):**
    - Tek bir operand üzerinde çalışırlar.
    - Örnek: Artırma (++), Azaltma (--), Mantıksal NOT (!)
    */
    public static void unaryOperators() {
        System.out.println("\nUnary Operators:");
        int number = 5;

        System.out.println("Original number: " + number);

        // Postfix Increment (Sonra artırır)
        System.out.println("number++ = " + (number++)); // İlk 5, sonra 6
        System.out.println("After postfix increment: " + number);

        // Prefix Increment (Önce artırır)
        System.out.println("++number = " + (++number)); // 7 olur

        // Postfix Decrement (Sonra azaltır)
        System.out.println("number-- = " + (number--)); // İlk 7, sonra 6
        System.out.println("After postfix decrement: " + number);

        // Prefix Decrement (Önce azaltır)
        System.out.println("--number = " + (--number)); // 5 olur
    }

    /*
    **Boolean Operators (Mantıksal Operatörler):**
    - Operatörler mantıksal ifadelerle çalışır ve sonuçları `true` ya da `false` döner.
    */
    public static void booleanOperators() {
        System.out.println("\nBoolean Operators:");
        int x = 10, y = 20;

        System.out.println("x == y: " + (x == y)); // Eşit mi?
        System.out.println("x != y: " + (x != y)); // Eşit değil mi?
        System.out.println("x > y: " + (x > y));   // Büyük mü?
        System.out.println("x < y: " + (x < y));   // Küçük mü?
        System.out.println("x >= 10 && y <= 20: " + (x >= 10 && y <= 20)); // AND
        System.out.println("x == 10 || y == 30: " + (x == 10 || y == 30)); // OR
        System.out.println("!(x == y): " + !(x == y)); // NOT
    }

    /*
    **The Dot Operator (`.`):**
    - Bir sınıfın ya da nesnenin içindeki değişkenlere ve metotlara erişmek için kullanılır.
    */
    public static void dotOperatorExample() {
        System.out.println("\nDot Operator Example:");

        // String nesnesi üzerinde metot zincirleme (Method Chaining)
        String greeting = "HelloJava";
        System.out.println("Original: " + greeting);
        System.out.println("Length: " + greeting.length());               // Uzunluğu alır
        System.out.println("Uppercase: " + greeting.toUpperCase());      // Büyük harfe çevirir
        System.out.println("Substring (0,5): " + greeting.substring(0, 5)); // İlk 5 karakter
    }

    public static void main(String[] args) {
        // Matematiksel operatörler:
        arithmeticOperators();

        // Tekil operatörler:
        unaryOperators();

        // Mantıksal operatörler:
        booleanOperators();

        // Dot operatör örneği:
        dotOperatorExample();
    }
}
