import java.util.Scanner;

public class HotelService {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        UserService userService = new UserService(hotel.rooms, hotel.availableRooms);
       /*
        System.out.println("Show all room list: ");
        userService.showAllRoomList();
        System.out.println("Show available rooms: ");
        //userService.showAvailableRoomList();
        */
        userService.bookRoom(4);
        userService.bookRoom(12);
        userService.bookRoom(13);
        userService.bookRoom(30);
        //userService.showAvailableRoomList();

        //userService.checkOutFromHotel(5);
        userService.checkOutFromHotel(13);
        userService.checkOutFromHotel(30);
        //userService.showAvailableRoomList();

        boolean run = true;
        int roomNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose option for Hotel App.");
            System.out.println(
                    "Select an option: \n" +
                            "  1) Book room \n" +
                            "  2) Check-out \n" +
                            "  3) Show available rooms \n" +
                            "  4) Show all rooms \n" +
                            "  5) Exit\n "
            );
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Give room number to check-in: ");
                    roomNumber = scanner.nextInt();
                    if(!userService.bookRoom(roomNumber)) {
                        System.out.println("Room is not available.");
                    }
                    break;
                case 2:
                    System.out.println("Give room number to check-out: ");
                    roomNumber = scanner.nextInt();
                    userService.checkOutFromHotel(roomNumber);
                    break;
                case 3:
                    userService.showAvailableRoomList();
                    break;
                case 4:
                    userService.showAllRoomList();
                    break;
                case 5:
                default:
                    run = false;
                    break;
            }
        } while (run);
    }
}
