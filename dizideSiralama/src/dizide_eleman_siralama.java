import java.util.Arrays;
import java.util.Scanner;

public class dizide_eleman_siralama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Dizinin boyutu:");
        int n = inp.nextInt();
        int [] list = new int[n];
        int sayi=0;
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 1;i< list.length;i++){
            sayi+=1;
            System.out.print(sayi+"elemanı:");
            list [i]= inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
