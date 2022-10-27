import java.util.Scanner;

public class min_ve_max_sayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,min=0,max=0;
        System.out.println("kac sayı gireceksiniz:");
        n= inp.nextInt();
        
        for (int i=1;i<=n;i++){
            System.out.print("sayınız:");
            int sayi= inp.nextInt();

            if (min>sayi){
                min=sayi;
            }if (max<sayi){
                max=sayi;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
