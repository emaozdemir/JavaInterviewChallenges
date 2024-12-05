package lecture_notes.lecture5;

public class Arrays {

    public static void main(String[] args) {
        // 1. Dizi Tanımlama
        // Bir dizi tanımlamak için tipin ardından [] kullanıyoruz.
        char[] charArray; // char tipinde bir dizi
        Walrus[] walrusArray; // Walrus sınıfından bir dizi

        // 2. Dizi Oluşturma
        // Bir dizi oluşturmak için 'new' anahtar kelimesini kullanıyoruz ve uzunluğu belirtiyoruz.
        charArray = new char[3]; // 3 elemanlı bir char dizisi
        walrusArray = new Walrus[2]; // 2 elemanlı bir Walrus dizisi

        // 3. Diziye Erişim
        // Dizi elemanlarına indeks numarası ile erişilir.
        walrusArray[0] = new Walrus(); // İlk elemanına yeni bir Walrus nesnesi atıyoruz.
        walrusArray[1] = new Walrus("Fred", 1200, 35); // İkinci elemanına değer atayarak yeni bir nesne oluşturuyoruz.

        // 4. Dizi Elemanlarına Erişim ve Atama
        // Dizi elemanlarına erişmek ve değer atamak için köşeli parantez [] kullanılır.
        System.out.println("Walrus 0: " + walrusArray[0]); // Referansı yazdırır.
        System.out.println("Walrus 1 Name: " + walrusArray[1].name); // İkinci nesnenin 'name' alanını yazdırır.

        // 5. Doğrudan Değer Atama
        // Dizi oluşturma sırasında değerleri doğrudan atayabilirsiniz.
        int[] oddNumbers = {1, 3, 5, 7, 9}; // Tek sayılar dizisi
        System.out.println("Second odd number: " + oddNumbers[1]); // 3'ü yazdırır.

        // Obje dizisi oluşturma
        Walrus[] walrusArray2 = {
                new Walrus(), // Varsayılan yapıcı ile
                new Walrus("Martha", 950, 28) // Özel değerler ile
        };

        // Dizi içindeki bir metodun çağrılması
        walrusArray2[1].speak(); // İkinci Walrus nesnesinin 'speak()' metodunu çağırır.
    }
}

// Ekstra: Walrus sınıfı
class Walrus {
    String name;
    int weight;
    int age;

    // Varsayılan yapıcı (constructor)
    public Walrus() {
        this.name = "Default";
        this.weight = 1000;
        this.age = 25;
    }

    // Parametreli yapıcı
    public Walrus(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    // Bir metod
    public void speak() {
        System.out.println(name + " says: Honk Honk!");
    }
}
