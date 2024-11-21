package examples.tenta;

public class Deneme2 {

    // Static değişkenler (sınıf düzeyinde, sadece bir kez var)
    static String name;
    static int age;

    public static void main(String[] args) {

        // Tek bir nesne oluşturuluyor
        Deneme2 obj = new Deneme2();

        // İlk hali yazdırılıyor (Varsayılan değerler: null ve 0)
        System.out.println("İlk hali: " + name);  // null
        System.out.println("İlk hali: " + age);   // 0

        // firstBayb() metodu çağrılıyor
        obj.firstBayb();
        System.out.println("Son hali (firstBayb): " + name);  // sema
        System.out.println("Son hali (firstBayb): " + age);   // 33

        // secondBayb() metodu çağrılıyor
        obj.secondBayb();
        System.out.println("Son hali (secondBayb): " + name); // mer
        System.out.println("Son hali (secondBayb): " + age);  // 55

        // ucuncuCocuk() metodu çağrılıyor
        obj.ucuncuCocuk();
        System.out.println("Son hali (ucuncuCocuk): " + name); // sems
        System.out.println("Son hali (ucuncuCocuk): " + age);  // 0
    }

    // firstBayb() metodu
    public void firstBayb() {
        age = 33;  // Static değişkenler sınıf düzeyinde değişiyor
        name = "sema";  // Static değişkenler sınıf düzeyinde değişiyor
        System.out.println("Birinci çocuğumun ismi: " + name);
        System.out.println("Birinci çocuğumun yaşı: " + age);
    }

    // secondBayb() metodu
    public void secondBayb() {
        age = 55;
        name = "mer";
        System.out.println("İkinci çocuğumun ismi: " + name);
        System.out.println("İkinci çocuğumun yaşı: " + age);
    }

    // ucuncuCocuk() metodu
    public void ucuncuCocuk() {
        name = "sems";  // Static değişkenler sınıf düzeyinde değişiyor
        age = 0;  // Static değişkenler sınıf düzeyinde değişiyor
        System.out.println("Üçüncü çocuğumun ismi: " + name);
        System.out.println("Üçüncü çocuğumun yaşı: " + age);
    }
}

