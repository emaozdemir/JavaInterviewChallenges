package examples;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    // Bir array'deki tekrar eden (duplikat) elemanları kontrol edin.
    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                return true;  // Eğer set'e eklenemiyorsa, duplikat var
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 1};
        System.out.println("Array contains duplicates: " + containsDuplicates(numbers));
    }
}
