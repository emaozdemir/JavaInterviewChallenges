package lecture_notes.lecture1;

public class L00_MemoryExample {


        public static void main(String[] args) {
        /*
        ** Stack Belleği: **
        - Stack, LIFO (Last In First Out) yani "son giren ilk çıkar" prensibiyle çalışan bir veri yapısıdır.
        - Yalnızca metod seviyesindeki yerel değişkenler ve metod çağrıları burada depolanır.
        - Stack'te depolanan değişkenler metod çalıştığında oluşturulur ve metod bitiminde silinir.
        - Stack'teki veriler geçicidir ve hızlı erişim sağlar.

        ** Heap Belleği: **
        - Heap, dinamik bellek alanıdır ve genellikle nesnelerin saklanması için kullanılır.
        - Nesneler heap belleğinde depolanır ve çöp toplayıcı (garbage collector) tarafından yönetilir.
        - Heap, stack'ten daha esnektir ancak daha yavaştır, çünkü nesneler burada daha uzun süre kalabilir.
        - Heap belleği, daha büyük ve uzun süreli veri yapıları için uygundur.
        */

            /* Stack Belleği Örneği:
             * 'age' değişkeni stack bellekte depolanır. Stack'te depolanan değişkenler metod bitene kadar geçerlidir ve
             * metod bitiminde otomatik olarak silinir. Burada 'age' değişkeni int türünde olduğu için doğrudan stack bellekte saklanır.
             */
            int age = 25; // 'age' stack'te depolanır.
            System.out.println("Age: " + age);

            /* Heap Belleği Örneği:
             * 'name' değişkeni stack bellekte depolanırken, "John" değeri heap bellekte depolanır.
             * String türündeki veriler, Java'da String Pool olarak bilinen bir yapıda depolanabilir, ancak burada sadece
             * "John" String'inin heap'te depolandığını kabul edebiliriz.
             */
            String name = "John"; // 'name' stack'te depolanırken, "John" değeri heap'te depolanır.
            System.out.println("Name: " + name);

            /* Nesne ve Referans:
             * 'person' değişkeni stack bellekte bir referans tutarken, 'Person' nesnesi heap bellekte depolanır.
             * 'Person' sınıfı bir nesne oluşturulduğunda, nesne veri alanları (fields) (name, age) heap bellekte saklanır.
             */
            Person person = new Person("Alice", 30); // 'person' stack'te referans tutar, 'Person' nesnesi heap'te depolanır.
            System.out.println("Person Name: " + person.name + ", Age: " + person.age);
        }
    }

    /* Person sınıfı, heap bellekte depolanan nesnenin bir örneğidir.
     * Nesnelerin veri alanları (name ve age) heap bellekte saklanır.
     */
    class Person {
        String name;
        int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }