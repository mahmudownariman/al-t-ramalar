public class palindrom {
    static boolean f(int n){
        int temp=n,basamak,yenisayi=0;
        while (temp!=0){
            basamak=temp%10;
            yenisayi=(yenisayi*10)+basamak;
            temp/=10;

        }
        if (n==yenisayi)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(f(4014));
    }
}
