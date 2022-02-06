package template.pattern;

public abstract class BreakfastPlate {
    public void start(){
        System.out.println("Pick a new plate");
    }
    public abstract Boolean plateIsClean();
    public void washPlate(){
        System.out.println("Wash plate on sink");
    }
    public abstract Boolean lovesEgg();
    public void addEgg(){
        System.out.println("Adding eggs");
    }
    public abstract void addSpoonOrFork();
    public void end(){
        System.out.println("Breakfast is ready!");
    }

    public void getBreakfast(){
        start();
        if(!plateIsClean())
            washPlate();
        if(lovesEgg())
            addEgg();
        addSpoonOrFork();
        end();
    }
}
