import java.util.Scanner;

public class desene_metod {
    static int f(int n){
        if (n<=0){
            return n;
        }else {
            System.out.print(n+" ");
            return f(n-5);
        }
    }
    static int f1(int n,int y){
        if (n>y){
            return n;
        }else {
            System.out.print(n+" ");
            return f1(n+5,y);
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int n= inp.nextInt();
        f1(f(n),n);
    }
}
