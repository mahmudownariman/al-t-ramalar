import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i,n;
        System.out.println("taban sayı giriniz:");
        i= inp.nextInt();
        System.out.println("Üs sayı giriniz:");
        n= inp.nextInt();
        int total=i;
        for (int a=1;a<n;a++){
            total*=i;


        }System.out.println(total);
    }
}