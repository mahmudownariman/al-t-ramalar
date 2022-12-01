public class Employee {
    String name;
    int salary;
    int workhousr;
    int hireYear;
    int yil;
    int toplam=0;
    Employee(String name,int salary,int workhousr,int hireYear,int yil){
        this.name=name;
        this.salary=salary;
        this.workhousr=workhousr;
        this.hireYear=hireYear;
        this.yil=yil;
    }
    int tax(){
        int total=0;
        if (this.salary>100){
            total =(int) (this.salary*0.03);
        }return total;
    }
    int bonus(){
        int total=0;
        if (this.workhousr>40){
            total=((this.workhousr-40)*30);
        }else {
            total=0;
        }
        return total;
    }
    int maasart(){
        int total=0;
        if (this.hireYear-this.yil>2011){
            total=(int) (this.salary*0.05);
        }
        if (this.hireYear-this.yil<2011&&this.hireYear-this.yil>2001){
            total=(int) (this.salary*0.10);
        }
        if (this.hireYear-this.yil<2001&&this.hireYear-this.yil>1991){
            total=(int) (this.salary*0.15);
        }
        return total;
    }
    void print() {
        System.out.println(
                "Adı:"+this.name+
                "\nMaaşı:"+this.salary+
                "\nCalışma Saati:"+this.workhousr+
                "\nVergi:"+tax()+
                "\nBonus:"+bonus()+
                "\nmaaş artışı:"+maasart()+
                "\nVergi ve bonuslar ile maaş:"+(this.salary-tax()+bonus())+
                "\nToplam maaş:"+(this.salary-tax()+bonus()+maasart()));
    }
}
