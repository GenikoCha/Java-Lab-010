/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
public class StatisticsDisplay implements Display {

    private float temperatureMin = Float.MAX_VALUE;
    private float temperatureMax = Float.MIN_VALUE;
    private float tempRunningTotal = 0.0f;
    private int numReadings;
    private WeatherStation ws;


    public StatisticsDisplay(WeatherStation weatherStation) {

        this.ws = weatherStation;
        update();

    }

    public void update() {

        float temperature = ws.getTemperature();
        temperatureMin = Math.min(temperatureMin, temperature);
        temperatureMax = Math.max(temperatureMax, temperature);
        tempRunningTotal += temperature;
        numReadings++;
        display();

    }

    public void display() {

        float averageTemp = tempRunningTotal / numReadings;
        System.out.printf("Avg/Max/Min temperature = %.2f/%.2f/%.2f\n", averageTemp, temperatureMax, temperatureMin);

    }
}
