import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner inp=new Scanner(System.in);
        System.out.println("Yılınızı giriniz:");
        yil= inp.nextInt();
        switch (yil%400){
            case 0:
                System.out.println("yılınız artık yıl!");
                break;
            default:
                System.out.println("Yılınız artık yıl degil!");
        }
    }
}
