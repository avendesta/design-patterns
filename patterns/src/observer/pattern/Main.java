package observer.pattern;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer currentDisplay = new CurrentDisplay(weatherStation);
        Observer forecastDisplay = new ForecastDisplay(weatherStation);

        for (int i=0; i<5; i++) {
            System.out.println("\tUpdate: ");
            int randomTemp = getRandom(-30, 30);
            int randomHumidity = getRandom(0, 100);
            weatherStation.measurementChanged(randomTemp, randomHumidity);
        }
    }
    public static int getRandom(int a, int b){
        Random rand = new Random();
        return rand.nextInt((b - a) + 1) + a;
    }
}
