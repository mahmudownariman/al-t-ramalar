import jdk.jshell.EvalException;

import java.util.Arrays;
public class diziFrekans {
    static boolean isagain(int []arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,10,10,20,15,15,5};
        int [] duplucate = new int[arr.length];
        int [] again = new int[arr.length];
        int indeks=0;
        int n=0;
        for (int i=0;i<arr.length;i++) {

            for (int c = 0; c<arr.length;c++) {
                
                if (arr[i] == arr[c]) {
                    n++;
                }
            } if (!isagain(duplucate,arr[i])){
                duplucate[indeks++]=arr[i];
                System.out.println(arr[i]+" sayısı "+n+" kere tekrar etmiş");
            }
            n=0;
        }
    }
}