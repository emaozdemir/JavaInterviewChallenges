package lecture_notes.lecture8;

public class L02_TryCatchExample {
    public static void main(String[] args) {
        L02_TryCatchExample example = new L02_TryCatchExample();
        example.demonstrateTryCatch();
    }

    /**
     * Basit bir Array örneği üzerinden try-catch-finally kullanımını gösterir.
     */
    public void demonstrateTryCatch() {
        int[] myNumbers = {0, 1, 2, 3, 4};

        try {
            // Bu satır, ArrayIndexOutOfBoundsException fırlatır.
            int five = myNumbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hata yakalandığında kullanıcıya bilgi verir.
            System.err.println("Oops! Bu index mevcut değil: " + e.getMessage());
        } finally {
            // Bu blok her zaman çalıştırılır.
            System.out.println("Array işlem denemesi tamamlandı.");
        }
    }

    /**
     * Kullanıcı girdisi ile bir Array'e erişim örneği sağlar.
     */
    public void demonstrateUserInputHandling() {
        int[] myNumbers = {10, 20, 30, 40, 50};
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Lütfen bir index girin: ");
        try {
            int index = scanner.nextInt();
            System.out.println("Seçilen değer: " + myNumbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Hata: Array index sınırları dışında bir değer girdiniz.");
        } catch (java.util.InputMismatchException e) {
            System.err.println("Hata: Geçersiz giriş. Bir integer değeri giriniz.");
        } finally {
            System.out.println("Program sonlandırılıyor.");
            scanner.close();
        }
    }

    /**
     * Birden fazla catch bloğu örneği.
     */
    public void demonstrateMultipleCatches() {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException fırlatır
        } catch (NullPointerException e) {
            System.err.println("Hata: Null bir nesneye erişim denendi.");
        } catch (Exception e) {
            System.err.println("Genel bir hata yakalandı: " + e.getMessage());
        } finally {
            System.out.println("Hata yönetimi örneği tamamlandı.");
        }
    }
}


