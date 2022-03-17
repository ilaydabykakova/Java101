package JavaMethods;

import java.util.Scanner;

public class OdevRecursivePattern {
    static void RecursivePattern (int number) {
        int add = number;
        if (( add!=0 && !(add<0))) {
            add -=5;
            System.out.print(add + " ");
            RecursivePattern (add);
        }
        if (add<number){
            add +=5;
            System.out.print(add + " ");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        RecursivePattern(number);

/*      int add = number;
        do{
            add -=5;
            System.out.print(add+" ");
        }while ( add!=0 && !(add<0));

        do{
         add +=5;
        System.out.print(add+" ");
        }while ( add < number);*/
    }
}
