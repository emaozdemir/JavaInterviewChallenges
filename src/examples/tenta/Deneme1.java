package examples.tenta;

public class Deneme1 {

    // Static kaldırıldı, artık instance değişkenler
    String name;// default degerleri null
    int age;// 0

    public static void main(String[] args) {

        // Deneme sınıfından bir nesne oluşturuluyor
        Deneme1 obj = new Deneme1(); // Methodlardan bağımsız değişkenleri kontrol etmek için

        // Varsayılan (ilk) değerleri yazdır
        System.out.println("ilk hali: " + obj.name); // null
        System.out.println("ilk hali: " + obj.age); // 0

        // firstBayb() çağrılıyor, bu nesneye ait değerler değiştiriliyor
        obj.firstBayb();

        // secondBayb() çağrılıyor, bu nesneye ait değerler değiştiriliyor
        obj.secondBayb();

        // Üçüncü çocuk için metot çağrılıyor

        obj.ucuncuCocuk();

        obj.dordCocuk();

    }

    // Artık bu metot, bir nesneye ait instance değişkenleri değiştiriyor
    public void firstBayb() {
        age = 33;
        name = "sema";
        System.out.println("Birinci çocuğumun ismi: " + name);
        System.out.println("Birinci çocuğumun yaşı: " + age);
    }

    public void secondBayb() {
        age = 55;
        name = "mer";
        System.out.println("İkinci çocuğumun ismi: " + name);
        System.out.println("İkinci çocuğumun yaşı: " + age);
    }

    public void ucuncuCocuk() {
        name = "sems";
        age = 0; // Yaş belirtilmemiş, varsayılan değer
        System.out.println("Üçüncü çocuğumun ismi: " + name);
        System.out.println("Üçüncü çocuğumun yaşı: " + age);
    }
    public void dordCocuk() {
        name = "summyyr";
        age = 0; // Yaş belirtilmemiş, varsayılan değer
        System.out.println("dordunv: " + name);
        System.out.println("asdfg: " + age);
    }
}
