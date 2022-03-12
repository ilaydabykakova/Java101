package JavaDonguler101;


import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        int number, count = 0, numberp = 0;
        while (count == 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();
            int perfect = 0; // Önceki yapılan işlemin toplamı kalmamış oluyor.
            if (number > 0) {
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        perfect += i;
                    }
                }
                if (number == perfect) {
                    System.out.println(perfect + " Mükemmel sayıdır.");
                } else {
                    System.out.println(number + " Mükemmel sayı değildir.");
                }
            }
            else {
                System.out.println("Pozitif sayı olmalıdır.");
            }

        }
    }
}
