package template.pattern;

public class MainBreakfast {
    public static void main(String[] args) {
        BreakfastPlate monday = new MondayBreakfastPlate();
        BreakfastPlate wednesday = new WednesdayBreakfastPlate();
        BreakfastPlate friday = new FridayBreakfastPlate();

        System.out.println("\tMonday");
        monday.getBreakfast();
        System.out.println("\tWednesday");
        wednesday.getBreakfast();
        System.out.println("\tFriday");
        friday.getBreakfast();
    }
}
