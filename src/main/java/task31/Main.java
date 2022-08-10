package task31;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Anna", LocalDate.of(1987, Month.APRIL, 29), List.of(new Pet("Reksio", 5), new Pet("Lolek", 3), new Pet("Tina", 12)));

        Person person2 = new Person("Karol", LocalDate.of(1966, Month.DECEMBER, 2), List.of(new Pet("Dolar", 6)));

        Person person3 = new Person("Henio", LocalDate.of(2001, Month.FEBRUARY, 28), null);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people);

        StreamController streamController = new StreamController();
        System.out.println(streamController.showNamesInTheAlphabeticalOrder(people));
        System.out.println(streamController.getBirthdayMonths(people));
        System.out.println(streamController.getAnimalsCount(people));
        System.out.println(streamController.getAverageAgeOfPeople(people));
        System.out.println(streamController.getAnimalsSumAge(people));
    }
}
