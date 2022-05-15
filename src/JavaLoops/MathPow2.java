package JavaLoops;
import java.util.Scanner;

public class MathPow2 {
    public static void main(String[] args) {
        int base, power, total = 1;
        for (int z = 1; z <= 5; z++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Üssü olucak sayı:");
            base = input.nextInt();
            System.out.print("Üs olucak sayı:");
            power = input.nextInt();

            for (int i = 1; i <= power; i++) {
                total *= base;
            }
            //while örneği
          /*    int i = 1;
      while(i<=power){
            total *=base;
            i++;
        }*/
            System.out.println(base + " olan sayının " + power + ". üssü sonucu: " + total);
        }
    }
}
