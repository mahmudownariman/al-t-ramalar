public class Student {
    Course matsoz;
    Course fiziksoz;
    Course kimyasoz;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage=0.0;
    boolean ispass;
    Student(Course matsoz,Course fiziksoz,Course kimyasoz,Course mat,Course fizik,Course kimya){
        this.matsoz=matsoz;
        this.fiziksoz=fiziksoz;
        this.kimyasoz=kimyasoz;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.avarage=0.0;
        this.ispass=false;
    }
    void soznote(int note1,int note2,int not3){
        if (note1>=0&&note1<=100){
            this.matsoz.note=note1;
        }if (note2>=0&&note2<=100){
            this.fiziksoz.note=note2;
        }if (not3>=0&&not3<=100){
            this.kimyasoz.note=not3;
        }

    }
    void notlar(int mat,int fizik,int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    void ispass(){
        this.avarage=((this.matsoz.note*0.20)+(this.mat.note*0.80));
        System.out.println(this.avarage);
    }
    void ispassfizik(){
        this.avarage=((this.fiziksoz.note*0.20)+(this.fizik.note*0.80));
        System.out.println(this.avarage);
    }
    void printnote(){
        System.out.println("söz"+this.matsoz.note);
        System.out.println("söz"+this.fiziksoz.note);
        System.out.println("söz"+this.kimyasoz.note);
    }

}