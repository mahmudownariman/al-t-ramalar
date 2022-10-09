import java.util.Scanner;

public class kdvTutarıHesaplama {
    public static void main(String[] args) {
        double tutar,kdvorani=0.18,kdvorani1=0.08;
        Scanner input  = new Scanner(System.in);
        System.out.println("ucrete giriniz");
        tutar = input.nextDouble();
        double nrm =(tutar<1000)? tutar*kdvorani : tutar*kdvorani1;
        System.out.print("KDV " +nrm);
    }
}


