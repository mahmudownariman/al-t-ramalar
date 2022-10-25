import java.util.Scanner;

public class ATMislemleri {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String  username,password;
        int prize,select=0;
        int total=0;
        int balance=1500;

        boolean giris=false;

        while (!giris) {
            System.out.println("Kullanıcı adınız:");
            username = inp.nextLine();
            System.out.println("Paraolanız:");
            password = inp.nextLine();
            if (username.equals("nariman")&&password.equals("1234")) {
                System.out.println("Giriş yaptınız:");
                giris =true;

            }
        }System.out.println("1-Para yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap");
            System.out.println("Seciminiz:");
            select = inp.nextInt();
        switch (select) {
            case 1:
                System.out.println("para miktarı:");
                prize = inp.nextInt();
                balance += prize;
                System.out.println("bakiyeniz"+balance);
                break;
            case 2:
                System.out.println("para miktarı:");
                prize = inp.nextInt();
                if (prize >=balance) {
                    System.out.println("Kartınızda oyle para yok!");
                    balance = total;
                    balance = -prize;
                }else if (prize<=balance) {
                    balance-=prize;
                System.out.println("bakiyeniz" + balance);
            }
                break;
            case 3:
                System.out.println("bakiyeniz"+balance);
                break;
            case 4:
                System.out.println("Çikiş yaptınız");
                break;
        }
    }
}
