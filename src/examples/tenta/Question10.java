package examples.tenta;

public class Question10 {
    public static void main(String[] args) {
        // Soru 10: Bir switch bloğunun nasıl çalıştığını açıklayın ve kullanışlı bir örnek verin.
        // Açıklama:
        // - Switch, belirli bir değişkenin değerine göre farklı kod bloklarını çalıştırır.
        // - Kullanışlı bir örnek: Haftanın günlerini yazdırma.

        int day = -8;

        switch (day) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            case 3 -> System.out.println("Çarşamba");
            case 4 -> System.out.println("Perşembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Geçersiz gün");
        }

        if (day ==1){
            System.out.println("Pazartesi");
        }else if (day ==2){
            System.out.println("Salı");
        }else {
            System.out.println("hepsi kabul");
        }
    }
}

