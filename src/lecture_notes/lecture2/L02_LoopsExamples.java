package lecture_notes.lecture2;

public class L02_LoopsExamples {

    // 1. While loop example: Basit while döngüsü
    public static void exampleWhileLoop() {
        int iterations = 0;

        // Bu döngü 15 iterasyon yapar
        while (iterations < 15) {
            System.out.println(iterations + ": This while-loop is now executing!");
            iterations++; // iterations değeri arttırılmalı yoksa sonsuz döngü olur
        }
    }

    // 2. Do-While loop example: Do-While döngüsü
    public static void exampleDoWhileLoop() {
        String customerId;
        do {
            System.out.println("Enter valid customer ID: ");
            customerId = "valid"; // Farz edelim ki kullanıcı geçerli bir ID giriyor
        } while (customerId.isEmpty());  // Boş ID girilene kadar döngü devam eder
    }

    // 3. For loop example: Basit for döngüsü
    public static void exampleForLoop() {
        // 0'dan 14'e kadar olan sayılarla döngü
        for (int i = 0; i < 15; i++) {
            System.out.println(i + ": This for-loop is now executing!");
        }
    }

    // 4. Nested Loops (İç içe döngüler) örneği
    public static void exampleNestedLoops() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }

    // 5. Break ve Continue örnekleri
    public static void exampleBreakAndContinue() {
        // break kullanımı
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Döngüyü 5'e gelince durdur
            }
            System.out.println(i);
        }

        // continue kullanımı
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Çift sayıları atla
            }
            System.out.println(i); // Yalnızca tek sayılar yazdırılacak
        }
    }

    // 6. Sonsuz Döngü (Dangerous Infinite Loop) örneği
    public static void exampleInfiniteLoop() {
        // Bu döngü sürekli olarak çalışır çünkü koşul her zaman true'dur
        while (true) {
            System.out.println("Bu döngü sonsuza kadar çalışacak!");
            // Döngüyü sonlandırmak için bir break komutu ekleyebiliriz
        }
    }

    // 7. Döngülerde Performans Optimizasyonu
    public static void exampleLoopOptimization() {
        // Örnek olarak gereksiz hesaplamalardan kaçınmak
        // Bu şekilde her döngüde hesaplama yapmanın yerine dışarıda hesaplamayı yapabiliriz
        int result = expensiveCalculation();
        for (int i = 0; i < 100; i++) {
            System.out.println("Loop Iteration: " + i);
            System.out.println("Cached result: " + result);
        }
    }

    public static int expensiveCalculation() {
        // Bu işlem çok pahalı bir hesaplama olabilir
        return 42;  // Farz edelim ki pahalı bir işlem sonucunu döndürüyoruz
    }

    // 8. For-Each loop örneği: Koleksiyonlar üzerinde döngü
    public static void exampleForEachLoop() {
        int[] numbers = {1, 2, 3, 4, 5};

        // For-Each döngüsü ile array üzerinde gezinme
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // 9. Birkaç döngüyü birleştiren karmaşık döngü örneği
    public static void complexLoopExample() {
        for (int i = 0, j = 10; i < 5 && j > 0; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }

    public static void main(String[] args) {
        // Döngü örneklerini çağırma

        System.out.println("While Loop Example:");
        exampleWhileLoop();

        System.out.println("\nDo-While Loop Example:");
        exampleDoWhileLoop();

        System.out.println("\nFor Loop Example:");
        exampleForLoop();

        System.out.println("\nNested Loops Example:");
        exampleNestedLoops();

        System.out.println("\nBreak and Continue Example:");
        exampleBreakAndContinue();

        System.out.println("\nInfinite Loop Example (bu kodu dikkatlice çalıştırın):");
        //exampleInfiniteLoop();  // Sonsuz döngü olduğu için bu satırı dikkatlice çalıştırın!

        System.out.println("\nLoop Optimization Example:");
        exampleLoopOptimization();

        System.out.println("\nFor-Each Loop Example:");
        exampleForEachLoop();

        System.out.println("\nComplex Loop Example:");
        complexLoopExample();
    }
}