package lecture_notes.lecture4;

// Bu sınıf, static yöntemler ve değişkenlerin kullanımını açıklar.

public class L04_StaticMethodsAndVariables {

    // Static variable (Değişken)
    public static final double PI = 3.14159; // Sabit bir matematiksel değer
    public static int instanceCount = 0; // Oluşturulan nesne sayısını takip eder

    // Instance variables (Alanlar)
    private String name;
    private int age;

    // Constructor - Her nesne oluşturulduğunda çağrılır
    public L04_StaticMethodsAndVariables(String name, int age) {
        this.name = name; // Shadowing örneği
        this.age = age;
        instanceCount++; // Yeni bir nesne oluşturulunca sayaç artırılır
    }

    // Static method (Yöntem)
    public static void makeSound() {
        System.out.println("The walrus makes a sound: Burp!");
    }

    // Instance method - Static olmayan, nesne üzerinde çalışır
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Getter for instanceCount (Static variable)
    public static int getInstanceCount() {
        return instanceCount;
    }

    // main - Static ve instance öğelerinin farkını göstermek için örnekler
    public static void main(String[] args) {
        // 1. Static method çağrısı - Nesne oluşturmadan doğrudan çağrılır
        System.out.println("Static Method Example:");
        L04_StaticMethodsAndVariables.makeSound();

        // 2. Static variable örneği
        System.out.println("\nStatic Variable (PI): " + L04_StaticMethodsAndVariables.PI);

        // 3. Yeni nesneler oluşturuluyor
        System.out.println("\nCreating Walrus Objects:");
        L04_StaticMethodsAndVariables walrus1 = new L04_StaticMethodsAndVariables("Roxanne", 5);
        L04_StaticMethodsAndVariables walrus2 = new L04_StaticMethodsAndVariables("Abraham", 7);

        // 4. Instance method çağrıları
        System.out.println("\nInstance Methods:");
        walrus1.displayDetails();
        walrus2.displayDetails();

        // 5. Static variable instanceCount gösterimi
        System.out.println("\nNumber of Walrus Instances: " + L04_StaticMethodsAndVariables.getInstanceCount());

        // 6. Math sınıfı sabitlerinin kullanımı
        System.out.println("\nMath Constants (Examples):");
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);
    }
}

