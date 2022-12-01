public class main {
    public static void main(String[] args) {
        Fighter habib=new Fighter("Habib",20,100,70,50,50);
        Fighter konor=new Fighter("Konor",20,100,75,0,30);

        match match=new match(habib,konor,65,80,50);
        match.run();

    }
}
