public class Room {
    private int roomNumber;
    private int roomSize;
    private boolean isBathroom;
    private boolean isAvailable;

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
}
