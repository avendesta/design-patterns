package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer{
    private List<Integer> tempHistory;
    private List<Integer> humidityHistory;
    public ForecastDisplay(Subject weatherStation){
        weatherStation.registerObserver(this);
        tempHistory = new ArrayList<>();
        humidityHistory = new ArrayList<>();
    }
    @Override
    public void update(int temp, int humidity) {
        tempHistory.add(temp);
        humidityHistory.add(humidity);
        displayHistory();
    }
    public void displayHistory(){
        System.out.printf("Temperature History: %s\n", tempHistory);
        System.out.printf("Humidity History: %s\n", humidityHistory);
    }
}
