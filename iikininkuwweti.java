import java.util.Scanner;
public class iikininkuwweti {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,kuvvetsayac=1,dort=1,bes=1;
        System.out.println("sayı giriniz: ");
        n=scan.nextInt();
        while (kuvvetsayac<=n){
            dort=dort*4;
            System.out.println("dördün "  +kuvvetsayac+" nci"+ " kuuweyti: "+dort);
            bes=bes*5;
            System.out.println("beşin kuuweyti: "+bes);
            kuvvetsayac++;
        }

    }
}
