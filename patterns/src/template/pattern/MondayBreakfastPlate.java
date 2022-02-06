package template.pattern;

public class MondayBreakfastPlate extends BreakfastPlate{
    @Override
    public Boolean plateIsClean() {
        return true;
    }

    @Override
    public Boolean lovesEgg() {
        return true;
    }

    @Override
    public void addSpoonOrFork() {
        System.out.println("Adding spoon");
    }
}
