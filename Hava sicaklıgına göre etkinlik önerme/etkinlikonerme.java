import java.util.Scanner;

public class etkinlikonerme {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        heat = inp.nextInt();
        if (heat < 5) {
            System.out.println("kayak yapabilirsiniz");
        }else if (heat >=10 && heat<=30) {
            if (heat <= 20) {
                System.out.println("fitnese gidebilirsin");
            }if (heat>15){
                System.out.println("footbola gidebilirsiniz");
            }
        }else {
            System.out.println("yüzmeye gidebilirsin");
        }
    }
        }

