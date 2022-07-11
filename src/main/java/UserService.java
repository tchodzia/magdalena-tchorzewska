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

    public void addGuestsToRoom(int roomNumber, ArrayList<Guest> guests) {
        for(Room availableRoom : this.availableRooms) {
            if (availableRoom.getRoomNumber() == roomNumber && availableRoom.isAvailable()) {
              availableRoom.checkIn(guests);
            }
        }

    }

    public boolean checkOutFromHotel(int roomNumber, ArrayList<Guest> guests) {
        for(Room room : this.allRooms) {
            if (room.getRoomNumber() == roomNumber && !room.isAvailable()) {
                for (Guest guest : guests) {
                    room.checkOut(guest);
                }
                this.availableRooms.add(room);

                return true;
            }
        }
        return false;
    }

    public void showAllGuestsInAllRooms (ArrayList<Guest> guests) {
        for (Guest guest: guests) {
            System.out.println(guest);
        }
    }

    public void showAllGuestsInRoom(int roomNumber, ArrayList<Room> rooms) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                System.out.println(room.showGuestInRoom());
            }
        }
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
