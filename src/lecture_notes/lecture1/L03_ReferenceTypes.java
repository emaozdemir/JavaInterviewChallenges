package lecture_notes.lecture1;

public class L03_ReferenceTypes {
    /*
    **Reference Types (Referans Tipleri):**
    - Java, nesne tabanlı (object-oriented) bir dildir. Bu, primitive veri türlerinden daha karmaşık veri tiplerinin
      <i>class</i> (sınıf) oluşturarak yaratılabileceği anlamına gelir.
    - Yeni bir sınıf oluşturduğumuzda, aynı zamanda yeni bir veri türü yaratmış oluruz.
    - Örneğin, bir `Parrot` (papağan) sınıfı oluşturduğumuzu varsayalım:
        - Bu, bir `Parrot` veri tipi oluşturduğumuz anlamına gelir.
        - Tıpkı primitive veri tiplerinde olduğu gibi, bir `Parrot` nesnesi, `Parrot` türünde bir değişkene atanabilir.
    */

    /*
    **Polymorphism (Çok Biçimlilik):**
    - Referans tiplerinden bahsedebilmek için sınıflardan da kısaca bahsetmeliyiz. Daha sonra sınıflar hakkında detaylı bilgi verilecek.
    - Sınıflar ve veri türleri arasında ilişkiler olabilir.
    - Örneğin:
        - Bir `Bird` (Kuş) sınıfı `Parrot` için üst sınıf (parent class) olabilir.
        - `Parrot` sınıfı `Bird` sınıfının bir alt sınıfı (sub-class) olur ve ek özelliklere sahip olabilir.
        - Örnek: `Parrot` sınıfına sadece papağanlar için bir `speak()` (konuş) metodu eklenebilir.
    - Alt sınıf (sub-class), üst sınıfı (parent class) genişletir (extends).
    - Veri türleri arasındaki ilişkide:
        - Alt türler (subtype) her zaman üst türlere (parent type) atanabilir.
        - Örneğin: Bir papağan her zaman bir kuştur, ama her kuş bir papağan değildir.
        - Buna **subtype polymorphism** denir.
    */

    /*
    **References (Referanslar):**
    - Referans tipleri, <i>referans</i> olarak atanır.
    - Primitive tipler <i>değer</i> olarak atanır.
    - Primitive bir değişken kopyalandığında, yalnızca değeri kopyalanır.
    - Referans tiplerinde, değişkenler nesnenin kendisini değil, o nesneye bir referans (adres) taşır.
    - Örnek:
    */
    static class Parrot {
        // Boş bir sınıf örneği
    }

    public static void main(String[] args) {
        // Yeni bir Parrot nesnesi oluşturup bir değişkene atayalım:
        Parrot paulie = new Parrot(); // `paulie` bir Parrot nesnesine referans taşır.
        Parrot jones = new Parrot(); // Yeni bir nesne oluşturulur.

        // Referans paylaşımı:
        Parrot doris = paulie; // `doris` değişkeni `paulie` ile aynı nesneye referans taşır.
        System.out.println(paulie == doris); // true (aynı nesneye işaret ederler)
        System.out.println(paulie == jones); // false (farklı nesneler)
    }

    /*
    - Özetle:
        - Referans tip değişkenler kopyalandığında, nesne kopyalanmaz, sadece referans kopyalanır.
        - Aynı referansa sahip değişkenler aynı nesneyi temsil eder.
    */

    /*
    **Strings (Dizgeler):**
    - `String` özel bir referans tipidir, ancak bazı durumlarda primitive gibi davranır.
    - Örnek: İki String toplama (`+`) operatörü ile birleştirilebilir:
        */
    String greeting = "Hello, " + "World!";
    // System.out.println(greeting); // "Hello, World!"

    /*
    - Literaller ile kullanılabilir:
        - Örnek: `System.out.print("Merhaba Dünya!");`
    - Değişken ataması sırasında `new` kullanmak zorunlu değildir:
        */
    String name = "Java"; // Doğrudan atama yapılabilir.
    /*
    **Null:**
    - `null`, herhangi bir referans tipine atanabilen özel bir değerdir.
    - Ancak primitive türlere atanamaz.
    - `null`, bir nesnenin olmadığını belirtmek için kullanılır.
    */
}
