package JavaDonguler101;
import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        int n;
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir N sayısı giriniz: ");
        n = input.nextInt();
        //Double variable tanımlandıysa double ile devam et işlem cevap vermez !
        //Double - integer ile bölündüğünde double verir.
        for (double i=1.0 ; i<=n; i++){
            //total += (1.0/i);
            total += (1/i);
        }
        System.out.println("Harmonik: "+ total);

    }

}
