package examples;

public class BreakContinueExample {
    // 0'dan 50'ye kadar olan sayılar arasında yalnızca 7'ye tam bölünen sayıları yazdırın.
    // Eğer sayı 7'ye tam bölünmüyorsa, continue komutuyla bu değeri atlayın.
    public static void main(String[] args) {

        for (int x = 0; x < 50; x++) {
            if (x % 7 != 0) {
                continue;  // 7'ye tam bölünmeyen sayıları atla
            }
            System.out.println(x);  // 7'ye tam bölünen sayıları yazdır
        }
    }
}
