import java.util.Scanner;

public class Ghesap_makinesi {
    static void f1(){
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int toplam=a+b;
        System.out.println("toplama:"+toplam);
    }
    static int f2(){
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int toplam=a-b;
        System.out.println("cıkarma:"+toplam);
        return 1;
    }
    static int f3(){
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int toplam=a*b;
        System.out.println("carpma"+toplam);
        return 1;
    }
    static int f4() {
        Scanner inp= new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int toplam = a / b;
        System.out.println("bölme:"+toplam);
        return 1;
    }
    static void f5(){
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int sayac=1;
        for (int i=1;i<=b;i++){
            sayac*=a;
        }System.out.println("üslü sayı:"+sayac);
    }static void f6(){
        Scanner inp= new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int total;
        total=(a%b);
        System.out.println("mod alma:"+total);
    }static void f7(){
        Scanner inp= new Scanner(System.in);
        int total=1,n= inp.nextInt();
        for (int i=1;i<=n;i++){
            total*=i;
        }
        System.out.println("faktoriel:"+total);
    }static void f8(){
        int result=1;
        Scanner inp=new Scanner(System.in);
        int kisakenar= inp.nextInt();
        int uzunkenar= inp.nextInt();
        int alan=kisakenar*uzunkenar;
        int cevre=(kisakenar+uzunkenar)*2;
        System.out.println("alan:"+alan);
        System.out.println("cevre:"+cevre);

    }
    static void f0(){

        System.out.println("cıkış yaptınız");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;
        System.out.println( "1-toplama\n"
                +"2-cikarma işlemi\n"
                +"3-carpma işlemi\n"
                +"4-bölme işlemi\n"
                +"5-üslü sayı bulma\n"
                +"6-mod alma\n"
                +"7-faktoriel\n"
                +"8-dikdörtken alan cevre hesabı\n"
                +"0 cıkış yap\n");

        do {
            System.out.println("Bir işlem seciniz");
            select= scan.nextInt();
            switch (select){
                case 1:
                    f1();
                    break;
                case 2:
                    f2();
                    break;
                case 3:
                    f3();
                    break;
                case 4:
                    f4();
                    break;
                case 5:
                    f5();
                    break;
                case 6:
                    f6();
                    break;
                case 7:
                    f7();
                    break;
                case 8:
                    f8();
                    break;
                case 0:
                   f0();
                    break;
                default:
                    System.out.println("hatalı giris yaptınız");
            }
        }while(select!=0);
    }
}
