package lecture_notes.lecture3;

public class L05_Constructors {

    // Constructors (Yapıcılar)
    // Constructor'lar, bir sınıftan yeni nesneler oluşturmak için kullanılan özel metotlardır.
    // Constructor, geri dönüş tipi (void bile!) olmayan, ve her zaman sınıf adıyla aynı adı taşıyan bir metottur.
    // Constructor'lar sayesinde nesneleri oluştururken field değerlerini kolayca belirtebilirsiniz.

    // Walrus Sınıfı Örneği
    class Walrus {
        // Field'lar (Alanlar)
        private int age; // Yaş
        private String name; // İsim
        private double weight; // Ağırlık

        // Default Constructor (Varsayılan Yapıcı)
        public Walrus() {
            this.age = 0;
            this.name = "Unknown";
            this.weight = 0.0;
            System.out.println("Yeni bir Walrus oluşturuldu!");
        }

        // Constructor Overloading (Aşırı Yükleme) - Tek Parametreli Constructor
        public Walrus(String name) {
            this(); // Varsayılan constructor'ı çağırır
            this.name = name;
        }

        // Constructor Overloading - Tüm Field'lar İçin Constructor
        public Walrus(int age, String name, double weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }

        // Getter ve Setter Metodları
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public double getWeight() {
            return weight;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }

    public void demonstrateConstructors() {
        // Default Constructor ile Nesne Oluşturma
        Walrus defaultWalrus = new Walrus();
        System.out.println("Default Walrus - Name: " + defaultWalrus.getName() + ", Age: " + defaultWalrus.getAge());

        // Tek Parametreli Constructor ile Nesne Oluşturma
        Walrus namedWalrus = new Walrus("Abraham");
        System.out.println("Named Walrus - Name: " + namedWalrus.getName());

        // Tüm Parametreli Constructor ile Nesne Oluşturma
        Walrus fullWalrus = new Walrus(14, "Thelonius", 165.4);
        System.out.println("Full Walrus - Name: " + fullWalrus.getName() + ", Age: " + fullWalrus.getAge() +
                ", Weight: " + fullWalrus.getWeight());
    }

    // Constructor'ların Faydaları
    // 1. Field'ların Başlangıç Değerlerini Kolayca Belirlemek: Nesne oluşturulurken değerleri belirtebilirsiniz.
    // 2. Kodun Anlamlılığı: Default değerlerle veya belirli argümanlarla nesne oluşturmayı kolaylaştırır.
    // 3. Constructor Overloading: Farklı argüman kombinasyonları için aynı sınıfta birden fazla constructor tanımlanabilir.
    // 4. Kod Tekrarını Azaltma: `this()` kullanarak bir constructor başka bir constructor'ı çağırabilir.
}

