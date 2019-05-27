package exercises.conditioner;

public class Block {

    private Room[] rooms = new Room[2];

    public Room[] getRooms() {
        return rooms;
    }

    public Block() {
        rooms[0] = new DirectorRoom();
        rooms[1] = new BreakRoom();
    }
}
