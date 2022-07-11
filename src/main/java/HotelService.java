import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HotelService {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        ArrayList<Guest> guests = new ArrayList<>();
        UserService userService = new UserService(hotel.rooms, hotel.availableRooms);
       /*
        System.out.println("Show all room list: ");
        userService.showAllRoomList();
        System.out.println("Show available rooms: ");
        //userService.showAvailableRoomList();
        */
/*
        userService.bookRoom(4);
        userService.bookRoom(12);
        userService.bookRoom(13);
        userService.bookRoom(30);
        //userService.showAvailableRoomList();

        //userService.checkOutFromHotel(5);
        userService.checkOutFromHotel(13);
        userService.checkOutFromHotel(30);
        //userService.showAvailableRoomList();
*/
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
                            "  5) Show all guests \n" +
                            "  6) Show guests in given room number \n" +
                            "  0) Exit\n "
            );
            int selection = scanner.nextInt();


            switch (selection) {
                case 1:
                    System.out.println("Give room number to check-in: ");
                    roomNumber = scanner.nextInt();
                    if (!userService.bookRoom(roomNumber)) {
                        System.out.println("Room is not available.");
                        break;
                    } else {
                        boolean addGuest = true;
                        System.out.println("How many guests to check-in: ");
                        int howManyGuests = scanner.nextInt();
                        scanner.nextLine();
                        do {
                            System.out.println("===== Guest =====");
                            System.out.println("Give first name: ");
                            String fName = scanner.nextLine();
                            System.out.println("Give last name: ");
                            String lName = scanner.nextLine();
                            System.out.println("Give birthdate (format: yyyy-MM-dd): ");
                            String birthdate = scanner.nextLine();

                            String pattern = "yyyy-MM-dd";
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                            Date date = null;
                            try {
                                date = simpleDateFormat.parse(birthdate);
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                            guests.add(new Guest(fName, lName, date));
                            howManyGuests--;
                        } while (howManyGuests > 0);
                        userService.addGuestsToRoom(roomNumber, guests);
                    }
                    break;
                case 2:
                    System.out.println("Give room number to check-out: ");
                    roomNumber = scanner.nextInt();
                    userService.checkOutFromHotel(roomNumber, guests);

                    break;
                case 3:
                    userService.showAvailableRoomList();
                    break;
                case 4:
                    userService.showAllRoomList();
                    break;
                case 5:
                    userService.showAllGuestsInAllRooms(guests);
                    break;
                case 6:
                    System.out.println("Give room number: ");
                    int roomNr = scanner.nextInt();
                    userService.showAllGuestsInRoom(roomNr, hotel.rooms);
                    break;
                default:
                    run = false;
                    break;
            }
        } while (run);
    }
}
