import java.util.Scanner;

public class manavkasa {
       public static void main(String[] args) {
       int a,b,c,d,e;
       double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;

       Scanner nrm=new Scanner(System.in);
           System.out.print("armut kac kilo ?:");
           a= nrm.nextInt();
           System.out.print("elma kac kilo ?:");
           b= nrm.nextInt();
           System.out.print("domates kac kilo ?:");
           c= nrm.nextInt();
           System.out.print("muz kac kılo ?:");
           d= nrm.nextInt();
           System.out.print("patlican kac  kilo ?:");
           e= nrm.nextInt();

           double m=(armut*a);
           double m1=(elma*b);
           double m2=(domates*c);
           double m3=(muz*c);
           double m4=(patlican*e);

           double hesap=m+m1+m2+m3+m4;
           System.out.println("toplam tutar:2"+hesap);


    }
}
