import java.io.IOException;

public class idk {

        public static void main (String[]args) throws IOException {

            WeatherStation ws = new WeatherStation();

            ws.registerDisplay(new CurrentConditions(ws));
            ws.registerDisplay(new StatisticsDisplay(ws));
            ws.registerDisplay(new ForecastDisplay(ws));

            ws.measure();


        }
    }
