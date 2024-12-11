package lecture_notes.lecture7;

import java.util.*;

/**
 Collections sınıfı, farklı türde koleksiyonların kullanımını ve
 temel metodlarını göstermek için hazırlanmıştır. Koleksiyonların nasıl
 çalıştığını anlamak için çeşitli örnekler sunar.

 * Bu sınıf aşağıdaki koleksiyon türlerini açıklar:

 * - **Set**: Benzersiz öğeleri tutar ve tekrar eden öğelere izin vermez.
 * Örneğin, bir kullanıcı adları listesi gibi.
 * - **List**: Sıralı bir koleksiyon türüdür. İndekslere göre erişim sağlar ve
 * tekrar eden öğelere izin verir. Örneğin, bir alışveriş listesi gibi.
 * - **Queue**: Birinci giren birinci çıkar (FIFO) veya son giren birinci çıkar (LIFO)
 * mantığıyla çalışan bir veri yapısıdır. Örneğin, bir görev kuyruğu gibi.
 * - **Map**: Anahtar-değer çiftlerinden oluşan bir koleksiyondur. Örneğin, bir
 * şehir adı ve nüfus değerlerini tutmak için kullanılabilir.
 */
public class L01_Collections {

    public static void main(String[] args) {
        // 1. Set Örneği
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate eklenmez
        System.out.println("Set (Unique Names): " + uniqueNames);

        // 2. List Örneği
        List<String> orderedNames = new ArrayList<>();
        orderedNames.add("Alice");
        orderedNames.add("Bob");
        orderedNames.add("Charlie");
        orderedNames.add(1, "David"); // İndekse göre ekleme
        System.out.println("List (Ordered Names): " + orderedNames);

        // List metodları: get, set, remove
        System.out.println("Second element: " + orderedNames.get(1));
        orderedNames.set(1, "Eve"); // 1. indeksdeki öğeyi değiştir
        System.out.println("Updated List: " + orderedNames);
        orderedNames.remove(2); // 2. indeksteki öğeyi sil
        System.out.println("After Removal: " + orderedNames);

        // 3. Queue Örneği
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Polled Element: " + queue.poll()); // İlk elemanı al ve çıkar
        System.out.println("Peeked Element: " + queue.peek()); // İlk elemanı al ama çıkartma
        System.out.println("Queue After Poll: " + queue);

        // 4. Map Örneği
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("Gothenburg", 579281);
        cityPopulation.put("Stockholm", 975551);
        cityPopulation.put("Malmo", 316588);
        System.out.println("Map (City Population): " + cityPopulation);

        // Map metodları: get, keySet, values, remove
        System.out.println("Population of Gothenburg: " + cityPopulation.get("Gothenburg"));
        System.out.println("All Cities: " + cityPopulation.keySet());
        System.out.println("All Populations: " + cityPopulation.values());
        cityPopulation.remove("Malmo");
        System.out.println("Updated Map: " + cityPopulation);
    }
}
