import java.util.Scanner;

public class daireDiliminalanı {
    public static void main(String[] args) {
        int r;
        double pi=3.14,m;
        Scanner inp=new Scanner(System.in);
        System.out.println("yarı capını giriniz");
        r= inp.nextInt();
        m= inp.nextInt();
        double toplam=(pi * (r*r) * m) / 360;
        System.out.println("dilimin alan:"+toplam);
    }
}
