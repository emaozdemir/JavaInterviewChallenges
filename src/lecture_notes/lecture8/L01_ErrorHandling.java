package lecture_notes.lecture8;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Bu sınıf, temel error handling ve exception yönetimini gösterir.
 */
public class L01_ErrorHandling {

    public static void main(String[] args) {
        L01_ErrorHandling handler = new L01_ErrorHandling();
        handler.run();
    }

    /**
     * Error handling'i göstermek için giriş noktası.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir integer girin: ");

        try {
            int userInput = scanner.nextInt();
            System.out.println("Girdiğiniz değer: " + userInput);
        } catch (InputMismatchException e) {
            System.err.println("Hata: Geçersiz giriş. Lütfen geçerli bir integer girin.");
        } finally {
            System.out.println("İşlem tamamlandı. Görüşmek üzere!");
            scanner.close();
        }
    }

    /**
     * Unchecked exception yönetimini göstermek için örnek.
     */
    public void demonstrateUncheckedException() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Bu, ArrayIndexOutOfBoundsException fırlatır
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Hata: Geçersiz bir index'e erişim denendi. " + e.getMessage());
        }
    }

    /**
     * Checked exception yönetimini göstermek için örnek.
     */
    public void demonstrateCheckedException() {
        try {
            throw new Exception("Checked exception örneği.");
        } catch (Exception e) {
            System.err.println("Bir checked exception yakalandı: " + e.getMessage());
        }
    }

    /**
     * Call stack'i göstermek için bir örnek.
     * Exception, çağrı yığını boyunca nasıl yayıldığını gösterir.
     */
    public void demonstrateCallStack() {
        try {
            methodA();
        } catch (Exception e) {
            System.err.println("Hata call stack boyunca yakalandı: " + e.getMessage());
        }
    }

    private void methodA() throws Exception {
        methodB();
    }

    private void methodB() throws Exception {
        throw new Exception("Call stack'te hata fırlatıldı.");
    }

    /**
     * Compile-time error hakkında açıklama.
     * Bu tür hatalar kod yazımında oluşur ve program derlenemez. Örnek olarak aşağıdaki satırı aktif hale getirerek deneyebilirsiniz.
     */
    public void demonstrateCompileTimeError() {
        // int number = "string"; // Bu satır syntax hatasına neden olur, çünkü string bir değeri int'e atayamazsınız.
    }

    /**
     * Error türleri hakkında açıklama ve örnek.
     * Bu tür hatalar genellikle sistem kaynaklıdır ve genelde program tarafından yönetilemez.
     */
    public void demonstrateError() {
        try {
            // Bu örnek, büyük bir array oluşturmayı dener ve OutOfMemoryError fırlatabilir.
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.err.println("Hata: Sistem kaynağı yetersiz. " + e.getMessage());
        }
    }
}
