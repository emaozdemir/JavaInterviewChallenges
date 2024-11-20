package lecture_notes.lecture1;

public class L01_Variables {
    /*
    **JShell Kullanımı:**
    - Java'da ifadeler doğrudan terminalde çalıştırılamaz. Ancak `jshell` aracıyla değişken tanımları, ifadeler ve döngüler
      hızlı bir şekilde test edilebilir.
    - `jshell` komutuyla çalıştırılır.
    */

    /*
    **1. Değişkenler (Variables):**
    - Bir değişken, bellekte bilgi depolanan bir alana verilen isimdir.
    - Değişkenler, zamanla değişebilecek veya yeniden kullanılacak bilgileri saklamak için kullanılır.
    - Örnek:
    */
    int age; // `age` isminde bir tam sayı değişkeni tanımlar.

    /*
    - Tanımlanan değişkene varsayılan bir değer atanır.
      Örneğin, int türünde bir değişkenin varsayılan değeri 0'dır.
    */

    /*
    **2. Değişken Adlandırma Kuralları (Variable Naming Rules):**
    - Değişken isimleri büyük/küçük harfe duyarlıdır. Örneğin, `age` ve `Age` farklı değişkenlerdir.
    - Bir değişken adı harf, rakam, `_` (alt çizgi) ve `$` (dolar işareti) içerebilir.
    - Ancak değişken adı rakamla başlayamaz. Örneğin:
    */
    // int 1student; // Geçersiz örnek
    int studentCount; // Geçerli bir örnek.
    int x; // Anlamı belirsiz bir isim.

    /*
    - Uzun isimlerde camelCase formatı yaygındır: `numberOfBooks`.
    */

    /*
    **3. Değer Atama (Value Assignment):**
    - Tanımlanan bir değişkene `=` operatörü ile bir değer atanabilir.
    - Örnek:
    */
    int age1 = 25; // `age1` değişkenine 25 atanır.

    /*
    - Değer güncelleme: Atanan değer daha sonra değiştirilebilir.
    */
   // age1 =30; // Yeni değer atanır.

    /*
    - Bir değişkenin değeri başka bir değişkene atanabilir.
    */
    int currentAge = 25;
    int nextAge = currentAge; // `currentAge` değeri `nextAge` değişkenine atanır.

    /*
    **4. Sabitler (Constants):**
    - Sabitler, değerleri değiştirilemeyen değişkenlerdir.
    - `final` anahtar kelimesiyle tanımlanır.
    */
    final double PI = 3.14159;

    /*
    - Sabitler genellikle büyük harflerle adlandırılır:
      Örnek: `final int MAX_SPEED = 120;`
    - Sabitler, kodda birden fazla yerde kullanılan sabit değerlerin yönetimini kolaylaştırır.
    - Sabit bir değişkenin değerini değiştirmeye çalışırsanız derleme hatası alırsınız.
    */
}
