public class bilgi {
    public static void main(String[] args) {
        Course mat=new Course(60);
        Course fizik=new Course(60);
        Course kimya=new Course(60);

        Course msoz=new Course(90);
        Course fsoz=new Course(90);
        Course ksoz=new Course(90);

        Student inp=new Student(msoz,fsoz,ksoz,mat,fizik,kimya);
        inp.soznote(90,90,90);
        inp.notlar(60,60,60);
        inp.ispass();
        inp.ispassfizik();

    }
}
