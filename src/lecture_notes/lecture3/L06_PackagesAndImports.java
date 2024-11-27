package lecture_notes.lecture3;

// Belirli sınıfları veya tüm paketleri içe aktarmak için
// Bir paketten tek bir sınıfı içe aktarmak
import javax.swing.JFrame;

// Bir paketten tüm sınıfları içe aktarmak
import javax.swing.*;

// Bir paketten statik üyeleri içe aktarmak (bu örnekte opsiyonel)
import static java.awt.SystemColor.desktop;

public class L06_PackagesAndImports {

    // İçe aktarmaları ve paket kullanımını göstermek için bir metot
    public void demonstrateImports() {
        // 1. İçe aktarılan bir paket içerisindeki sınıfı kullanmak (import javax.swing.*)
        JFrame frame1 = new JFrame("Swing Paketinden Tüm Sınıfları İçe Aktarma");

        // 2. Belirli bir sınıfı içe aktardıktan sonra kullanmak (import javax.swing.JFrame)
        JFrame frame2 = new JFrame("Sadece JFrame Sınıfını İçe Aktarma");

        // 3. Bir sınıfı içe aktarmadan kullanmak (tam paket yolunu belirterek)
        javax.swing.JFrame frame3 = new javax.swing.JFrame("Tam Paket Yolu Kullanımı");

        // Her bir pencerenin boyutlarını ayarlamak
        frame1.setSize(300, 200);
        frame2.setSize(300, 200);
        frame3.setSize(300, 200);

        // Tüm pencereleri görünür yapmak
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
    }

    // İçe aktarmalar olmadan tam paket kullanımını göstermek için bir metot
    public void fullPackageUsageExample() {
        // JLabel ve JFrame sınıflarını içe aktarmadan (tam paket yoluyla) kullanmak
        javax.swing.JLabel label = new javax.swing.JLabel("Tam Paket Yolu ile JLabel Kullanımı");
        javax.swing.JFrame frame = new javax.swing.JFrame("Tam Paket Yolu ile JFrame Kullanımı");

        // Etiketi pencereye eklemek
        frame.add(label);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    // Paketler ve İçe Aktarmalar Hakkında Temel Noktalar:

    // 1. **Paketler (Packages)** Java'da ilişkili sınıfları bir araya getirerek kodun düzenlenmesine yardımcı olur ve isim çakışmalarını engeller.
    // 2. **İçe Aktarmalar (Imports)**, başka bir paketten sınıfları kullanmanıza olanak tanır, böylece her defasında tam paket yolunu belirtmek zorunda kalmazsınız.

    // **Paketler:**
    // - Paket, ilişkili sınıfları düzenlemenin ve isim çakışmalarını engellemenin bir yoludur.
    // - Java'nın temel sınıfları `java.lang` paketindedir.
    // - Swing ile ilgili sınıflar `javax.swing` paketindedir.
    // - Kendi paketlerinizi oluşturmak için `.java` dosyanızın en üstüne `package {paket_adı}` kodunu ekleyebilirsiniz.

    // **İçe Aktarmalar:**
    // - Belirli sınıfları içe aktarmak için: `import {paket_adı}.{sınıf_adı};` kullanabilirsiniz.
    // - Tüm bir paketi içe aktarmak için `import {paket_adı}.*;` kullanabilirsiniz.
    // - Ayrıca, sınıfları içe aktarmadan, tam paket yolu belirterek de kullanabilirsiniz: `{paket_adı}.{sınıf_adı}`.

    // **En İyi Uygulamalar:**
    // - Sadece birkaç sınıfı içe aktarmak istiyorsanız, onları tek tek içe aktarın.
    // - Bir paket içerisindeki birçok sınıfı kullanacaksanız (örneğin GUI için), tüm paketi (`*`) içe aktarmak daha uygun olacaktır.

    // Bu özellikler, kodun daha yönetilebilir, okunabilir ve isim çakışmalarından korunmuş olmasına yardımcı olur.
}
