package JavaMethods;

import java.util.Scanner;

public class ExponentialMath {
    static  double exponential(double base,int exponent){
        if (base ==0 && exponent ==0){
             return 0;
        }
       else if (exponent==0){
            return 1;
        }
       //if exponenet is minus
        else if (exponent < 0){

            return (1/base)* exponential(base,(exponent+1));
        }
        else {
            return base * exponential(base,(exponent-1));
        }
    }
    public static void main(String[] args) {
        int b,e;
        Scanner input = new Scanner(System.in);
        System.out.print("Base giriniz: ");
        b = input.nextInt();
        System.out.print("Exponent giriniz: ");
        e = input.nextInt();
        System.out.println("Sonucunuz: "+ exponential(b,e));


    }
}
