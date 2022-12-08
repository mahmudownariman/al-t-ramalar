import java.util.Arrays;
import java.util.Scanner;

public class dizi5eYakinKucuk_Buyuksayi {
    public static void main(String[] args) {
        int [] list = {15,12,788,1,-1,-778,3,2,0};
        int min = 0;
        int max= 0;
        System.out.println("dizi:"+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("sırala:"+Arrays.toString(list));
        Scanner inp = new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int n = inp.nextInt();
        for (int i:list){
                if (i<n){
                    min = i;
                }
                if (i>n){
                    max =i;break;
                }

            }
        System.out.println(n+"sayısından kucuk en yakın :"+min);
        System.out.println(n+"sayısından buyuk en yakın :"+max);
    }
}
