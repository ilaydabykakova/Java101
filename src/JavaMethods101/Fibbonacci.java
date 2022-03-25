package JavaMethods101;

import java.util.Scanner;

public class Fibbonacci {
    static int fibbonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibbonacci(n - 1) + fibbonacci(n - 2);

    }


    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("Sayı giriniz: "+fibbonacci(number));
    }
}
