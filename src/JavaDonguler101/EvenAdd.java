package JavaDonguler101;

import java.util.Scanner;

public class EvenAdd {
    public static void main(String[] args) {
        int n,totaleven = 0;
        Scanner input = new Scanner(System.in);

        //Döngüyü bir kez çalıştırıp kullanıcıdan sayı alalım.
        do {
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            if (n%2==0 && n%4==0) {
                totaleven +=n;
            }
        }while (n%2==0);
        System.out.println("Tek sayıların toplamı :"+totaleven);
    }

}
