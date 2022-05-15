package JavaLoops;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak saysı giriniz: ");
        n = input.nextInt();

         for (int i =0 ; i<= n ; i++){
             for (int j = n; j >= (n - i); j--){
                 System.out.print(" ");
             }
             for (int k = 2*n; k >= 2*(i+1);k--){
                 System.out.print("*");
             }
             System.out.println(" ");
         }
    }
}
