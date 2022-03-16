package JavaMethods;

import java.util.Optional;
import java.util.Scanner;

public class PrimeNumbersRecursive {
    static int primeNum(int num, int i) {
        if (num == i) {
            return 0;
        } else if (num % i == 0) {
            return 1;
        } else {
            return primeNum(num, i + 1);
        }

    }

    public static void main(String[] args) {
        int n, i = 2;
        Scanner input = new Scanner(System.in);
            System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        primeNum(n, i);

        if (primeNum(n, i) == 0) {
            System.out.println(n + " Asal sayıdır.");
        } else {
            System.out.println(n + " Asal sayı değildir.");
        }


    }
}
