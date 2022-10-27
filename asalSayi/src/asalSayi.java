
public class asalSayi {
    public static void main(String[] args) {

        for (int i = 2; i<=100; i++) {
            boolean sayi = true;
            for (int a = 2; a<i; a++) {
                if (i%a==0){
                    sayi=false;
                    break;
                }

            }
            if (sayi){
            System.out.print(" "+i);
        }
    }

    }
}


