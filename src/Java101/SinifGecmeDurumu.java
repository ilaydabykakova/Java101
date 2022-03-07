package Java101;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, kimya, turkce, muzik;
        System.out.println("Matematik Notunuz:");
        mat = input.nextDouble();
        if (!(mat >= 0 && mat<=100) ) { mat= 0; }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextDouble();
        if (!(fizik >= 0 && fizik<=100) ) { fizik= 0; }

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextDouble();
        if (!(kimya >= 0 && kimya<=100) ) { kimya= 0; }
        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        if (!(turkce >= 0 && turkce<=100) ) { turkce= 0; }
        System.out.println("Muzik Notunuz: ");
        muzik = input.nextDouble();
        if (!(muzik >= 0 && muzik<=100) ) { muzik= 0; }

        double average = (mat + fizik + kimya + turkce + muzik) / 5.0;

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız.Seneye görüşmek üzere!");

        } else {
            System.out.println("Sınıfı geçtiniz.Tebrikler!");
        }
        System.out.println("Ortlamanız: " + average);

    }

}
