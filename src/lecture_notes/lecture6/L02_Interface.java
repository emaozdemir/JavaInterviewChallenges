package lecture_notes.lecture6;

public class L02_Interface {
    /*
      - Interface
    ---------------------------------
    Java'da polimorfizm oluşturmanın bir diğer yolu, `interface` anahtar kelimesini kullanmaktır.
    Bir interface, bir sınıf için bir tür sözleşme gibidir ve sınıfın belirli bir dizi değişken
    ve/veya metodu uygulaması gerektiğini belirtir.

    ## Neden Interface Kullanılır?
    Örneğin, bir macera oyununda farklı türde silahlar (`Sword`, `Spear`, `Club`, vb.) kullanıyoruz.
    Her silah türü için ayrı bir metot yazmak yerine (`Attack(Sword s)`, `Attack(Spear s)`, vb.),
    bir interface tanımlayabilir ve tüm silahlar için ortak bir davranış tanımlayabiliriz.

    ## Interface Tanımlama
    Bir interface, `interface` anahtar kelimesi kullanılarak tanımlanır. Örneğin:
    */

    // Interface Tanımı
    public interface Weapon {
        void Attack(); // Saldırı metodu
        void Drop();   // Silahı bırakma metodu
    }

    /*
    Yukarıdaki `Weapon` interface'inde, `Attack()` ve `Drop()` adında iki metot bulunur.
    Bu interface'i uygulayan herhangi bir sınıf, bu metotları içermelidir. Eğer metotlar
    tanımlanmazsa, derleyici hata verecektir.
    */

    // Interface'i Uygulayan Sınıf: Sword
    public static class Sword implements Weapon {
        @Override
        public void Attack() {
            System.out.println("Swinging the sword for an attack!");
        }

        @Override
        public void Drop() {
            System.out.println("Dropping the sword.");
        }
    }

    // Interface'i Uygulayan Sınıf: Spear
    public static class Spear implements Weapon {
        @Override
        public void Attack() {
            System.out.println("Thrusting the spear for an attack!");
        }

        @Override
        public void Drop() {
            System.out.println("Dropping the spear.");
        }
    }

    /*
    ## Interface Kullanımı
    Interface'ler sayesinde bir sınıf, hem kendi türünde hem de interface türünde
    bir nesne gibi davranabilir. Bu, polimorfizm sağlar ve kodun esnekliğini artırır.

    Aşağıdaki örnekte, bir `Adventurer` sınıfı tanımlıyoruz. Bu sınıfta, bir `Weapon` türünde
    değişken kullanılarak farklı türdeki silahlar tek bir metotla işlenebilir.
    */

    public static class Adventurer {
        public void playerAttack(Weapon weapon) {
            System.out.println("Adventurer is attacking!");
            weapon.Attack();
        }
    }

    // Test Sınıfı
    public static class Main {
        public static void main(String[] args) {
            // Silah nesneleri oluşturma
            Sword sword = new Sword();
            Spear spear = new Spear();

            // Maceracı nesnesi
            Adventurer adventurer = new Adventurer();

            // Maceracının saldırıları
            System.out.println("Using the sword:");
            adventurer.playerAttack(sword);

            System.out.println();

            System.out.println("Using the spear:");
            adventurer.playerAttack(spear);
        }
    }
}
