package decorator.pattern;

public class Maker {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        Coffee espressoWithMilk = new WithMilk(espresso);
        Coffee espressoWithCream = new WithCream(espresso);
        Coffee espressoWithMilkAndCream = new WithCream(new WithMilk(espresso));
        System.out.println(espresso);
        System.out.println(espressoWithMilk);
        System.out.println(espressoWithCream);
        System.out.println(espressoWithMilkAndCream);
    }
}
