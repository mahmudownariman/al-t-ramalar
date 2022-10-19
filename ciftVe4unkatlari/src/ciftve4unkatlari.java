import java.util.Scanner;
        public class ciftve4unkatlari {
            public static void main(String[] args) {
                int b, total = 0;
                do {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Sayı Giriniz:");
                    b = input.nextInt();
                    if ((b % 4 == 0)&&(b%2==0)) {

                        total+=b;

                    }

                } while ((b>0)&&(b%2==0));
                System.out.println("toplam =" +total);


            }


        }
