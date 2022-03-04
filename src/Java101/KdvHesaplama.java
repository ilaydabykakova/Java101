package Java101;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money,kdvOran1 = 0.18,kdvOran2 = 0.08,kdv,kdvTutar;

        System.out.println("Ücret tutarınızı giriniz: ");
        money = input.nextDouble();
        // Eğer ücret 0 ve 1000 dahil olmak üzere aralıklarında ise kdvOran1(0.18) değil ise 1000'den büyük ise (0.08)
        double sonuc = ( (money > 0) && (money <= 1000) ? kdvOran1 : kdvOran2 );

        kdvTutar = (money * sonuc);
        kdv = money + kdvTutar;

        System.out.println("KDV'siz Tutar: "+money);
        System.out.println("KDV Oranı: "+ sonuc);
        System.out.println("KDV Tutarı: "+ kdvTutar);
        System.out.println("KDV'li fiyatı: "+ kdv);



    }

}
