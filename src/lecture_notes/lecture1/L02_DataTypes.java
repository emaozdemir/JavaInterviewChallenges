package lecture_notes.lecture1;

public class L02_DataTypes {
    /*
    Veri Tipleri (Data Types):
    Bir veri tipi, bir değişkende hangi tür bilginin saklanabileceğini ve bu bilgi üzerinde hangi işlemlerin yapılabileceğini belirler.
    Örnek:
      - `int` → Tam sayılar için (örneğin: 1, 100, -45).
      - `char` → Tek bir karakter için (örneğin: 'A', 'z').
      - `boolean` → Mantıksal değerler için (true/false).

    Notlar:
    - Java **statik olarak tür belirlenmiş (statically typed)** bir dildir, yani bir değişken tanımlarken türünü belirtmek zorundasınız.
    - Bir değişken bir tür ile tanımlandıktan sonra, yalnızca bu türe uygun veriler atanabilir.

    1. İlkel Veri Tipleri (Primitive Data Types):
       - Java, basit ve tanımlı değerleri temsil eden **ilkel veri tipleri** sağlar.
       - Bu tipler, dil tarafından doğrudan yönetilir ve bellekte verimli bir şekilde saklanır.

    2. İlkel Veri Tiplerinin Bellek Kullanımı:
       - Her ilkel veri tipi, bellekte sabit bir boyuta sahiptir ve belirli bir değer aralığını destekler.
       - Örnek:
         - `int` → 32-bit tam sayı, -2.1 milyar ile +2.1 milyar arasında değer saklar.
         - `byte` → 8-bit tam sayı, -128 ile 127 arasında değer saklar.
       - Küçük değerler için `byte` veya `short` gibi daha küçük türler kullanmak, performansı optimize edebilir.

    3. Yaygın İlkel Veri Tipleri ve Özellikleri:
       - Aşağıda Java'nın ilkel veri tiplerine hızlı bir bakış tablosu verilmiştir:

       | Tür         | Tanım                        | Aralık/Doğruluk Payı         |
       |-------------|-----------------------------|-----------------------------|
       | `boolean`   | Mantıksal değer             | `true` veya `false`         |
       | `char`      | 16-bit Unicode karakter     | 0 ile 65,535 (Unicode aralığı) |
       | `byte`      | 8-bit işaretli tam sayı     | -128 ile 127                |
       | `short`     | 16-bit işaretli tam sayı    | -32,768 ile 32,767          |
       | `int`       | 32-bit işaretli tam sayı    | -2.1e9 ile 2.1e9            |
       | `long`      | 64-bit işaretli tam sayı    | -9.2e18 ile 9.2e18          |
       | `float`     | 32-bit ondalıklı sayı       | ~6-7 ondalık basamak        |
       | `double`    | 64-bit ondalıklı sayı       | ~15 ondalık basamak         |

    4. Değer Atama (Assigning Values):
       - Bir değişkenin değeri, yalnızca tanımlandığı türün sınırlarına uygun olmalıdır.
       - Örnek:
         ```java
         byte score = 10; // Geçerli
         score = 127;     // Geçerli
         score = 128;     // Hata: `byte` sınırını aşıyor
         ```

       - Daha küçük bir tür (örneğin: `byte`), daha büyük bir türe (örneğin: `int`) sorunsuz bir şekilde atanabilir:
         ```java
         int largeNumber = score; // Geçerli
         ```
       - Ancak, büyük bir türü küçük bir türe atamak için **dönüştürme (casting)** gereklidir.

    5. Tür Dönüştürme (Casting):
       - Tür dönüştürme, bir değişkenin türünü başka bir türe çevirmeye olanak tanır.
       - Yazım: `(hedefTür) değişken`
       - Örnek:
         ```java
         int largeValue = 300;
         byte smallValue = (byte) largeValue; // `int` → `byte` dönüştürme
         ```
       - **Uyarı:** Tür dönüştürme, veri kaybına veya beklenmedik sonuçlara yol açabilir. Bu nedenle, değişkenleri doğru türde oluşturmak genellikle daha güvenlidir.

    Örnekler:
    ```java
    // Byte örneği:
    byte a = 8; // Geçerli
    a = 800;    // Hata: Değer aralığını aşıyor

    // Tür dönüştürme örneği:
    int b = 800;
    byte c = (byte) b; // Çalışır ancak değer kaybı olabilir
    ```
    */
}
