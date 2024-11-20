package lecture_notes.lecture1;

public class L06_CommentsAndEscapes {
    /*
    ** Yorumlar (Comments):**
    - Yorumlar, programın derleyici tarafından dikkate alınmayan, kod içindeki açıklamalardır.
    - Java'da yorumlar `//` ile başlar ve aynı satırda kalan her şey yorum olarak kabul edilir.
    */

    public static void commentsExample() {
        // Değişkenleri tanımlayıp başlatıyoruz.
        int a = 5;
        int b = 10;

        // Değişkenleri topluyoruz.
        int sum = a + b;

        /*
        Sonuçları ekrana yazdırıyoruz.
        Burada birden fazla satırlı yorum kullandık.
        */
        System.out.println(sum); // Toplamı yazdırıyoruz.
    }

    /*
    ** Escape Karakterleri (Escapes):**
    - Escape karakterleri, derleyiciye, takip eden karakterin normal şekilde işlenmemesi gerektiğini bildirir.
    - String ifadeler içinde yaygın olarak kullanılırlar.
    */

    public static void escapeCharactersExample() {
        // Escape karakterleriyle bir satır sonu ekliyoruz
        String myString = "Hello, world!\nThis is a new line.";
        System.out.println(myString);

        // Çift tırnak karakterini escape ile kullanıyoruz
        String quoteString = "He said, \"Hello!\"";
        System.out.println(quoteString);
    }

    public static void main(String[] args) {
        // Yorum örneklerini göster
        commentsExample();

        // Escape karakterlerini göster
        escapeCharactersExample();
    }
}
