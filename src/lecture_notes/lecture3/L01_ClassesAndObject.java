package lecture_notes.lecture3;

public class L01_ClassesAndObject {

    // Nesneler ve Nesne Tabanlı Programlama
    // Nesne, kodumuzu daha küçük parçalara ayırmamıza olanak tanıyan temel bir yapı taşıdır.
    // Java, tamamen nesne yönelimli olarak tasarlanmıştır ve bu, nesne tabanlı sistemleri öğrenmek için mükemmel bir dildir.

    // Sınıflar
    // Java'da her şey bir sınıf aracılığıyla oluşturulur.
    // Sınıf, metotlar, değişkenler, başlatma kodları ve diğer sınıfları içerebilen bir kod segmentidir.
    // Sınıflar genişletilebilir (inheritance/miras alınabilir). Bu, bir sınıfın özelliklerini ve metodlarını yeni bir sınıfa aktarıp,
    // yeni işlevler ekleyebileceğimiz anlamına gelir.

    // Örnekler
    // Daha önce "HelloWorld" ve "HelloJava" adlı sınıflar yazdık, ancak bu sınıfların ne anlama geldiğini tam anlamamış olabiliriz.
    // Ayrıca Java'nın temel sınıflarından biri olan "System" sınıfını kullandık.
    // "javax.swing" paketinden "JFrame" ve "JLabel" sınıflarını ithal ettik.
    // Bunun yanı sıra, "String", "Scanner", "Parrot" ve "Bird" gibi sınıflarla da karşılaştık.

    // Java'nın Belgeleri
    // Bir sınıfın yöntemleri (metotları), değişkenleri ve hangi sınıftan türediği gibi bilgileri öğrenmek için
    // Oracle'ın sağladığı Java dokümantasyonu faydalı bir kaynaktır:
    // https://docs.oracle.com/en/java/javase/20/docs/api/index.html

    // System Sınıfı
    // "System" sınıfı, temel giriş ve çıkış işlemlerini gerçekleştirir.
    // Örneğin, konsola yazı yazdırmak için kullandığımız "System.out.println" bu sınıfın bir parçasıdır.
    // "System" sınıfı, "Object" adlı bir temel sınıftan türetilmiştir.

    // Object Sınıfı
    // "Object" sınıfı, Java'daki tüm sınıfların atasıdır.
    // Her sınıf, doğrudan ya da dolaylı olarak "Object" sınıfından türetilir.
    // Bu sınıf, bir sınıfın temel özelliklerini ve işlevlerini tanımlar.
    // Örneğin, tüm sınıflarda bulunabilen "toString()" ve "equals()" metotları, "Object" sınıfından gelir.

    // Paketler
    // Java'da sınıflar genellikle belirli bir pakete aittir. Örneğin, hem "System" hem de "Object" sınıfları,
    // "java.lang" paketine aittir. Paketler, sınıfları düzenlemeye ve gruplamaya yarar.
    // Paketler hakkında daha detaylı bilgi ileride ele alınacaktır.

}
