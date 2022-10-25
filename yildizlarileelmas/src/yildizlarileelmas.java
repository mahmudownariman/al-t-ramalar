import java.util.Scanner;

public class yildizlarileelmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

            }

        for (int i=1;i<=n;i++){
            for (int a=n;a<(n+i);a++){
                System.out.print(" ");
            }
            for (int b=1;b<=(n-i)*2-1;b++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}