package Java101;

import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, kimya, türkce, tarih, muzik;
        System.out.println("Matematik Notunuz:");
        mat = input.nextDouble();
        System.out.println("Fizik Notunuz: ");
        fizik = input.nextDouble();
        System.out.println("Kimya Notunuz: ");
        kimya = input.nextDouble();
        System.out.println("Türkçe Notunuz: ");
        türkce = input.nextDouble();
        System.out.println("Tarih Notunuz: ");
        tarih = input.nextDouble();
        System.out.println("Muzik Notunuz: ");
        muzik = input.nextDouble();

        double ortalama = (mat + fizik + kimya + türkce + tarih + muzik) / 6.0;

        System.out.println("Not Ortalaması :" + ortalama);

        String sonuc = (ortalama > 60.00) ? "Sınıfı Geçti" : "Sınıfta kaldı";

        System.out.println("Sonuç: " + sonuc);
    }
}
