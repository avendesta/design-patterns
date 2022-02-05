package decorator.pattern;

public class WithCream extends CoffeeDecorator{
    Coffee coffee;
    public WithCream(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDesc() {
        return coffee.getDesc()+" & Cream";
    }
    @Override
    public Double getCost() {
        return coffee.getCost()+1.50;
    }
}
