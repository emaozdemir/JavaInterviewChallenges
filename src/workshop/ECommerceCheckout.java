package workshop;

// E-ticaret ödeme işlemleri için sınıf
public class ECommerceCheckout {

    // Ödeme kontrol metodu
    public static String checkout(String[] cartItems, boolean isPaymentMethodValid, double userBalance) {
        if (cartItems == null || cartItems.length == 0) {
            return "Sepetiniz boş";
        }
        if (!isPaymentMethodValid) {
            return "Ödeme yöntemiyle ilgili bir hata oluştu";
        }
        double total = calculateTotal(cartItems);
        if (total > userBalance) {
            return "Yetersiz bakiye";
        }

        // Ödeme işlemini tamamlama simülasyonu
        // Örn: PaymentGateway.deductBalance(userBalance, total);

        return "Satın alma başarılı!";
    }

    // Sepet toplamını hesaplama yardımcı metodu
    private static double calculateTotal(String[] cartItems) {
        // Örnek toplam hesaplama (her ürün 50 birim olarak varsayılmıştır)
        return cartItems.length * 50;
    }
}
