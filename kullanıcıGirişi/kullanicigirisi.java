import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        String name, password, asd, sifre;
        Scanner inp = new Scanner(System.in);
        System.out.println("adınıza giriniz:");
        name = inp.nextLine();
        System.out.println("şifrenize giriniz");
        password = inp.nextLine();
        if(password.equals("mahmudow")&&(name.equals("nariman"))) {
            System.out.println("Giriş yaptıyesnız!");
        } else{
            System.out.println("yalnış şifre veya kullanıcı adı!");
            System.out.println("sifrlamak isterseniz(yes)");
            asd = inp.nextLine();
            if(asd.equals("yes")) {
                System.out.println("yeni şifreyi giriniz");
                sifre = inp.nextLine();
                if (sifre.equals("mahmudow")) {
                    System.out.println("lan salak bu zaten önceki şifren");
                }else {
                    System.out.println("aferin yeni şifren başarılı kanka");}

            }

            }

        }




        }

