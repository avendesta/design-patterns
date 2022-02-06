package template.pattern;

public class FridayBreakfastPlate extends BreakfastPlate{
    @Override
    public Boolean plateIsClean() {
        return false;
    }

    @Override
    public Boolean lovesEgg() {
        return false;
    }

    @Override
    public void addSpoonOrFork() {
        System.out.println("Use fork");
    }
}
