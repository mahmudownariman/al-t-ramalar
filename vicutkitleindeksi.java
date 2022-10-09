import java.util.Scanner;
public class vicutkitleindeksi {
    public static void main(String[] args) {
        double a,b;
        double c;
        Scanner inp=new Scanner(System.in);

        System.out.println("boyunuza giriniz:");
        a= inp.nextDouble();
        System.out.println("kilonyza giriniz:");
        b= inp.nextDouble();
        double nrm=b/(a*a);
        System.out.println("Vicut kitle indeksiniz:"+nrm);
    }
}
