package lecture_notes.lecture7;

import java.util.*;

/**
 * CollectionsAndTypes sınıfı, koleksiyonların nasıl tiplerle çalıştığını ve tip güvenliği sağlamak için nasıl tanımlanması gerektiğini açıklar.
 * Bu sınıf, şu konuları kapsar:
 * - Array'lerin nasıl tip içerdiğini belirleme
 * - Koleksiyonların tipleriyle nasıl çalıştığı
 * - Koleksiyonlara tip atanarak hata riskini azaltma
 */
public class L02_CollectionsAndTypes {
    public static void main(String[] args) {
        // Array Örneği - Tip Tanımlaması
        String[] myStrings = new String[5];
        myStrings[0] = "Hello";
        // myStrings[1] = 45; // Bu satır derleme hatasına neden olur
        System.out.println("Array Example: " + Arrays.toString(myStrings));

        // List Örneği - Tip Tanımlaması Olmadan
        List untypedList = new ArrayList();
        untypedList.add("Hello");
        untypedList.add(45); // Uyarı, ama çalışır
        System.out.println("Untyped List: " + untypedList);

        // List Örneği - Tip Tanımlaması ile
        List<String> typedList = new ArrayList<>();
        typedList.add("Hello");
        // typedList.add(45); // Bu satır derleme hatasına neden olur
        System.out.println("Typed List: " + typedList);

        // Map Örneği - Tip Tanımlaması
        class Horse {
            @Override
            public String toString() {
                return "Horse";
            }
        }

        Map<Integer, Horse> myHorses = new HashMap<>();
        int horse1_id = 101;
        Horse horse1 = new Horse();
        myHorses.put(horse1_id, horse1);

        System.out.println("Map (myHorses): " + myHorses);
        System.out.println("Get Horse by ID (101): " + myHorses.get(101));
    }
}


