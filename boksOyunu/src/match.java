public class match {
    Fighter Habib;
    Fighter Konor;
    int minWeight;
    int maxWeight;
    int sansy;

    match(Fighter Habib,Fighter Konor,int minWeight,int maxWeight,int sansy){
        this.Habib=Habib;
        this.Konor=Konor;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
        this.sansy=sansy;

    }
    void run(){
        if (ischek()){
            while (this.Habib.health>0&&this.Konor.health>0){
                System.out.println();
                System.out.println("yeni raund");
                if (vurmasans()) {
                    this.Konor.health = this.Habib.hit(this.Konor);
                    if (iswin()) {
                        break;
                    }
                    this.Habib.health = this.Konor.hit(this.Habib);
                    if (iswin()) {
                        break;
                    }

                }if (vurmasans2()){
                    this.Habib.health = this.Konor.hit(this.Habib);
                    if (iswin()) {
                        break;
                    }
                    this.Konor.health = this.Habib.hit(this.Konor);
                    if (iswin()) {
                        break;
                    }
                }

                    System.out.println(this.Habib.name + " saglık:" + this.Habib.health);
                    System.out.println(this.Konor.name + " saglık:" + this.Konor.health);
                }
        }else {
            System.out.println("sporcuların skletleri uymuyor!");
        }

    }
    boolean ischek(){
        return (this.Habib.weight>=minWeight&&this.Habib.weight<=maxWeight)&&(this.Konor.weight>=minWeight&&this.Konor.weight<=maxWeight);
    }
    boolean iswin(){
        if (this.Habib.health==0) {
            System.out.println(this.Konor.name+" Kazandı");
            return true;
        }
        if (this.Konor.health==0){
            System.out.println(this.Habib.name+" Kazandı");
            return true;
        }return false;
    }
    boolean vurmasans(){
        double random=Math.random()*100;
        return random<=Habib.sans;

    }
    boolean vurmasans2(){
        double random=Math.random()*100;
        return random<=Konor.sans;

    }
}
