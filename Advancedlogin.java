package proje1;

import java.util.Scanner;

public class Advancedlogin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        User user = new User("Mehmet", "1928");
        int attemptsLeft = 3;

        while (attemptsLeft > 0) {
            System.out.print("Kullanıcı Adı: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Şifre: ");
            String inputPassword = scanner.nextLine();

            if (user.login(inputUsername, inputPassword)) {
                System.out.println("\n✅ Giriş başarılı! Hoş geldiniz, " + inputUsername + "!");
                enterSecretArea(); 
                break;
            } else {
                attemptsLeft--;
                System.out.println("❌ Hatalı kullanıcı adı veya şifre. Kalan hakkınız: " + attemptsLeft);

                if (attemptsLeft == 0) {
                    System.out.println("⛔ Giriş hakkınız bitti. Sistemden çıkılıyor...");
                }
            }
        }

        scanner.close();
    }

    public static void enterSecretArea() {
        System.out.println("\n🔐 Gizli bölgeye erişim sağlandı!");
        System.out.println("📁 Önemli bilgiler burada yer alır...\n");
        
    }

	}


