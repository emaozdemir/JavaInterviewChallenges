package lecture_notes.lecture5;

// Enum sınıfları sabit bir değerler kümesini saklamak için kullanılır.
public class EnumExample {

    // 1. Enum Tanımlama
    // Enum, "enumerated type" kısaltmasıdır ve önceden tanımlanmış sabit değerleri saklayan özel bir sınıftır.
    // Enum içindeki sabitler genelde büyük harflerle (CAPITAL LETTERS) yazılır.
    public enum Directions {
        NORTH, // Kuzey yönü
        EAST,  // Doğu yönü
        SOUTH, // Güney yönü
        WEST   // Batı yönü
    }

    public static void main(String[] args) {
        // 2. Enum Değerlerini Döngüyle Gezme
        // Enums, bir dizi (Array) gibi davranabilir ve .values() metodu ile tüm değerlerini döndürebilir.
        // Enhanced for-loop kullanarak tüm değerler üzerinde gezilebilir.
        System.out.println("Directions Enum Values:");
        for (Directions d : Directions.values()) {
            System.out.println(d); // Her bir sabiti ekrana yazdırır.
        }

        // 3. Kullanım Örneği
        // Enum sabitleri bir değişkene atanabilir ve kontrol için kullanılabilir.
        Directions myDirection = Directions.NORTH; // Yön olarak NORTH atanıyor.
        System.out.println("My Direction: " + myDirection);

        // Kontrol Örneği: Hangi yöne gidiyoruz?
        if (myDirection == Directions.NORTH) {
            System.out.println("We are heading NORTH!"); // Eğer yön NORTH ise bu mesaj yazdırılır.
        }
    }
}

// NOT:
// - Bu enum tanımı genelde ayrı bir .java dosyasında saklanır ve gerektiğinde kullanılır.
// - Örneğin, Directions.java dosyasında tanımlanabilir ve diğer sınıflarda referans alınabilir.
// - Daha fazla bilgi için Oracle Java Tutorials sayfasını inceleyebilirsiniz:
//   https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
