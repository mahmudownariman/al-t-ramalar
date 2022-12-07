import java.util.Random;
import java.util.Scanner;

public class mayinTarlasi {
    int satir,sutun,size;
    int [][] boy;
    int [][] kl;
    boolean mgame=true;
     Random random=new Random();
     Scanner scan=new Scanner(System.in);

    mayinTarlasi(int satir,int sutun){
        this.satir=satir;
        this.sutun=sutun;
        this.boy=new int[satir][sutun];
        this.kl=new int[satir][sutun];
        this.size=satir*sutun;
        System.out.println("Mayınların konumu");
    }
    public void run(){
        int row,col,sayac=0;
        game();
        print(boy);
        System.out.println("Mayın Tarlası Oynuna Hoşgeldiniz!");
        while (mgame){
            print(kl);
            System.out.print("Satır giriniz : ");
            row= scan.nextInt();
            System.out.print("Sütün giriniz : ");
            col= scan.nextInt();
            if (row<0||row>=satir){
                System.out.println("Gecersiz sayı girdiniz!");
            continue;
            } if (col<0||col>=sutun){
                System.out.println("Gecersiz sayı girdiniz!");
                continue;
            }
            if (boy[row][col]!=-1){
                chek(row,col);
                sayac++;
                if (sayac==(size/4)){
                    System.out.println("Oyunu kazandınız !");
                    break;
                }
            }else {
                mgame=false;
                System.out.println("Game Over!");
            }
        }

    }
    public void chek(int ro,int co){
        if ((co<sutun-1)&&boy[ro][co+1]==-1){
            kl[ro][co+1]++;
        }if ((ro<satir-3)&&(boy[ro+1][co]==-1)){
            kl[ro][co]++;
        }if ((ro>0)&&(boy[ro-1][co]==-1)){
            kl[ro][co]++;
        }if ((co>0)&&(boy[ro][co-1]==-1)){
            kl[ro][co]++;
        }if (kl[ro][co]==0){
            kl[ro][co]=-2;
        }
    }
    public void game(){
        int str,stn,syc=0;
        while (syc!=(size/4)){
             str= random.nextInt(satir);
             stn= random.nextInt(sutun);
             if (boy[str][stn]!=-1) {
                 boy[str][stn] = -1;
                 syc++;
             }
        }
    }
    public void print(int [][] arr){
        for (int i=1;i<arr.length;i++){
            for (int c=1;c<arr[i].length;c++){
                if (arr[i][c]>=0)
                    System.out.print(" ");
                System.out.print(arr[i][c]+" ");
            }
            System.out.println();
        }
    }

}