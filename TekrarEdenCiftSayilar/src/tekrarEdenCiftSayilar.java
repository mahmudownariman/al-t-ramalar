public class tekrarEdenCiftSayilar {
    static  boolean isfind(int[]arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {2, 5, 6, 1, 2, 4, 6, 4, 6, 6, 2, 8, 8, 5, 7, 7};
        int [] duplcate = new int[list.length];
        int startİndex = 0;
        for (int i=0;i<list.length;i++){
            for (int c=0;c<list.length;c++) {
                if ((i != c) && (list[i] == list[c])) {
                    if (!isfind(duplcate, list[i])) {
                        duplcate[startİndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value:duplcate){
            if (value!=0 && value%2==0){
                System.out.println(value);
            }
        }
    }
}
