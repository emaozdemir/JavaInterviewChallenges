package lecture_notes.lecture3;

public class L03_Fields {

    // Objeler ve Class'lar
    // Objeler, bir class (şablon veya tarif) temel alınarak oluşturulur.
    // Class'lar, bir objenin yapısını ve davranışını tanımlar.

    // Fields (Alanlar)
    // Bir class'ın gövdesi içinde tanımlanan değişkenlere "field" denir.
    // Field'lar yalnızca tanımlandıkları class içinde bulunur ve dışarıdan erişimleri
    // "access modifiers" (erişim belirleyiciler) kullanılarak kısıtlanabilir.
    // Eğer bir field'a class dışından erişmek istiyorsak, bunu `public` olarak açıkça belirtmemiz gerekir.
    // Access modifiers hakkında daha fazla bilgiyi bir sonraki derste inceleyeceğiz.

    // Örnek: Walrus class'ında birkaç field tanımlama
    class Walrus {
        int age;           // Yaş bilgisi (integer türünde)
        double weight;     // Ağırlık bilgisi (double türünde)
        String name;       // İsim bilgisi (String türünde)

        // Field'lar için default değerler (varsayılan değerler)
        // Eğer bir field tanımlanır ve herhangi bir değer atanmazsa, Java bu field'a varsayılan bir değer atar.
        // Örneğin, aşağıdaki `tuskLength` field'ı herhangi bir değer atanmadığı için varsayılan değer alacaktır.
        double tuskLength; // Morsun diş uzunluğu (double türünde)
    }

    public void demonstrateFields() {
        // Obje oluşturma
        Walrus abraham = new Walrus(); // Yeni bir Walrus objesi oluşturuldu.

        // Field'lara erişim
        // Field'lara erişmek için obje referansı ve `.` operatörü kullanılır.
        abraham.age = 10;       // Yaş bilgisini ayarla
        abraham.weight = 1200.5; // Ağırlık bilgisini ayarla
        abraham.name = "Abraham"; // İsmini ayarla

        // Field değerlerini yazdırma
        System.out.println("Name: " + abraham.name);
        System.out.println("Age: " + abraham.age);
        System.out.println("Weight: " + abraham.weight);
        System.out.println("Tusk Length (default): " + abraham.tuskLength); // Varsayılan değer (0.0)
    }

    // Java'nın Varsayılan Değerleri
    // Java, bir field'a değer atanmamışsa, bu field'a aşağıdaki varsayılan değerleri atar:
    // - Tam sayılar için: 0
    // - Ondalıklı sayılar için: 0.0
    // - Boolean için: false
    // - Nesneler (örneğin String) için: null
    // Daha fazla bilgi için Java dokümantasyonuna göz atabilirsiniz:
    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
}
