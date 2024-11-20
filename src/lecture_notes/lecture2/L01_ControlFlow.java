package lecture_notes.lecture2;

public class L01_ControlFlow {

    /*
    ** Kod Blokları (Code Blocks):**
    - Kod blokları, genellikle `{}` içerisinde tanımlanmış kod parçalarına verilen isimdir.
    - Herhangi bir kod parçası bir kod bloğu oluşturabilir ve kodun akışını kontrol etmek için kullanılır.
    */

    public static void codeBlockExample() {
        {
            int length = 6;
            String color = "blue";
            // Kod bloğu içindeki değişkenler sadece bu blok içinde görünür ve kullanılabilir.
            System.out.println("Ribbon length: " + length);
            System.out.println("Ribbon color: " + color);
        }

        // Burada length ve color değişkenlerine erişilemiyor çünkü onlar kod bloğunun dışındalar.
        // System.out.println(length); // Derleyici hatası verir!
    }

    /*
    ** If/Else Koşul Yapıları (If/Else Conditionals):**
    - Eğer bir koşul doğruysa bir işlem yapılır, aksi takdirde başka bir işlem yapılır.
    */
    public static void ifElseExample() {
        int customerId = 32;

        if (customerId < 45) {
            System.out.println("This customer is an early adopter!");
            // customer.setDiscount(15); // Örnek bir metot çağrısı
        } else {
            System.out.println("This customer is late to the party...");
            // customer.setDiscount(0); // Örnek bir metot çağrısı
        }
    }

    /*
    ** If/Else-if/Else Koşul Yapıları:**
    - Birden fazla koşulu kontrol etmek için if/else-if/else yapısı kullanılabilir.
    - Koşulların sırası önemlidir. İlk doğru olan koşul çalıştırılır.
    */
    public static void ifElseIfExample() {
        int score = 85;

        if (score >= 90) {
            System.out.println("A grade");
        } else if (score >= 75) {
            System.out.println("B grade");
        } else if (score >= 50) {
            System.out.println("C grade");
        } else {
            System.out.println("Fail");
        }
    }

    /*
    ** Switch Koşul Yapısı:**
    - `switch` yapısı, belirli bir değerin birkaç seçenekten birine göre yönlendirilmesi için kullanılır.
    */
    public static void switchExample() {
        int chosenMethod = 3;

        switch (chosenMethod) {
            case 1:
                System.out.println("You chose option 1!");
                break; // break komutu ile switch bloğundan çıkılır
            case 2:
                System.out.println("You chose option 2!");
                break;
            case 3:
                System.out.println("You chose option 3!");
                break;
            default:
                System.out.println("Invalid option!");
        }
    }

    public static void main(String[] args) {
        // Kod bloğu örneğini çalıştır
        codeBlockExample();

        // If/Else örneğini çalıştır
        ifElseExample();

        // If/Else-if örneğini çalıştır
        ifElseIfExample();

        // Switch örneğini çalıştır
        switchExample();
    }
}