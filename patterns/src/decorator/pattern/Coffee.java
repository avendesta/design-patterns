package decorator.pattern;

public abstract class Coffee {
    protected String desc = "Unknown Coffee";
    public String getDesc(){
        return desc;
    }
    public abstract Double getCost();
    @Override
    public String toString(){
        return ("Coffee: "+getDesc()+", Price: "+getCost());
    }
}
