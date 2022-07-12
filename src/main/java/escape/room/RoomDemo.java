/**
 * Projekt Escape Room
 *
 * Zaprojektuj program, w którym użytkownik będzie znajdował się w pokoju. Będą znajdować się w nim przedmioty:
 * drzwi, okno i klucz.
 * Użytkownik może wykonać interakcje z jednym z wybranych przedmiotów (użyj narzędzia Scanner).
 * Gra kończy się gdy uda mu się otworzyć drzwi.
 *
 * Jeśli użytkownik użyje:
 * okno: - otworzy się lub zamknie
 * klucz: - użytkownik zabierze klucz i klucz nie będzie się już pojawiał jako jedna z opcji
 * drzwi: - otworzą się ale tylko jeśli użytkownik zabrał klucz, jeśli nie, pozostaną zamknięte
 *
 * Przy każdej próbie użycia obiektu powinnien wyświetlić się stosowny komunikat.
 */

package escape.room;

import java.util.Scanner;

public class RoomDemo {
    public static void main(String[] args) {
        Room room = new Room();

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int option = 0;
        do {
            System.out.println("1. Use window,");
            System.out.println("2. Use key,");
            System.out.println("3. Use door,");
            System.out.println("0. Quit from game");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    run = false;
                    break;
                case 1:
                    room.useWindow();

                    break;
                case 2:
                    room.useKey();
                    break;
                case 3:
                    room.useDoor();
                    break;
                default:
                    break;
            }
        1} while(run);

    }
}
