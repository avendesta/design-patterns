package decorator.antipattern;

public class EspressoWithCream extends Espresso{
    public EspressoWithCream(){
        this.desc = super.getDesc()+" & Cream";
    }
    @Override
    public Double getCost() {
        return super.getCost()+1.50;
    }
}
