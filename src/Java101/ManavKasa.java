package Java101;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, total;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo: " );
        armutKilo = input.nextInt();
        System.out.print("Elma kaç kilo: ");
        elmaKilo = input.nextInt();
        System.out.print("Domates kaç kilo: ");
        domatesKilo = input.nextInt();
        System.out.print("Muz kaç kilo: ");
        muzKilo = input.nextInt();
        System.out.print("Patlıcan kaç kilo: ");
        patlıcanKilo = input.nextInt();

        total = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * domates) + (muzKilo * muz) + (patlıcanKilo * patlıcan);
        System.out.println("Toplam Tutar : "+total+" TL");
    }
}
