package Java101;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year,year2,digit1,digit2,i;
        Scanner input = new Scanner(System.in);
        for (i=0;i<5;i++){
        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        digit1 = year-((year/10)*10);

        year2 = year / 10;
        digit2 = year2-((year2/10)*10);

        if (digit1 != 0 || digit2 != 0 && year%4==0 ){
            System.out.println("This is a leap year "+ year );
        }
        else if (digit1 == 0 && digit2 == 0 && year%400==0){
            System.out.println("This is a leap year "+ year + " !");
        }
        else  {
            System.out.println("This is not a leap year "+ year + " !");
        }

        }
    }
}
