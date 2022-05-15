package JavaMethods;

import java.util.Scanner;

public class PalindromNumbers {

    static boolean polindromNumber(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) {
            System.out.println("Bu sayı palindrom sayıdır.!  ");
            return  true;
        }
        else{
            System.out.println("Bu sayı polindrom sayı değildir. ");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inNum;
        System.out.println("Sayı giriniz: ");
        inNum = input.nextInt();
        System.out.print("Result: " + polindromNumber(inNum));


    }
}
