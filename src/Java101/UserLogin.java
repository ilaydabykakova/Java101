package Java101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username, password, answer, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Username: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("asdf!")) {
            System.out.println("Giriş yaptınız.");
        } else if (username.equals("patika") && !(password.equals("asdf!"))) {
            System.out.print("Şifrenizi yanlış girdiniz. Yeni şifre oluşturmak ister misiniz (yes/no) ? ");
            answer = input.nextLine();
            if (answer.equals("yes")) {
                System.out.print("Yeni şifreniniz giriniz.");
                newPassword = input.nextLine();
                if (password.equals(newPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Şifreniz yanlış.Giriş yapmadınız.");
            }
        } else {
            System.out.println("Kullanıcınız ve şifreniz yanlış.");
        }
    }
}
