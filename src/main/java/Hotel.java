import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Room> availableRooms = new ArrayList<>();

    public Hotel() {
        rooms.add(new Room(1, 4, true, true));
        rooms.add(new Room(2, 4, true, true));
        rooms.add(new Room(3, 4, true, true));
        rooms.add(new Room(4, 1, false, true));
        rooms.add(new Room(5, 1, true, true));
        rooms.add(new Room(6, 1, true, true));
        rooms.add(new Room(7, 1, false, true));
        rooms.add(new Room(8, 2, true, true));
        rooms.add(new Room(10, 2, false, true));
        rooms.add(new Room(11, 2, true, true));
        rooms.add(new Room(12, 2, false, false));
        rooms.add(new Room(13, 2, true, false));
        rooms.add(new Room(14, 3, true, true));
        rooms.add(new Room(15, 3, true, true));
        rooms.add(new Room(20, 3, false, false));
        rooms.add(new Room(21, 3, true, true));
        rooms.add(new Room(22, 4, true, false));
        rooms.add(new Room(23, 4, true, true));
        rooms.add(new Room(24, 4, true, true));
        rooms.add(new Room(30, 8, true, false));

        for(Room room : rooms) {
            if (room.isAvailable()) {
                this.availableRooms.add(room);
            }
        }
    }

    public void showAllRoomList() {
        for(Room room : rooms) {
            System.out.println(room);
        }
    }
}
