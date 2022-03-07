package Java101;

import java.util.Scanner;

public class WeatherActivity {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz ");
            if (heat >= 10 && heat <= 15) {
                System.out.print("ve pikniğe de gidebilirsiniz !");
            }
        } else if (heat > 15 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
