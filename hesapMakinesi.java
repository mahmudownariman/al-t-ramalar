import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int number1,number2,select;
        Scanner inp=new Scanner(System.in);
        System.out.println("ilk sayınızı giriniz:");
        number1= inp.nextInt();
        System.out.println("İkinci sayınızı giriniz:");
        number2= inp.nextInt();

        System.out.println("1-Toplama\n2-cıkarma\n3-carpma\n4-bölme");
        System.out.println("Seciminiz:");
        select= inp.nextInt();
        switch (select){
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                System.out.println(number1/number2);
                break;
        }
    }
}
