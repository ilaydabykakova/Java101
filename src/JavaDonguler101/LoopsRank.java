package JavaDonguler101;

import java.util.Scanner;

public class LoopsRank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result= 0;
            int pow = 1;
            int bigResult;
            int result2 = 0;

            for(int k =0 ; k<=n;k++){
                if (k==0){
                    result2 = a+b;
                }
                pow = 1;//pow önceki değeri 2 olarak kalıyor döndürüyor.2 kalmaması gerekiyor.pow=1 yapıyorus.
                for(int j= 1; j<=k;j++){
                    pow= 2 * pow;
                }
                if (k>0)  {
                    result = result + (b * pow);
                }
                bigResult = result2 + result;
                System.out.print( bigResult+" ");
            }
            System.out.println("");
        }
    }
}
