package decorator.pattern;

public class WithMilk extends CoffeeDecorator{
    Coffee coffee;
    public WithMilk(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDesc() {
        return coffee.getDesc()+" & Milk";
    }
    @Override
    public Double getCost() {
        return coffee.getCost()+1.00;
    }
}
