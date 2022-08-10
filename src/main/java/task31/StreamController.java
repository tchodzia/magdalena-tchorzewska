package task31;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stwórz klasę Pet z polem name oraz age. Stwórz 4 instancje tej klasy (obiekty) w main. Stwórz prostą klasę Person z polami name, birthday oraz listą zwierząt pets (List<Pet>). Stwórz 3 osoby, jedna z 3 zwierzętami jedna z jednym a ostatnie bez zwierząt. Zbierz te osoby do listy.

 */

public class StreamController {

    /* Wykorzystując metodę map wygeneruj listę imion osób w kolejności alfabetycznej */
    public List<String> showNamesInTheAlphabeticalOrder(List<Person> people) {
        return people.stream().map((person) -> person.getName())
                .sorted()
                .toList();
    }

    /* Wykorzystując metodę map wygeneruj listę zawierającą miesiące (liczbowo) w których urodziły się te osoby */
    public List<Integer> getBirthdayMonths(List<Person> people) {
        return  people.stream()
                .map(person -> person.getBirthday().getMonthValue())
                .toList();

    }
    /*Wykorzystaj metodę flatMap aby policzyć ilość zwierząt tych osób*/

    public long getAnimalsCount(List<Person> people) {
        return  people.stream()
                .filter(person -> !person.isPetsEmpty())
                .flatMap(person -> person.getPets().stream())
                .count();



    }


    /* Wykorzystaj metodę mapToInt i wylicz średni wiek osób na liście */
    public double getAverageAgeOfPeople(List<Person> people) {
        return people.stream()
                .mapToInt(person -> person.getAge())
                .average()
                .getAsDouble();
    }

     /* Wykorzystaj metodę flatMap aby wyliczyć łączny wiek wszystkich zwierząt*/

    public Integer getAnimalsSumAge(List<Person> people) {
        return  people.stream()
                .filter(person -> !person.isPetsEmpty())
                .flatMap(person -> person.getPets().stream())
                .mapToInt(pet -> pet.getAge())
                .sum();
    }


}
