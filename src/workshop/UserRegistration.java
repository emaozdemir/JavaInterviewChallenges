package workshop;

// Kullanıcı kayıt işlemleri için sınıf
public class UserRegistration {

    // Kullanıcı kayıt metodu
    public static String registerUser(String username, String email, String password, String confirmPassword) {
        if (username == null || username.isEmpty() || email == null || email.isEmpty()) {
            return "Lütfen tüm zorunlu alanları doldurun";
        }
        if (!password.equals(confirmPassword)) {
            return "Şifreler eşleşmiyor";
        }
        if (password.length() < 8) {
            return "Şifre en az 8 karakter olmalıdır";
        }

        // Geçerli bilgileri veritabanına kaydetme simülasyonu
        // Örn: Database.saveUser(username, email, password);

        return "Kayıt başarılı! Anasayfaya yönlendiriliyorsunuz.";
    }
}