public class diziHormonik {
    public static void main(String[] args) {
        int [] numbers = {1,5,6,4,2};
        double result = 0;
        for (int i = 0;i <numbers.length;i++){
            result +=numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println(1/result);
    }
}
