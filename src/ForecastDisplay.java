/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
public class ForecastDisplay implements Display {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherStation ws;

    public ForecastDisplay(WeatherStation weatherStation) {

        this.ws = weatherStation;
        update();

    }

    public void update() {

        lastPressure = currentPressure;
        currentPressure = ws.getPressure();
        display();

    }

    public void display() {

        System.out.print("Forecast: ");

        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }
}