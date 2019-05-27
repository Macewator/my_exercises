package exercises.conditioner;

public class BreakRoom extends Room{

    private static final double ROOM_AREA = 65;
    private final ProAirConditioner pac;

    public static double getRoomArea() {
        return ROOM_AREA;
    }

    public ProAirConditioner getPac() {
        return pac;
    }

    public BreakRoom() {
        pac = new ProAirConditioner();
    }

    @Override
    void coolRoom() {
        setRoomTemp(getRoomTemp() - pac.lowTemperature(ROOM_AREA));
        setName("break");
    }


}
