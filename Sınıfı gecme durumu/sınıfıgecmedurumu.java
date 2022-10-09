import java.util.Scanner;

public class sınıfıgecmedurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, toplam=0, bolen=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("matematik notunuz:");
        mat = inp.nextInt();
        System.out.println("fizik notunuz:");
        fizik = inp.nextInt();
        System.out.println("turkce notunuz:");
        turkce = inp.nextInt();
        System.out.println("kimya notunuz:");
        kimya = inp.nextInt();
        System.out.println("muzik notunuz:");
        muzik = inp.nextInt();
        if (mat <= 100|| mat >= 0){toplam=toplam+mat;
        bolen++;}
        else {
            System.out.println("yukarı not girdiiniz"); }
        if (fizik <= 100 || fizik >= 0){toplam=toplam+fizik;
            bolen++;}
        if (turkce <= 100){toplam=toplam+turkce;
            bolen++;}
        if (kimya <= 100){toplam=toplam+kimya;
            bolen++;}
        if (muzik <= 100) {toplam=toplam+muzik;
            bolen++;
        }


         double select= toplam / bolen;
        if (select>=55) {
            System.out.println("sınıfı gecdiniz:" + select);
        }
        }
    }


