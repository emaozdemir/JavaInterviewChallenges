package examples.tenta;

public class Question9 {
    public static void main(String[] args) {
        // Soru 9: Aşağıdaki kod yürütüldükten sonra terminale ne yazdırılır?
        // Açıklama:
        // Döngü:
        // - İlk adımda: b = 9, a = 3
        // - İkinci adımda: b = 8, a = 6
        // - Üçüncü adımda: b = 7, a = 9

        int a = 0;
        int b = 10;

        while (b > a) {
            b=b-1;//9,8,7
            a=a+3;//3,6,9
        }

        System.out.println(a+b);//16
    }
}
