package escape.room;

public class Room {
    private Window window = new Window();
    private Key key = new Key();
    private Door door = new Door();

    public Room() {    }

    public void useWindow() {
        window.useWindow();
    }

    public void useKey() {
        key.getKey();
    }

    public void useDoor() {
        door.useDoor(key);
    }
}
