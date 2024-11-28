package lecture_notes.lecture4;

// Lecture 2.6 - Classes - Methods
// Bu ders, Java'da metotların nasıl çalıştığını detaylı olarak açıklar.

public class L01_Methods {

    // Sınıf içindeki değişkenler
    String name = "Abraham"; // Varsayılan isim

    // 1. Metot Tanımlama ve Kullanımı
    public void clap() {
        // "clap()" metodu, bir mesaj yazdırır.
        System.out.println(name + " claps its flippers!");
    }

    // 2. Parametre Alan ve Geri Dönüş Değeri Döndüren Bir Metot
    public int computeArea(int x, int y) {
        // Verilen iki sayıyı çarpar ve sonucu döndürür.
        return x * y;
    }

    // 3. Yaş Hesaplama Metodu
    public int computeAgeInMonths(int ageInYears) {
        // Yılları aylara çevirir.
        return ageInYears * 12;
    }

    // 4. Void Bir Metot (Geri Dönüş Değeri Olmayan)
    public void greet(String name) {
        // Kullanıcıya selamlama mesajı yazar.
        System.out.println("Hello, " + name + "!");
    }

    // 5. Hatalı Kullanımı Gösterme
    public void demonstrateError() {
        // Farklı türden bir nesne kullanımı hatasına örnek.
        Seal roland = new Seal();
        // roland.clap();  // Yorumdan çıkarılırsa derleme hatası verir, çünkü Seal sınıfı clap() metoduna sahip değil.
    }

    public static void main(String[] args) {
        // 6. Yeni Bir Walrus Nesnesi Oluşturma ve clap() Kullanımı
        L01_Methods walrus = new L01_Methods();
        walrus.clap(); // Çıktı: Abraham claps its flippers!

        // 7. computeArea Metodu ile Alan Hesaplama
        int area = walrus.computeArea(5, 10);
        System.out.println("The area of the rectangle is: " + area); // Çıktı: 50

        // 8. Yaş Hesaplama (computeAgeInMonths Metodu)
        int ageInMonths = walrus.computeAgeInMonths(5);
        System.out.println("Age in months: " + ageInMonths); // Çıktı: 60

        // 9. Selamlaşma (greet Metodu)
        walrus.greet("Alice"); // Çıktı: Hello, Alice!

        // 10. İsmi Değiştirerek clap() Kullanımı
        walrus.name = "Roxanne";
        walrus.clap(); // Çıktı: Roxanne claps its flippers!
    }
}

// Yardımcı sınıf Seal
class Seal {
    // Seal sınıfının şu an bir metodu yok, sadece örnek için var.
}

