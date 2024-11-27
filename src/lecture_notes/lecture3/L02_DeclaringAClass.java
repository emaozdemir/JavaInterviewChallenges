package lecture_notes.lecture3;

public class L02_DeclaringAClass {

    // Objeler ve Class'lar
    // Nesne tabanlı programlamada, objeler bir blueprint (şablon) veya tarif olan class'lardan oluşturulur.
    // Bir class, bu objelerin yapısını ve davranışını tanımlar.

    // Class Tanımlama
    // Java'da bir class tanımlamak için:
    // 1. `class` anahtar kelimesini kullanın.
    // 2. Class adını büyük harfle başlayacak şekilde belirleyin (konvansiyon gereği).
    // 3. Class'ın gövdesini tanımlamak için `{}` süslü parantezlerini ekleyin.

    // Örnek: Basit bir class tanımlama
    // Bu örnek, "Walrus" adlı bir class'ın nasıl tanımlanabileceğini gösterir:
    class Walrus {
        // Şu anda bu class boş.
    }

    class Seal {
        // Bu class da şimdilik boş.
    }

    // Obje Oluşturma
    // Bir class tanımlandıktan sonra, bu class'tan obje (instance) oluşturabilirsiniz.
    public void createObjects() {
        // Objeleri referanslayan değişkenler tanımlama
        Walrus stefan = new Walrus(); // Walrus class'ından bir obje
        Seal roland = new Seal();     // Seal class'ından bir obje

        // Şu anda, `stefan` ve `roland`, ilgili class'ların boş objelerini ifade eder.
        // Class'lara işlevsellik eklenmesi gerekiyor.
    }

    // IDE'ye Geçiş
    // Class'lar oluşturup denemeye başladığınızda, bir IDE (örneğin VSCode) kullanmanız faydalı olur.
    // jshell, hızlı kod parçacıkları denemek için harikadır, ancak bir IDE, class'ları oluşturma, yönetme ve hata ayıklama için
    // daha fazla araç sunar. Geliştirme deneyiminizi iyileştirmek için VSCode ortamını keşfedin.
}
