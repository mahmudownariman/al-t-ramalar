import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.println("sayı giriniz");
        n= inp.nextInt();
        for (int i=1;i<=n;i++) {
            for ( int a=1;a<=i;a++){
                System.out.print(" ");
            }for (int c=0;c<=2*(n-i);c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
