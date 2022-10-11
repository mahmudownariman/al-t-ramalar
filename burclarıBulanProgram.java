import java.util.Scanner;

public class burclarıBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean iserror = false;
        Scanner inp = new Scanner(System.in);
        System.out.println("dogdugunuz ay:");
        month = inp.nextInt();
        System.out.println("dogdugunuz gün:");
        day = inp.nextInt();

        if (month == 3) {
            if (day > 1 && day <= 31) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc="Boga";
                }
            }else
                iserror = true;
        }if (month == 4) {
            if (day > 1 && day <= 30) {
                if (day <= 21) {
                    burc = "Boga";
                } else {
                    burc = "İkizler";
                }
            } else
                iserror = true;
        }if (month==5){
            if (day>1&&day<=31){
               if (day<=22){
                   burc="İkizler";
               }else{
                   burc="yengeç";
               }
            }else
                iserror=true;
        }if (month==6){
            if (day>1&&day<=31){
                if (day<=23){
                    burc="yengeç";
                }else {
                    burc="aslan";
                }
            }else
                iserror=true;
        }if (month==7){
            if (day>1&&day<=30){
                if (day<=23){
                    burc="aslan";
                }else {
                    burc="başak";
                }
            }else
                iserror=true;
        }if (month==8){
            if (day>1&&day<=31){
                if (day<=23){
                    burc="Başak";
                }else {
                    burc="Terazi";
                }
            }else
                iserror=true;
        }if (month==9){
            if (day>1&&day<=30){
                if (day<=23){
                    burc="Terazi";
                }else{
                    burc="Akrep";
                }
            }else
                iserror=true;
        }if (month==10){
            if (day>1&&day<=31){
                if (day<=23){
                    burc="Akrep";
                }else {
                    burc="Yay";
                }
            }else
                iserror=true;
        }if (month==11){
            if (day>1&&day<=30){
                if (day<=22){
                    burc="Yay";
                }else {
                    burc="Oglak";
                }
            }else
                iserror=true;
        }if (month==12){
            if (day>1&&day<=31){
                if (day<22){
                    burc="Oglak";
                }else {
                    burc="Kova";
                }
            }else
                iserror=true;
        }if (month==1){
            if (day>1&&day<=30){
                if (day<22){
                    burc="Kova";
                }else {
                    burc="Balık";
                }
            }else
                iserror=true;
        }if (month==2){
            if (day>1&&day<=31){
                if (day<20){
                    burc="Balık";
                }else {
                    burc="Koç";
                }
            }else
                iserror=true;
        }
        if ((month > 12) || (month < 1)) {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        } else if (iserror) {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        } else {
                System.out.println("burcunuz:"+burc);
        }
    }
    }
