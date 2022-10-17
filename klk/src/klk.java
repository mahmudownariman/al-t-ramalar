import java.util.Scanner;

public class klk {
    public static void main(String[] args) {
        int sayi;
        Scanner btl=new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        sayi= btl.nextInt();
        int top=0,sayac=0;

       for(int i=1;i<=sayi;i++){
           if (i%3==0 && i%4==0 ){
               top=top+i;
               sayac+=1;
           }



       }double ort=(top/sayac);
       System.out.println(ort);

    }
}
