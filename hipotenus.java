
    import java.util.Scanner;

    public class hipotenus {
        public static void main(String[] args) {
            int a, b,c;
            double u,d,m;
            Scanner nrm = new Scanner(System.in);
            System.out.print("kenar1 :");
            a= nrm.nextInt();
            System.out.print("kenar2 :");
            b= nrm.nextInt();
            System.out.print("kenar3 :");
            c= nrm.nextInt();
            u=(a+b+c)/2;
            System.out.println("cevre"+u );
            d=Math.sqrt(u*(u-a)*(u-b)*(u-c));
            System.out.print("alan"+d);
        }
    }

