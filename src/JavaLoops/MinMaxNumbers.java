package JavaLoops;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        int n, numbers;
        int min = 0, max = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz:");
            numbers = input.nextInt();
            if (i == 1) {
                min = numbers; // 12  14
                max = numbers; // 12
            } else if (numbers < min)  //min : 12 (6<12)ok -min: 6- (65<6)x
                min = numbers;
            else if (numbers > max) // max :12 (6>12)x (65>6)ok -max: 65-
                max = numbers;
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}


