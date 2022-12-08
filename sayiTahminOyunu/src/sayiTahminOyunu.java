import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {
        Random rand=new Random();
        int number= rand.nextInt(100);

        Scanner inp=new Scanner(System.in);
        int right=0;
        int selected;
        int [] wrong=new int[5];
        boolean iswin=false;
        boolean iswrong=false;

        System.out.println(number);
        for (int i=0;i<5;i++){
            System.out.println("Bir tahmin sayı giriniz:");
            selected= inp.nextInt();
            if (selected<0||selected>100){
                System.out.println("Lütfen 0-100 arasında sayı giriniz.");
                if (iswrong){
                    right++;
                    System.out.println("Çok fazla giriş yaptınız.Kalan hak:"+(5-right));
                }else {
                    iswrong=true;
                    System.out.println("Bir dah hatalı girişinizde hakkınızdan düşülecektir.");
                }continue;
            }
            if (selected==number){
                System.out.println("Tebrikler, dogru tahmin ! Tahmin ettiginiz sayı:"+number);
                iswin=true;
                break;
            }else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected>number){
                    System.out.println(selected+": Sayısı gizli sayıdan büyüktür ");
                }else {
                    System.out.println(selected+": Sayısı gizli sayıdan kücüktür");
                }
                wrong[right++]=selected;
                System.out.println("Kalan hakkı : "+(5-right));
            }
        }
        if (!iswin) {
            System.out.println("Kaybetdiniz!");
            if (!iswrong){
                System.out.println("Tahminleriniz:"+ Arrays.toString(wrong));
            }
        }
    }
}
