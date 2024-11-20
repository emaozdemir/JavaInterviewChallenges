package lecture_notes.lecture2;

public class L02_Loops {/*
    ** While Döngüsü (While Loop):**
    - `while` döngüsü, belirli bir koşul doğru olduğu sürece bir kod bloğunu tekrarlamak için kullanılır.
    */
    public static void whileLoopExample() {
        int iterations = 0;

        while (iterations < 15) {
            System.out.println(iterations + ": This while-loop is now executing!");
            iterations++;  // Iteration değişkeni her seferinde 1 artıyor
        }
    }

    /*
    ** Do/While Döngüsü (Do/While Loop):**
    - `do/while` döngüsü, kod bloğunu ilk önce çalıştırır, ardından koşulu kontrol eder.
    - En az bir kez çalıştırılmasını garanti eder.
    */
    public static void doWhileLoopExample() {
        String customerId;
        do {
            System.out.println("Enter valid customer ID: ");
            customerId = askUserForCustomerId();  // Bu metot, kullanıcıdan müşteri kimliği alır
        } while (!isGenuine(customerId));  // Eğer müşteri kimliği geçerli değilse, döngü devam eder
    }

    /*
    ** For Döngüsü (For Loop):**
    - `for` döngüsü genellikle bir sayaç ile yapılan işlemler için idealdir.
    - Başlangıç, koşul ve artış/küçülme adımlarını belirten 3 parametre içerir.
    */
    public static void forLoopExample() {
        for (int i = 0; i < 15; i++) {
            System.out.println(i + ": This for-loop is now executing!");
        }
    }

    /*
    ** Break ve Continue:**
    - `break` döngüyü hemen sonlandırırken, `continue` döngünün mevcut iterasyonunu atlar ve bir sonraki iterasyona geçer.
    */

    public static void breakContinueExample() {
        // Break örneği: Eğer yanlış giriş yapılırsa döngü sonlanır
        while (true) {
            if (faultyInput()) {
                break;  // Yanlış giriş yapıldığında döngüyü sonlandır
            }

            // Giriş doğruysa burası çalışır
            System.out.println("Processing valid input...");
        }

        // Continue örneği: X değeri 7'ye tam bölünmüyorsa o iterasyonu atlar
        for (int x = 0; x < 50; x++) {
            if (x % 7 != 0) {
                continue;  // X 7'ye bölünmüyorsa bu iterasyon atlanır
            }
            System.out.println(x);  // X değeri 7'ye tam bölünüyorsa yazdırılır
        }
    }

    // Yardımcı metotlar
    private static String askUserForCustomerId() {
        return "1234";  // Örnek müşteri kimliği
    }

    private static boolean isGenuine(String customerId) {
        return customerId.equals("1234");  // Gerçek müşteri kimliği kontrolü
    }

    private static boolean faultyInput() {
        return false;  // Örnek olarak geçerli bir giriş olduğunu varsayalım
    }

    public static void main(String[] args) {
        // While döngüsünü çalıştır
        whileLoopExample();

        // Do/While döngüsünü çalıştır
        doWhileLoopExample();

        // For döngüsünü çalıştır
        forLoopExample();

        // Break ve Continue örneklerini çalıştır
        breakContinueExample();
    }
}