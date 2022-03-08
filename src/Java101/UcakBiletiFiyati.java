package Java101;

import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        double mesafe;
        int yas, gidis;
        double yasIndirimi, result, indirimliTutar, yonIndirimi = 0, yonIndirimiTutar = 0, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        gidis = input.nextInt();
        //Mesafe if bloğu
        if (mesafe < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        // Gidis if- else bloğu
        if (gidis > 0 && gidis < 3) {
            if (gidis == 2) {
                System.out.println("Biletinizi Gidiş-Dönüş seçtiniz: " + gidis);
                yonIndirimi += 0.20;
            } else {
                System.out.println("Biletinizi tek yön seçtiniz: " + gidis);
                yonIndirimi += 0;
            }
        } else {
            System.out.println("Hatalı bilgi girdiniz." + gidis);
        }

        result = mesafe * 0.10;
        System.out.println("Normal bilet tutarınız : " + result);
        //Yaş İndirimi if-else bloğu
        if (yas < 12) {
            yasIndirimi = result * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = result * 0.10;
        } else if (yas >= 65) {
            yasIndirimi = result * 0.30;
        } else {
            yasIndirimi = 0;
        }
        indirimliTutar = result - yasIndirimi;
        System.out.println("Aldığınız yaş indirimi: " + indirimliTutar);
        //Yön İndirimi if bloğu
        if (yonIndirimi == 0.20) {
            yonIndirimiTutar += indirimliTutar * yonIndirimi;
            System.out.println("Aldığınız gidiş-dönüş indirimi: " + yonIndirimiTutar);
            total = (indirimliTutar - yonIndirimiTutar) * 2;
            System.out.println("Toplam tutarınız: " + total);
        }
        else {
            total = (indirimliTutar - yonIndirimiTutar) ;
            System.out.println("Toplam tutarınız: " + total);
        }



    }

}
