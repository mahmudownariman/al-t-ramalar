import java.util.Scanner;

public class mukemmelsayibulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int k=0,n= inp.nextInt();
        int total=0;
        for (int i=1;i<n;i++){
            k=i;
            if (n%k==0){
                total+=k;
                System.out.println(k);

            }
        }if (n%total==0){
            System.out.println("mukemmel sayı");
        }else {
            System.out.println("mukemmel sayı degildir");
        }
    }
}
