package lecture_notes.lecture6;

public class L01_Inheritance {
    /*
     Inheritance
    ---------------------------------
    Inheritance (kalıtım), bir sınıfın başka bir sınıftan türetilerek onun özelliklerini
    ve metotlarını miras almasıdır. Bu, kod tekrarını azaltır ve nesne yönelimli programlama
    prensiplerinden biridir. Java'da kalıtım, polimorfizmi (polymorphism) gerçekleştirmek için
    kullanılan bir yöntemdir. Polimorfizm, bir değişkenin birden fazla veri tipine ait
    olabilmesi anlamına gelir. Bu, programın esnekliğini artırır.

    ## Subclasses and Superclasses
    - **Subclass (Alt Sınıf):** Bir sınıftan türeyen sınıftır.
    - **Superclass (Üst Sınıf):** Alt sınıfın türetildiği sınıftır.

    Örnek:
    `Bird` adında bir sınıfımız olduğunu düşünelim. Bu sınıf, `weight` ve `colour` değişkenlerine
    ve `MakeSound()` ve `Fly()` metotlarına sahip. `Parrot` adında bir alt sınıf oluşturduğumuzda,
    `Parrot` sınıfı bu değişkenleri ve metotları miras alır. Ancak `Parrot` sınıfı ayrıca
    kendine özel bir metot tanımlayabilir.

    ### Notlar:
    - Alt sınıf, üst sınıfın constructor (yapıcı metot) metodunu miras almaz.
    - `super` anahtar kelimesi, alt sınıfta üst sınıfın constructor veya metoduna erişmek
      için kullanılır.

    ## Kurallar
    1. Bir sınıf yalnızca bir üst sınıftan miras alabilir.
    2. Miras alınan alanlar (fields) doğrudan kullanılabilir.
    3. Alt sınıfta, üst sınıfla aynı ada sahip bir alan tanımlanabilir (bu önerilmez).
    4. Alt sınıfta, üst sınıfta olmayan yeni alanlar tanımlanabilir.
    5. Üst sınıftan miras alınan metotlar doğrudan kullanılabilir.
    6. Üst sınıftaki bir metot, alt sınıfta aynı imzayla yeniden yazılabilir (override).
    7. Üst sınıftaki bir statik metot, alt sınıfta aynı imzayla gizlenebilir (hiding).
    8. Alt sınıfta, üst sınıfta olmayan yeni metotlar tanımlanabilir.
    9. Alt sınıf constructor'ı, üst sınıf constructor'ını çağırabilir (`super` anahtar kelimesiyle).

    ## Kod Örnekleri
    */

    // Üst Sınıf: Bird
    public static class Bird {
        protected double weight;
        protected String colour;

        // Üst sınıf constructor
        public Bird(double weight, String colour) {
            this.weight = weight;
            this.colour = colour;
        }

        // Üst sınıf metotları
        public void MakeSound() {
            System.out.println("Bird makes sound!");
        }

        public void Fly() {
            System.out.println("Bird is flying.");
        }
    }

    // Alt Sınıf: Parrot
    public static class Parrot extends Bird {

        // Alt sınıf constructor, üst sınıf constructor'ını çağırır
        public Parrot(double weight, String colour) {
            super(weight, colour); // Üst sınıf constructor'ına erişim
        }

        // Parrot sınıfına özel metot
        public void Talk() {
            System.out.println("Parrot can talk!");
        }
    }

    // Ana Metot: Test sınıfı
    public static class Main {
        public static void main(String[] args) {
            // Üst sınıf nesnesi
            Bird genericBird = new Bird(0.5, "Gray");
            System.out.println("Generic bird:");
            genericBird.MakeSound();
            genericBird.Fly();

            System.out.println();

            // Alt sınıf nesnesi
            Parrot myParrot = new Parrot(1.2, "Green");
            System.out.println("Parrot:");
            myParrot.MakeSound(); // Üst sınıftan miras
            myParrot.Fly();       // Üst sınıftan miras
            myParrot.Talk();      // Alt sınıfa özel
        }
    }
}
