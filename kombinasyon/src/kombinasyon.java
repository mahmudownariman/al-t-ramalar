import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        System.out.println("Sayı giriniz:");
        int n,r;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("Seçim sayısı giriniz:");
        r=input.nextInt();
        int totaln=1;
        int totalr=1;
        int totalnr=1;
        for (int i=1;i<=n;i++){
            totaln=totaln*i;
        }
        for (int i=1;i<=r;i++){
            totalr=totalr*i;
        }
        for (int i=1;i<=(n-r);i++){
            totalnr=totalnr*i;
        }
        System.out.println("Kombinasyon:"+(totaln/(totalnr*totalr)));

    }
}

