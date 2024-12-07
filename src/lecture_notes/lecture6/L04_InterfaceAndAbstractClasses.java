package lecture_notes.lecture6;

public class L04_InterfaceAndAbstractClasses {
    /*
     - Interfaces and Abstract Classes Combined
    ---------------------------------
    Hem interface hem de abstract sınıflar Java'da polimorfizm sağlamak için kullanılır, ancak farklı amaçlar için tercih edilir.
    Bu örnekte:
    - **Interface**: Tüm silahların ortak davranışlarını (sözleşmesini) tanımlamak için kullanılır.
    - **Abstract Class**: Paylaşılan özellikler ve varsayılan davranışlar için bir temel sağlar.

    ### Kullanım Senaryosu:
    Bir RPG oyununda farklı türde silahlar (Sword, Bow vb.) tanımlıyoruz:
    - **Weapon** Interface: Tüm silahların sahip olması gereken metotları tanımlar (`attack()` ve `drop()`).
    - **AbstractWeapon** Sınıfı: Ortak özellikleri (`name`, `damage`) ve bu özelliklere bağlı metotları içerir.
    - Alt sınıflar (`Sword`, `Bow`): Her silah türünün kendine özgü davranışlarını sağlar.
    */

    // Interface: Silahların davranış sözleşmesini tanımlar
    public interface Weapon {
        void attack(); // Silahın saldırı metodu
        void drop();   // Silahı bırakma metodu
    }

    // Abstract Class: Ortak özellikleri ve davranışları içerir
    public static abstract class AbstractWeapon implements Weapon {
        private String name; // Silahın adı
        private int damage;  // Hasar miktarı

        // Constructor
        public AbstractWeapon(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        // Ortak davranışları tanımlayan metot
        public void displayInfo() {
            System.out.println("Weapon Name: " + name + ", Damage: " + damage);
        }

        // drop() metodu tüm silahlar için aynıdır, override edilmeyebilir
        @Override
        public void drop() {
            System.out.println(name + " has been dropped!");
        }
    }

    // Sword Sınıfı: AbstractWeapon ve Weapon kullanarak tanımlanır
    public static class Sword extends AbstractWeapon {
        public Sword(String name, int damage) {
            super(name, damage);
        }

        @Override
        public void attack() {
            System.out.println("Swinging the sword with deadly precision!");
        }
    }

    // Bow Sınıfı: AbstractWeapon ve Weapon kullanarak tanımlanır
    public static class Bow extends AbstractWeapon {
        public Bow(String name, int damage) {
            super(name, damage);
        }

        @Override
        public void attack() {
            System.out.println("Shooting an arrow with expert aim!");
        }
    }

    /*
    ### Test Kod
    Abstract sınıf ve interface kombinasyonunu test etmek için ana sınıf.
    */
    public static class Main {
        public static void main(String[] args) {
            // Abstract sınıf üzerinden nesne oluşturulamaz
            // AbstractWeapon weapon = new AbstractWeapon("Generic Weapon", 10); // HATA!

            // Sword ve Bow nesneleri oluşturuluyor
            Sword excalibur = new Sword("Excalibur", 50);
            Bow longbow = new Bow("Longbow", 30);

            // Bilgi gösterimi ve saldırı
            System.out.println("Sword Info:");
            excalibur.displayInfo();
            excalibur.attack();
            excalibur.drop();

            System.out.println();

            System.out.println("Bow Info:");
            longbow.displayInfo();
            longbow.attack();
            longbow.drop();
        }
    }
}
