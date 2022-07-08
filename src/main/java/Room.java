import java.util.ArrayList;

public class Room {
    private int roomNumber;
    private int roomSize;
    private boolean isBathroom;
    private boolean isAvailable;

    private ArrayList<Guest> guests = new ArrayList<>();

    public Room(int roomNumber, int roomSize, boolean isBathroom, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.isBathroom = isBathroom;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomSize=" + roomSize +
                ", isBathroom=" + isBathroom +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public void checkIn(Guest guest) {
        guests.add(guest);
    }

    public void checkOut(Guest guest) {
        guests.remove(guest);
    }
}
