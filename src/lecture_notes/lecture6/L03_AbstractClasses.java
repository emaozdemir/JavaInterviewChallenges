package lecture_notes.lecture6;

public class L03_AbstractClasses {
    /*
    # L6.3 - Abstract Classes
    ---------------------------------
    `Abstract` sınıflar, yalnızca genişletmek (extend etmek) için kullanılan ve doğrudan
    örneklenemeyen (instantiate edilemeyen) sınıflardır. Bir `abstract` sınıf, soyut metodlar,
    normal metodlar ve değişkenler içerebilir.

    ## Abstract Sınıfın Avantajları
    - Bir sınıfın diğer sınıflara temel (base) olması için oluşturulur.
    - Soyut metodlar: Gövdesiz metodlardır ve alt sınıflarda (subclasses) override edilmelidir.
    - Normal metodlar: Alt sınıfların paylaşabileceği ortak davranışları tanımlamak için kullanılabilir.

    ## Abstract Sınıf Örneği
    Aşağıda bir `Weapon` abstract sınıfı ve bu sınıftan türeyen `Sword` ve `Bow` alt sınıfları bulunmaktadır.
    */

    // Abstract Sınıf Tanımı
    public static abstract class Weapon {
        private String name; // Silahın adı
        private int damage;  // Hasar miktarı

        // Constructor: Abstract sınıfın alanlarını başlatabilir
        public Weapon(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        // Soyut Metot: Alt sınıflar bu metodu override etmelidir
        public abstract void attack();

        // Normal Metot: Alt sınıflarda ortak kullanılabilir
        public void displayInfo() {
            System.out.println("Weapon Name: " + name + ", Damage: " + damage);
        }
    }

    // Abstract Sınıfı Genişleten Bir Alt Sınıf: Sword
    public static class Sword extends Weapon {
        public Sword(String name, int damage) {
            super(name, damage); // Üst sınıfın constructor'ını çağırır
        }

        @Override
        public void attack() {
            System.out.println("Swinging the sword with great force!");
        }
    }

    // Abstract Sınıfı Genişleten Bir Alt Sınıf: Bow
    public static class Bow extends Weapon {
        public Bow(String name, int damage) {
            super(name, damage); // Üst sınıfın constructor'ını çağırır
        }

        @Override
        public void attack() {
            System.out.println("Shooting an arrow with precision!");
        }
    }

    /*
    ## Abstract Sınıfların Kullanımı
    Abstract sınıflar ve interface'ler birbirine benzer şekilde kullanılabilir,
    ancak her biri farklı durumlarda daha uygundur.

    ### Abstract Sınıfları Tercih Etme Durumları:
    - Birbirine çok benzer sınıfları türetmek istiyorsanız (örneğin `Sword`, `Bow` gibi).
    - Ortak kodu paylaşmak için bir base sınıfa ihtiyaç duyuyorsanız.
    - `protected` veya `private` erişim belirleyicilerine ihtiyaç varsa.

    ### Interface Tercih Etme Durumları:
    - Farklı ve ilişkili olmayan sınıflara ortak bir davranış tanımlamak istiyorsanız.
    - Birden fazla türden miras almak istiyorsanız (Java'da çoklu kalıtım yalnızca interface'lerle yapılabilir).

    Aşağıdaki test kodu, abstract sınıfların nasıl kullanıldığını göstermektedir.
    */

    // Test Sınıfı
    public static class Main {
        public static void main(String[] args) {
            // Abstract sınıfın örneği doğrudan oluşturulamaz
            // Weapon weapon = new Weapon("Generic Weapon", 10); // Bu bir hata verecektir

            // Sword ve Bow nesneleri oluşturuluyor
            Sword sword = new Sword("Excalibur", 50);
            Bow bow = new Bow("Longbow", 30);

            // Bilgi gösterimi ve saldırı
            System.out.println("Sword Info:");
            sword.displayInfo();
            sword.attack();

            System.out.println();

            System.out.println("Bow Info:");
            bow.displayInfo();
            bow.attack();
        }
    }
}
