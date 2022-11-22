import java.util.Scanner;

public class recursive_asal_sayi {
    static boolean f(int x,int y) {
        if (x==y){
            System.out.println(x+": asal sayıdır");
            return true;
        }if (x%y==0) {
                System.out.println(x+": asal sayı degil");
                return false;

        }
        return f(x,y+1);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int x= inp.nextInt();
        System.out.println(f(x,2));
    }
}
