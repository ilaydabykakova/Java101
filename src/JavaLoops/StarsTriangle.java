package JavaLoops;

import java.util.Scanner;

public class StarsTriangle {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz.");
        n = input.nextInt();


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int z = n - 1; z > 0; z--) {
            for (int s = n ; s >= z; s--) {
                System.out.print(" ");
            }
            for (int m = (2 * z) - 1; m > 0; m--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
