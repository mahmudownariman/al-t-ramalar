import java.util.Scanner;

public class recursive_us_hesap {
    static int f(int a,int b){
        int result=1;
     for (int i=1;i<=b;i++){
         result *=a;

     }
        System.out.println(result);
     return result;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("taban sayı giriniz:");
        int a = inp.nextInt();
        System.out.println("üs sayı giriniz:");
        int b = inp.nextInt();
        f(a,b);
    }
}