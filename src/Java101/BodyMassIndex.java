package Java101;
import java.util.Locale;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double boy, bmi;
        int kilo;

        Scanner input = new Scanner(System.in).useLocale(Locale.FRANCE);
        System.out.print ("Boyunuzu giriniz : ");
        boy = input.nextDouble();
        System.out.print ("Kİlonuzu giriniz : ");
        kilo = input.nextInt();

        bmi = kilo / (boy * boy);


        System.out.print ("Vücut Kitle İndeksiniz : " + bmi);

    }

}
