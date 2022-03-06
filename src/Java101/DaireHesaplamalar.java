package Java101;
import java.util.Scanner;
import java.lang.Math;

public class DaireHesaplamalar {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14, alan, cevre,dilimalan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz:");
        r = input.nextInt();

        alan = (pi * Math.pow(r,2));
        cevre = ( 2 * pi * r );

        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin çevresi:"+cevre);

        System.out.print("Dairenin  merkez açısının ölçüsünü giriniz:");
        a = input.nextInt();

        dilimalan = (alan * a)/ 360;
        System.out.println("Daire diliminin alanı:"+dilimalan);

    }

}
