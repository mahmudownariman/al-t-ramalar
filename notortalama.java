import java.util.Scanner;

public class notortalama {
    public static void main(String[] args){
        int mat,fizik,turkce,tarih,kimya,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("matematik notunuz:");
        mat= inp.nextInt();
        System.out.println("fizik notunuz:");
        fizik=inp.nextInt();
        System.out.println("turkce notunuz:");
        turkce=inp.nextInt();
        System.out.println("tarih notunuz:");
        tarih=inp.nextInt();
        System.out.println("kimya notunuz:");
        kimya=inp.nextInt();
        System.out.println("muzik notunuz:");
        muzik=inp.nextInt();
        int toplam=(mat+fizik+turkce+tarih+kimya+muzik)/6;
        String sonuc=(toplam>=60)? "sinıfı gecti":"sınıfta kaldı";
        System.out.println(sonuc);

    }
}
