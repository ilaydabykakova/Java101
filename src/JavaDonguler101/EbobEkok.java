package JavaDonguler101;


import java.awt.*;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1;
        int n2;
        int ekok, ebob = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();
        System.out.println("===================");
        int i = 1;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i+" ");
                break;
            }
            i++;
        }


/*        int i = 1;
        //  Birim maaliyeti = 18 döngü.
        while (i <= n1 || i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
            i++;
        }
        System.out.println("===================");
        //Birim malyeti : 14 döngü
        int k = n1;
        while (k >= 1) {

            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob: " + ebob);
                break; // Bulduğumuz an bitiriyoruz.
            }
            k--;
        }*/


    }
}
