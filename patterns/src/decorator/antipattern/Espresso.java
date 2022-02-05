package decorator.antipattern;


public class Espresso extends Coffee {
    public Espresso(){
        this.desc = "Espresso";
    }

    @Override
    public Double getCost() {
        return 2.00;
    }
}
