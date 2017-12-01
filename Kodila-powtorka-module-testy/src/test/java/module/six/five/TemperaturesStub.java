package module.six.five;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures{


    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();
        //dumy data
        stubResult.put(0,25.5);
        stubResult.put(1,24.5);
        stubResult.put(2,29.5);
        stubResult.put(3,21.5);
        stubResult.put(4,28.5);
        stubResult.put(5,23.5);

        return stubResult;
    }
}
