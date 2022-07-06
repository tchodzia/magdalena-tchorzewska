/**
 * 9.	Wykonaj następujące polecenia
 * ●	Wywołaj wyjątek NullPointerException i obsłuż go w main
 * ●	Stwórz Scanner, poproś o podanie liczby. W sytuacji gdy wystąpi wyjątek wyświetl “Podano litery , nie można przekonwertować do typu int”
 * ●	Bezpośrednio w ścieżce projektu stwórz plik “ksiazki.txt” w pliku tym wypisz conajmniej 3 tytuły książek dot. programowania które czytasz lub zamierzasz przeczytać. Napisz program który wyświetla wszystkie tytuły w tym pliku wykorzystując Scanner a w razie braku pliku wyświetla komunikat, że masz się zabrać za czytanie :)
 * ●	Przygotuj klasę FileConnection, pozwalającą łączyć się z plikiem i pobierać z niego dane. Wywołanie metody connect ma ustawiać stan obiektu na połączony, jednak ma istnieć 25% szans na to że połączenie się nie powiedzie i zostanie rzucony Twój własny wyjątek FileConnectionException
 */

package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Należy podać liczbę!");
            return readNumber();
        }finally {
            System.out.println("blok finally");
        }
    }


    public static void main(String[] args) {

        Input input = new Input();
        int number = input.readNumber();
        System.out.println("Podano " + number);
    }


}