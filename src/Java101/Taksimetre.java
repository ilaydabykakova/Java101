package Java101;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perkm = 2.20 , total, startPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz :");
        km= input.nextInt();
        total = (perkm * km);
        total += startPrice;
        total = (total > 0 ) && (total <= 20) ? 20 : total;
        System.out.println("Taksimetre tutarı : "+ total);
    }

}
