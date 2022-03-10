package JavaDonguler101;
import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {
        int n;
        //double pow1,pow2;
        int result = 1,result2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result * 4 ;
            result2 = result2 * 5;
            System.out.println(i+".sayının"+"\t 4'ün kuvveti: "+result+"\t 5'in kuvveti: "+result2);

        }
/*        //With math library
        for (int i = 1; i <= n; i++) {
            pow1 = Math.pow(4, i);
            pow2 = Math.pow(5, i);
            System.out.println(i+". sayının 4'ün kuvveti: "+pow1+"\tve 5'in kuvveti: "+pow2);
        } */
    }
}
