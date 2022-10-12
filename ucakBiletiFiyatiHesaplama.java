import java.util.Scanner;

public class ucakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        double ucret=0.10,km, yasi;
        double o12=0.50,o12ve24=0.20,o65=0.30,gdbiorani=0.20;
        Scanner inp=new Scanner(System.in);
        System.out.println("mesafe giriniz:");
        km= inp.nextDouble();
        double normaltutar=km*ucret,Yindirimi,itutar,gdbi,toplamtutar,ytipi;
        System.out.println("yaşınızı giriniz:");
        yasi=inp.nextDouble();
        System.out.println("yolculuk tipi");
        ytipi=inp.nextDouble();
        if ((yasi>0&&yasi<=12)&&ytipi==1) {
            Yindirimi = normaltutar * o12;
            itutar = normaltutar - Yindirimi;
            toplamtutar=itutar;
            System.out.println(itutar);
        } else if ((yasi>12&&yasi<=24)&&ytipi==1) {
            Yindirimi = normaltutar * o12ve24;
            itutar = normaltutar - Yindirimi;
            toplamtutar=itutar;
            System.out.println(itutar);
        } else if ((yasi>65)&&ytipi==1) {
            Yindirimi = normaltutar * o65;
            itutar = normaltutar - Yindirimi;
            toplamtutar=itutar;
            System.out.println(itutar);
        }

        else if ((yasi>0&&yasi<=12)&&ytipi==2) {
            Yindirimi = normaltutar * o12;
            itutar = normaltutar - Yindirimi;
            gdbi = itutar * gdbiorani;
            toplamtutar = (itutar - gdbi) * 2;
            System.out.println(toplamtutar);
        } else if ((yasi>12&&yasi<=24)&&ytipi==2) {
            Yindirimi = normaltutar * o12ve24;
            itutar = normaltutar - Yindirimi;
            gdbi = itutar * gdbiorani;
            toplamtutar = (itutar - gdbi) * 2;
            System.out.println(toplamtutar);
        } else if ((yasi>65)&&ytipi==2) {
            Yindirimi = normaltutar * o65;
            itutar = normaltutar - Yindirimi;
            gdbi = itutar * gdbiorani;
            toplamtutar = (itutar - gdbi) * 2;
            System.out.println(toplamtutar);
        }else {
            System.out.println("hatalı veri girdiniz!");
        }
    }
}
