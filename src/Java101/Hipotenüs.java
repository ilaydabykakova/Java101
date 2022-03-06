package Java101;
import java.util.Scanner;
import java.lang.Math;


public class Hipotenüs {
    public static void main(String[] args) {
        int a,b;
        double c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin iki kenar uzunluğunu giriniz:");
        System.out.print("1. kenar uzunluğu : ");
        a = input.nextInt();
        System.out.print("2. kenar uzunluğu : ");
        b = input.nextInt();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenüs :"+ c);

        u = ((a+b+c)/2);
        System.out.println("Üçgenin Çevresi :"+ (2*u));

        alan = Math.sqrt(u * ((u-a) * (u-b) * (u-c))) ;
        System.out.println("Üçgenin Alanı :"+ alan );

    }
}

