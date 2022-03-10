package JavaDonguler101;
import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {
        int n;
        double pow1,pow2;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            pow1 = Math.pow(4, i);
            pow2 = Math.pow(5, i);
            System.out.println(i+". sayının 4'ün kuvveti: "+pow1+"\tve 5'in kuvveti: "+pow2);
        }
    }
}
