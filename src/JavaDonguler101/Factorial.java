package JavaDonguler101;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 * 4 * 5 * ....
        int n,r,total = 1,totalr = 1,totalnr=1,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Kombinasyon için n sayısı: ");
        n = input.nextInt();
        System.out.print("Kombinasyon için r sayısı: ");
        r = input.nextInt();

        for (int i = n; i>0; i--){
            total *=i;
        }
        System.out.println(n+". Faktoriyel: "+total);

        for (int j = r; j>0; j--){
            totalr *=j;
        }

        for (int z = (n-r); z>0; z--){
            totalnr *=z;
        }

        result = total / (totalnr * totalr) ;
        System.out.println("C("+n+","+r+")"+"Kombinasyon: "+result);
    }
}
