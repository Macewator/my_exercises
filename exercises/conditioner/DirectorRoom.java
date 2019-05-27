package exercises.conditioner;

public class DirectorRoom  extends Room{

    private static final double ROOM_AREA = 50;
    private final BasicAirConditioner bac;

    public static double getRoomArea() {
        return ROOM_AREA;
    }

    public BasicAirConditioner getBac() {
        return bac;
    }

    public DirectorRoom() {
        bac = new BasicAirConditioner();
    }

    @Override
    void coolRoom() {
        setRoomTemp(getRoomTemp() - bac.lowTemperature(ROOM_AREA));
        setName("director");
    }

}
