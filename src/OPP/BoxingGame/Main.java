package OPP.BoxingGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("İlk kim seçilecek ( Marc | Alex ):");
        Scanner input = new Scanner(System.in);
        String choose = input.nextLine();


        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);

        if (choose.equals(marc.name)) {

            Ring r = new Ring(marc, alex, 90, 100);
            r.run();
        }
        else {
            Ring r = new Ring(alex, marc, 90, 100);
            r.run();
        }

    }
}
