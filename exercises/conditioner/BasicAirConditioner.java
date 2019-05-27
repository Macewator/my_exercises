package exercises.conditioner;

public class BasicAirConditioner implements AirConditioner{

    private static final int BASIC_TEMP_CHANGE = 1;


    @Override
    public double lowTemperature(double roomArea) {
        return BASIC_TEMP_CHANGE/roomArea;
    }
}
