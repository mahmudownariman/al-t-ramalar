import java.util.Arrays;

public class matrisTranspoz {
    public static void main(String[] args) {
        int [][]matris={{1,2,3},{4,5,6}};
        int [][]transpoz=new int[3][2];
        int indeks=0;
        int indekss=0;
        for (int i = 0;i<matris.length;i++) {
            for (int j =0; j<matris[i].length;j++) {
                System.out.print(matris[i][j] + " ");

            }

            System.out.println();
        }
        System.out.println();
        for (int i = 0;i<matris.length+1;i++) {
            for (int j =0; j<matris.length;j++) {
                System.out.print(matris[j][i] + " ");

            }

            System.out.println();
        }
    }
}
