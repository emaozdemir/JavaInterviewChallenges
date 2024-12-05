package lecture_notes.lecture5;

import java.util.Arrays;

public class ArraysInPractice {

    public static void main(String[] args) {
        // 1. Dizi Uzunluğu (Array Lengths)
        // Tüm diziler, yerleşik Array sınıfının nesneleridir.
        // Bu sınıfın sağladığı temel özelliklerden biri `length` değişkenidir.
        // Aşağıda bir char dizisi (alfabe için) oluşturuyoruz.
        char[] alphabet = new char[26]; // 26 elemanlı bir char dizisi
        char character = 'a'; // Başlangıç karakteri

        // Dizi elemanlarını doldurmak için bir for döngüsü kullanıyoruz.
        // Döngü 0. elemandan başlıyor ve `alphabet.length`'e kadar devam ediyor.
        for (int element = 0; element < alphabet.length; element++) {
            alphabet[element] = character; // Mevcut karakteri diziye atıyoruz.
            character++; // Karakteri bir artırıyoruz (a -> b -> c ...).
        }

        // Dizi elemanlarını yazdırmak için Arrays.toString() fonksiyonunu kullanıyoruz.
        System.out.println("Alphabet: " + Arrays.toString(alphabet));

        // 2. copyOf ve copyOfRange ile Kopyalama
        // Arrays.copyOf() ve Arrays.copyOfRange(), dizilerin kopyalarını oluşturmaya yarar.
        // `copyOf()` belirtilen uzunluk kadar kopyalama yapar.
        char[] firstHalf = Arrays.copyOf(alphabet, 14); // İlk 14 eleman (a -> n).
        System.out.println("First 14 Letters: " + Arrays.toString(firstHalf));

        // Uzunluk belirtirken, dizinin son 10 elemanını hariç tutacak şekilde kopyalayabiliriz.
        char[] almostFull = Arrays.copyOf(alphabet, alphabet.length - 10); // Son 10 hariç.
        System.out.println("Almost Full Alphabet: " + Arrays.toString(almostFull));

        // `copyOfRange()` ile belirli bir başlangıç ve bitiş aralığını seçebiliriz.
        char[] rangeCopy = Arrays.copyOfRange(alphabet, 7, alphabet.length - 8);
        // Yukarıda, 7. indisten başlıyor ve sondan 8 eleman kalana kadar devam ediyor.
        System.out.println("Middle Part: " + Arrays.toString(rangeCopy));

        // 3. binarySearch, sort ve toString
        // binarySearch() bir dizide belirli bir elemanın indeksini bulur.
        // ÖNEMLİ: Dizi sıralı olmalıdır, aksi halde sonuçlar doğru olmayabilir.
        int indexOfChar = Arrays.binarySearch(alphabet, 'k'); // 'k' harfi hangi indeks?
        System.out.println("'k' index: " + indexOfChar);

        // sort(): Bir diziyi artan sırada sıralar.
        char[] scrambled = {'z', 'a', 'm', 'q', 'e'};
        Arrays.sort(scrambled); // Alfabetik sıraya göre sıralama yapar.
        System.out.println("Sorted Array: " + Arrays.toString(scrambled));

        // 4. Çok Boyutlu Diziler (Multi-dimensional Arrays)
        // Çok boyutlu diziler, dizilerin içinde diziler barındırır.
        // Tic-Tac-Toe (X-O) oyunu için 3x3'lük bir tahta oluşturuyoruz.
        Square[][] board = new Square[3][3]; // 3x3'lük Square dizisi
        board[0][0] = new Square(); // İlk kare
        board[0][1] = new Square(); // İkinci kare
        System.out.println("Tic-Tac-Toe Board Initialized!");

        // Farklı boyutlu bir dizi (üçgensel tahta) oluşturma:
        Square[][] triangularBoard = new Square[3][];
        triangularBoard[0] = new Square[1]; // İlk satır: 1 eleman
        triangularBoard[1] = new Square[2]; // İkinci satır: 2 eleman
        triangularBoard[2] = new Square[3]; // Üçüncü satır: 3 eleman

        System.out.println("Triangular Board Initialized!");
    }
}

// Örnek Square sınıfı
// Çok boyutlu dizilerde kullanılmak üzere oluşturulmuş basit bir sınıf.
class Square {
    // Şu an boş, ancak daha fazla özellik ve metot eklenebilir.
}

