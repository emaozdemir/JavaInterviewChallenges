package lecture_notes.lecture1;

public class L01_Variables {
    /*
    **JShell Kullanımı:**
    - Java'da ifadeler doğrudan terminalde çalıştırılamaz. Ancak `jshell` aracıyla değişken tanımları, ifadeler ve döngüler
      hızlı bir şekilde test edilebilir.
    - `jshell` komutuyla çalıştırılır.
    */
    /*
      JShell (Java Shell) Kullanımı:
     * Java'da doğrudan terminalde kod yazmak ve çalıştırmak için `jshell` aracı kullanılabilir.
     * JShell, Java'nın etkileşimli bir REPL (Read-Eval-Print Loop) aracıdır.
     * Bu araç sayesinde, kodu yazıp derlemeden hemen çalıştırabilir ve sonuçları anında görebilirsiniz.
     * JShell, değişken tanımlamaları, ifadeler, döngüler, fonksiyonlar ve daha fazlası üzerinde hızlı testler yapmanıza olanak tanır.
     * Özellikle öğrenme süreçlerinde veya hızlı prototipleme yaparken faydalıdır.
     * JShell'i başlatmak için terminalde `jshell` komutunu yazabilirsiniz. Çıktı hemen ekrana yazdırılır ve kodun her adımını kolayca test edebilirsiniz.
     * Örnek kullanım:
     * 1. `jshell> int a = 10;` - Değişken tanımlama
     * 2. `jshell> a + 5;` - Hızlı ifade testi
     * 3. `jshell> for (int i = 0; i < 5; i++) { System.out.println(i); }` - Döngü çalıştırma
     * 4. Çıkmak için `jshell> /exit` komutunu kullanabilirsiniz.
     */

    /*
    Java 9 ile tanıtıldı. Yani 2017 yılında Java 9 sürümüyle birlikte Java diline eklenen bir özellikti. JShell,
    Java kodlarını etkileşimli bir şekilde terminal veya komut satırında yazmanıza ve hemen çalıştırmanıza olanak tanır.
     Bu, Java'nın daha önce yalnızca derlenmiş ve çalıştırılmış programlar aracılığıyla kullanılmasını değiştiren bir adımdı.
     ** jshell Kullanımı:
     ** jshell, Java kodlarını hızlı bir şekilde test etmek için kullanılan bir araçtır.
     ** Aşağıda bir kaç işlem örneği ve çıkışlarını görebilirsiniz.


    jshell> int a = 10;   // a değişkenine 10 değerini atıyoruz.
    jshell> a + 5;        // a'ya 5 ekliyoruz. Çıktı: 15

    jshell> double b = 3.14;   // b değişkenini double türünde tanımlıyoruz.
    jshell> b * 2;              // b'yi 2 ile çarpıyoruz. Çıktı: 6.28

    jshell> String name = "Java";  // name değişkenini bir String olarak tanımlıyoruz.
    jshell> name + " is awesome!";  // name değişkenine bir metin ekliyoruz. Çıktı: "Java is awesome!"

    jshell> boolean isActive = true;  // isActive adında bir boolean değişkeni tanımlıyoruz.
    jshell> isActive && false;  // isActive ve false arasında "ve" işlemi yapıyoruz. Çıktı: false

/exit  // jshell'den çıkış yapıyoruz.
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
