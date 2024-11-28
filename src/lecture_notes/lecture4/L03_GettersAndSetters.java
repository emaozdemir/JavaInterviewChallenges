package lecture_notes.lecture4;


public class L03_GettersAndSetters {

    // Instance variables (fields)
    private String name;
    private int age;

    // Constructor - Nesne oluşturulduğunda değer ataması yapmak için kullanılır
    public L03_GettersAndSetters(String name, int age) {
        this.name = name; // Parametre ile field (instance variable) arasındaki fark için this kullanıldı
        this.age = age;
    }

    // Getter (getName) - "name" alanını dışarıdan okumak için kullanılır
    public String getName() {
        return this.name; // "this.name", bu nesnenin name alanına erişir
    }

    // Setter (setName) - "name" alanını dışarıdan değiştirmek için kullanılır
    public void setName(String name) {
        this.name = name; // "this.name", instance variable "name"i ifade eder
    }

    // Getter (getAge) - "age" alanını dışarıdan okumak için kullanılır
    public int getAge() {
        return this.age; // "this.age", bu nesnenin age alanına erişir
    }

    // Setter (setAge) - "age" alanını dışarıdan değiştirmek için kullanılır
    public void setAge(int age) {
        this.age = age; // "this.age", instance variable "age"i ifade eder
    }

    // displayDetails - Nesneye ait bilgileri ekrana yazdırır
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // main - Getter ve Setter kullanımını göstermek için örnekler
    public static void main(String[] args) {
        // 1. Yeni bir nesne oluşturuldu (Constructor kullanımı)
        L03_GettersAndSetters walrus = new L03_GettersAndSetters("Abraham", 5);

        // 2. İlk değerleri ekrana yazdırma
        System.out.println("Initial Details:");
        walrus.displayDetails();

        // 3. Setter ile değerleri güncelleme
        walrus.setName("Roxanne");
        walrus.setAge(6);

        // 4. Güncellenmiş değerleri ekrana yazdırma
        System.out.println("\nUpdated Details:");
        walrus.displayDetails();

        // 5. Getter kullanarak değerleri okuma ve ekrana yazdırma
        System.out.println("\nRetrieve Details Using Getters:");
        System.out.println("Name: " + walrus.getName());
        System.out.println("Age: " + walrus.getAge());
    }
}