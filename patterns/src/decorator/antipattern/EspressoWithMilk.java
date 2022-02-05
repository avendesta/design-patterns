package decorator.antipattern;

public class EspressoWithMilk extends Espresso{
    public EspressoWithMilk(){
        this.desc = super.getDesc()+" & Milk";
    }
    @Override
    public Double getCost() {
        return super.getCost()+1.00;
    }
}
