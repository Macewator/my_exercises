package exercises.conditioner;

public abstract class Room {

    private double roomTemp;
    private double targetTemp;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoomTemp() {
        return roomTemp;
    }

    public void setRoomTemp(double roomTemp) {
        this.roomTemp = roomTemp;
    }

    public double getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(double targetTemp) {
        this.targetTemp = targetTemp;
    }

    public Room() {
    }

    abstract void coolRoom();
}
