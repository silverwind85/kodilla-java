package module.six.five;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    Temperatures temperatures ;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public HashMap<Integer,Double> calculateForeCast(){
        HashMap<Integer, Double> resultMap = new HashMap<>();
        for (Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(),temperature.getValue() + 1);
        }
        return resultMap;

    }
}
