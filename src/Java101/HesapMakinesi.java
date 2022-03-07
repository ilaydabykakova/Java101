package Java101;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.print("İşlem yapacağının ilk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İşlem yapacağının ikinci sayıyı giriniz : ");
        n2 = input.nextInt();
        System.out.print("İşlem yapacağınız işlem karakterini giriniz(+,-,/,*): ");
        String hesapİslemi = input.next();

        switch (hesapİslemi) {
            case "+":
                System.out.println("Toplama sonucunuz:" + (n1 + n2));
                break;
            case "-":
                if (n1 > n2) {
                    System.out.println("Çıkarma sonucu : " + (n1 - n2));
                }
                if (n2 > n1) {
                    System.out.println("Çıkarma sonucu : " + (n2 - n1));
                }
                break;
            case "/":
                if (n2 != 0) {
                    System.out.println("Bölme sonucu : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünmez !");
                }
                break;
            case "*":
                System.out.println("Çarpma sonucu : " + (n1 * n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }

       /* IF - ELSE
        if (hesapİslemi.equals("+")) {
            System.out.println("Toplama sonucu : " + n1 + n2);
        } else if (hesapİslemi.equals("-")) {
            if (n1 > n2) {
                System.out.println("Çıkarma sonucu : " + (n1 - n2));
            }
            if (n2 > n1) {
                System.out.println("Çıkarma sonucu : " + (n2 - n1));
            }

        } else if (hesapİslemi.equals("/")) {
            if (n2 != 0) {
                System.out.println("Bölme sonucu : " + n1 / n2);
            } else {
                System.out.println("Bir sayı 0'a bölünmez !");
            }
        } else if (hesapİslemi.equals("*")) {
            System.out.println("Çarpma sonucu : " + n1 * n2);
        } else {
            System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }
*/
    }
}
