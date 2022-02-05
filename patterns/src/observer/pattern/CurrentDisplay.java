package observer.pattern;

public class CurrentDisplay implements Observer{
    int temp;
    int humidity;
    public CurrentDisplay(Subject weatherStation){
        weatherStation.registerObserver(this);
    }
    @Override
    public void update(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        displayCurrent();
    }
    public void displayCurrent(){
        System.out.printf("Temperature: %s, Humidity: %s\n", temp, humidity);
    }
}
