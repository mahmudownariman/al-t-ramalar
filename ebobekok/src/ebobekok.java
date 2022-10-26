import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1,n2,ekok=0,ebob=0,n=1;
        System.out.println("n1 sayını giriniz:");
        n1= inp.nextInt();
        System.out.println("n2 sayını dgiriniz:");
        n2= inp.nextInt();

        while (n<=n1) {
            n++;
            if (n1%n ==0 && n2%n ==0) {
                ebob=n;
            }
        } System.out.println("Ebob"+ebob);


        while (n<=(n1*n2)){
            n++;
            if (n%n1==0 && n%n2==0){
                ekok=n;
                System.out.println("Ekok"+ekok);
                break;
            }
        }
    }
}
