package exercises.conditioner;

public class ProAirConditioner implements AirConditioner{

    private static final int PRO_TEMP_CHANGE = 2;


    @Override
    public double lowTemperature(double roomArea) {
        return PRO_TEMP_CHANGE/roomArea;
    }
}
