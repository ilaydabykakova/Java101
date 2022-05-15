package JavaLoops;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        {
            int number, basNumber = 0, basValue=0, basPow, result = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Sayı Giriniz :");
            number = input.nextInt();
            int originalNum = number; // number sayısını original number ile tutuyorum.Number sayısı hiç değişmiyor.!

            //Kaç basamaklı olduğunu bulma.
            while (originalNum != 0) {

                originalNum /= 10;
                basNumber++;
            }
            System.out.println("Digits : " + basNumber);
            originalNum = number;
            while (originalNum != 0) {
                basValue = originalNum % 10;
                result +=basValue;
                basNumber++;
                System.out.println(originalNum+". Sayısının son basamağı : "+basValue);
                originalNum /= 10;
            }
            System.out.println("Sayıların toplamı: "+ result);
            /*ARMSTRONG SAYI*/
              /*
            originalNum = number;//// number sayısını original number ile tutuyorum.
            // VE original number sayısını yeniliyoruz.Örn: 1234 olduğunu hatırlatıyoruz.
            while (originalNum != 0) {
                basValue = originalNum / 10;
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                    System.out.println("basPow" + basPow);
                }
                result += basPow;
                originalNum /= 10; //0 olduğunda çıkabilir.
            }
            if (result == number) {
                System.out.println(number + " sayısı bir Armstrong sayıdır.");
            } else {
                System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
            }*/
        }

    }
}
