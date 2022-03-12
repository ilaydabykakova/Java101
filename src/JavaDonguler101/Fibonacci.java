package JavaDonguler101;


public class Fibonacci {
    public static void main(String[] args) {
        int n = 0,result = 0;
        int num1 = 0,num2 = 1;
        for (int i = 1; i<=10;i++) {
            System.out.println(num1 +" + "+ num2 + " = " + result);
                result = num1 + num2;// num1: 1 + num2: 2
                num1 = num2; // num1 = 2 (num1 değiştirip bir sonraki sayı yaptık.fib)
                num2 = result; // num2 = 3 (num2'yi result yaptık)

            }


    }

}
