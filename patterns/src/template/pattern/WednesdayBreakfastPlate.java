package template.pattern;

public class WednesdayBreakfastPlate extends BreakfastPlate{
    @Override
    public Boolean plateIsClean() {
        return false;
    }

    @Override
    public Boolean lovesEgg() {
        return true;
    }

    @Override
    public void addSpoonOrFork() {
        System.out.println("Take both spoon and fork");
    }
    @Override
    public void end(){
        System.out.println("Enjoy your wednesday breadfast!");
    }
}
