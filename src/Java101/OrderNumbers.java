package Java101;

import java.util.Scanner;

public class OrderNumbers {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Üç Sayı giriniz : ");
        System.out.print("- ");
        a = input.nextInt();
        System.out.print("- ");
        b = input.nextInt();
        System.out.print("- ");
        c = input.nextInt();
        // Küçükten Büyüğe
        System.out.println("Küçükten Büyüğe :");
        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println(a + " < " + b + " < " + c);
            } else {
                System.out.println(a + " < " + c + " < " + b);
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(c + " < " + b + " < " + a);
            }
        }
            // Büyükten Küçüğe
            System.out.println("Büyükten Küçüğe :");
            if ((a > b) && (a > c)) {
                if (b > c) {
                    System.out.println(a + " > " + b + " > " + c);
                } else {
                    System.out.println(a + " > " + c + " > " + b);
                }
            } else if ((b > a) && (b > c)) {
                if (a > c) {
                    System.out.println(b + " > " + a + " > " + c);
                } else {
                    System.out.println(b + " > " + c + " > " + a);
                }
            } else if ((c > a) && (c > b)) {
                if (a > b) {
                    System.out.println(c + " > " + a + " > " + b);
                } else {
                    System.out.println(c + " > " + b + " > " + a);
                }
            }

        }
    }
