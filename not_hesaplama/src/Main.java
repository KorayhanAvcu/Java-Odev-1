// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        System.out.println(mat);
        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt ();
        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt ();
        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt ();
        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt ();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);
        String status = (sonuc > 60) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(status);
    }
}