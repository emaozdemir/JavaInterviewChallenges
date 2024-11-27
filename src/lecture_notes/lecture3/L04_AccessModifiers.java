package lecture_notes.lecture3;

public class L04_AccessModifiers {

    // Access Modifiers (Erişim Belirleyiciler)
    // Java'nın nesne tabanlı yapısı sayesinde, bir class'taki field'lara ve metodlara erişimi kısıtlayabilirsiniz.
    // Bu, özellikle karmaşık uygulamalarda veya güvenlik gereksinimi yüksek olan projelerde oldukça önemlidir.
    // Java, erişim seviyelerini belirlemek için çeşitli anahtar kelimeler sağlar: `public`, `private` ve `protected`.
    // Varsayılan erişim (hiçbir belirteç kullanılmazsa), "package-private" olarak adlandırılır ve
    // aynı package içindeki tüm class'lara erişim izni verir.

    // Örnek: Walrus Class'ı
    class Walrus {
        // Public Field
        // `public` bir field, herkes tarafından erişilebilir.
        public int age = 14; // Yaş bilgisi
        public String name = "Abraham"; // İsim bilgisi

        // Private Field
        // `private` bir field, sadece tanımlandığı class içinde erişilebilirdir.
        private double weight = 1200.5; // Ağırlık bilgisi

        // Protected Field
        // `protected` bir field, aynı package içindeki class'lar ve tüm alt sınıflar tarafından erişilebilir.
        protected double tuskLength = 1.5; // Diş uzunluğu bilgisi

        // Public bir field'a dışarıdan değer atanabilir.
        public void changeName(String newName) {
            this.name = newName;
        }

        // Private bir field'ın değerine erişmek ve değiştirmek için metodlar kullanılabilir.
        public double getWeight() {
            return this.weight;
        }

        public void setWeight(double newWeight) {
            this.weight = newWeight;
        }
    }

    public void demonstrateAccessModifiers() {
        // Obje Oluşturma
        Walrus abraham = new Walrus();

        // Public Field'lara Erişim
        System.out.println("Name: " + abraham.name); // Erişim mümkün
        System.out.println("Age: " + abraham.age); // Erişim mümkün

        abraham.name = "Thelonius"; // Public field'a dışarıdan değer atanabilir
        System.out.println("New Name: " + abraham.name);

        // Private Field'lara Erişim
        // Aşağıdaki satır, private olduğu için hata verecektir:
        // System.out.println(abraham.weight);

        // Private Field'lara Metod ile Erişim
        System.out.println("Weight: " + abraham.getWeight()); // Erişim metod ile sağlanabilir
        abraham.setWeight(1150.0); // Metod ile yeni değer atanabilir
        System.out.println("Updated Weight: " + abraham.getWeight());

        // Protected Field'lara Erişim
        System.out.println("Tusk Length: " + abraham.tuskLength); // Aynı package içinde olduğu için erişim mümkün
    }

    // Access Modifiers Kullanımının Avantajları
    // 1. Veri Güvenliği: Field'ların yanlışlıkla değiştirilmesini veya okunmasını engeller.
    // 2. Kodun Anlamlılığı: Her field veya metodun hangi kapsamda kullanılacağını açıkça belirtir.
    // 3. Esneklik: Public veya protected metodlar sayesinde private field'lar üzerinde kontrollü erişim sağlar.
}

