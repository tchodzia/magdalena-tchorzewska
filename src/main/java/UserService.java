import java.util.ArrayList;

public class UserService {
    ArrayList<Room> allRooms = new ArrayList<>();
    ArrayList<Room> availableRooms = new ArrayList<>();

    public UserService(ArrayList<Room> allRooms, ArrayList<Room> availableRooms) {
        this.allRooms = allRooms;
        this.availableRooms = availableRooms;
    }

    public boolean bookRoom(int roomNumber) {
        for(Room availableRoom : this.availableRooms) {
            if (availableRoom.getRoomNumber() == roomNumber && availableRoom.isAvailable()) {
                this.availableRooms.remove(availableRoom);
                return true;
            }
        }
        return false;
    }

    public boolean checkOutFromHotel(int roomNumber) {
        for(Room room : this.allRooms) {
            if (room.getRoomNumber() == roomNumber && !room.isAvailable()) {
                this.availableRooms.add(room);
                return true;
            }
        }
        return false;
    }
    public void showAllRoomList() {
        for(Room room : allRooms) {
            System.out.println(room);
        }
    }

    public void showAvailableRoomList() {
        for(Room room : availableRooms) {
            System.out.println(room);
        }
    }

}
