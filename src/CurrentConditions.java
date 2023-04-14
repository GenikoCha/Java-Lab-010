/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
public class CurrentConditions {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherStation ws;

    public CurrentConditions(WeatherStation weatherStation) {

        this.ws = weatherStation;
        update();

    }

    public void update() {

        temperature = ws.getTemperature();
        humidity = ws.getHumidity();
        pressure = ws.getPressure();
        display();

    }

    public void display() {
        System.out.printf("Current conditions are: %.2f F degrees, %.2f%% humidity, and %.2f in pressure\n", temperature, humidity, pressure);
    }
}
