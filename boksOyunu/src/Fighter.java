public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double sans;

    Fighter(String name,int damage,int health,int weight,double dodge,double sans){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
        this.sans=sans;
    }
    int hit(Fighter foe) {

            System.out.println(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu");

            if (foe.isdodge()) {
                System.out.println(foe.name + " gelen hasarı blokladı");
                return foe.health;
            }
            if (foe.health - this.damage < 0) {
                return 0;
            }
            return foe.health - this.damage;
        }


    boolean isdodge(){
        double randomValue = Math.random()*100;
        return randomValue<=this.dodge;
    }
    boolean isvur(){
        double random=Math.random()*100;
        return random<=this.sans;
    }
}
