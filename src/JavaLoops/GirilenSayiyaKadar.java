package JavaLoops;

import java.util.Scanner;

public class GirilenSayiyaKadar {
    public static void main(String[] args) {

        int number, i, j = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        for (i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("- 3 ve 4'ün Böleni : " + i);
                sum += i;
                j++;
            }
        }
        System.out.println("3 ve 4'ün Ortalması: " + (sum / j));
    }
}

