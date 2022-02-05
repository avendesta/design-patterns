package decorator.antipattern;

public class Maker {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        EspressoWithMilk espressoWithMilk = new EspressoWithMilk();
        EspressoWithCream espressoWithCream = new EspressoWithCream();
        System.out.println(espresso);
        System.out.println(espressoWithMilk);
        System.out.println(espressoWithCream);

    }
}
