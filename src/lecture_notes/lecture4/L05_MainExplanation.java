package lecture_notes.lecture4;

public class L05_MainExplanation {

    // Instance Variables
    // Bu, sınıfın her örneği (object) için geçerli olan değişkenlerdir.
    private String name;  // Ad
    private int age;      // Yaş

    // Constructor
    // Constructor, yeni bir nesne oluşturulduğunda otomatik olarak çağrılır.
    public L05_MainExplanation(String name, int age) {
        this.name = name;  // 'this' ile nesneye ait değişkenlere erişilir.
        this.age = age;
    }

    // Instance Method
    // Bu metod sadece nesne üzerinden çağrılabilir.
    public void displayDetails() {
        System.out.println("Name: " + this.name);  // Nesneye ait 'name' değişkeni yazdırılır.
        System.out.println("Age: " + this.age);    // Nesneye ait 'age' değişkeni yazdırılır.
    }

    // Static Method
    // Bu metod 'static' olarak tanımlandığı için nesne oluşturmadan doğrudan sınıf üzerinden çağrılabilir.
    public static void describeMainMethod() {
        // Java'daki main() methodunun bileşenlerini açıklıyoruz
        System.out.println("Java'daki main() methodunun bileşenleri:");
        System.out.println("1. `public`: JVM'in (Java Virtual Machine) methoda erişebilmesi için gereklidir.");
        System.out.println("2. `static`: Nesne oluşturmadan çağrılabilir.");
        System.out.println("3. `void`: main() bir değer döndürmez.");
        System.out.println("4. `String[] args`: Programın komut satırı argümanlarını alabilir.");
    }

    // Main methodu, Java programlarında uygulamanın başlatıldığı yerdir.
    public static void main(String[] args) {
        // 1. Static Method çağrısı
        // Static methodları sınıf üzerinden çağırabiliriz, nesne oluşturmaya gerek yoktur.
        System.out.println("Static Method Örneği:");
        L05_MainExplanation.describeMainMethod();  // 'describeMainMethod' static methodunu çağırıyoruz.

        // 2. Yeni nesneler oluşturuluyor
        System.out.println("\nYeni Nesne Oluşturma:");
        L05_MainExplanation example1 = new L05_MainExplanation("Roxanne", 5);  // Nesne oluşturuluyor
        L05_MainExplanation example2 = new L05_MainExplanation("Abraham", 7);  // Diğer nesne oluşturuluyor

        // 3. Instance Method çağrıları
        // Instance methodları sadece nesne üzerinden çağrılabilir.
        System.out.println("\nInstance Method Örneği:");
        example1.displayDetails();  // İlk nesnenin detaylarını yazdırıyoruz
        example2.displayDetails();  // İkinci nesnenin detaylarını yazdırıyoruz

        // 4. main() methoduna komut satırı argümanları geçirme
        // args dizisini kontrol edip komut satırından gelen argümanları yazdırıyoruz
        System.out.println("\nKomut Satırı Argümanları:");
        if (args.length > 0) {
            System.out.println("Girilen argümanlar:");
            for (String arg : args) {
                System.out.println(arg);  // Argümanları tek tek yazdırıyoruz
            }
        } else {
            System.out.println("Hiçbir argüman girilmedi.");  // Eğer argüman girilmediyse bilgilendirme
        }
    }
}
