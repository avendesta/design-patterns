package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observerList;
    private int temp;
    private int humidity;
    public WeatherStation(){
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int observerIndex = observerList.indexOf(o);
        if(observerIndex>=0)
            observerList.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> o.update(temp, humidity));
    }
    public void measurementChanged(int temp, int humidity){
        this.temp = temp;
        this.humidity = humidity;
        notifyObservers();
    }
}
