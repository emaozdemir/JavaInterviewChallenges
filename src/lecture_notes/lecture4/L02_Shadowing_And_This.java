package lecture_notes.lecture4;

public class L02_Shadowing_And_This {

    // Instance variable (alan değişkeni)
    int weight;

    // Constructor: Objenin ilk değerlerini belirler
    public L02_Shadowing_And_This(int weight) {
        // `this.weight`, sınıfın instance değişkenini ifade eder.
        // Parametreden gelen `weight` local değişkeni temsil eder.
        this.weight = weight;
    }

    // Shadowing problemi olan method
    public int addWeightWithShadowing(int weight) {
        // Burada instance değişken olan `weight` gölgeleniyor
        // ve method parametresi olan `weight` kullanılıyor.
        return weight + weight; // Local değişken iki kez toplanır.
    }

    // `this` kullanarak shadowing problemini çözen method
    public int addWeight(int weight) {
        // `this.weight`, objenin instance değişkenini ifade eder.
        // Method parametresi olan `weight` ile instance değişkeni toplar.
        return this.weight + weight;
    }

    // Main method: Kodun çalıştığı yer
    public static void main(String[] args) {
        // Yeni bir obje oluşturuyoruz ve instance değişkenini 100 yapıyoruz
        L02_Shadowing_And_This walrus = new L02_Shadowing_And_This(100);

        // Shadowing problemi örneği
        System.out.println("Shadowing sonucu: " + walrus.addWeightWithShadowing(25));
        // `this` kullanımı ile shadowing probleminin çözümü
        System.out.println("this kullanımı ile çözüm: " + walrus.addWeight(25));
    }
}
