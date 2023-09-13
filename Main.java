import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //Değişkenleri oluşturduk
        int mat, fizik, kimya, turkce, tarih, muzik;
        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan verileri aldık
        System.out.print("Matematik nutunuzu giriniz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih=inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=inp.nextInt();

        int toplam= mat+ fizik +kimya +turkce+tarih+muzik;
        Double ortalama= toplam/6.0;
        System.out.println("Ortalamalanız: " + ortalama);

        // Mantık operatörü ile koşul oluşturduk
        boolean kosul1 = ortalama == 60;
        boolean kosul2 = ortalama >=60;
        boolean sonuc = kosul1 || kosul2;

        String str= (sonuc)? "Geçtiniz!" : "Kaldınız!";
        System.out.print(str);
    }
}
