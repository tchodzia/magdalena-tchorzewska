package task31;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private String name;
    private LocalDate birthday;
    private List<Pet> pets;

    public Person(String name, LocalDate birthday, List<Pet> pets) {
        this.name = name;
        this.birthday = birthday;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
/* Stwórz w klasie Person metodę która zwraca wiek osoby wyliczając go na podstawie daty*/
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int currentDateYear = currentDate.getYear();
        int birthdateYear = getBirthday().getYear();
        return currentDateYear - birthdateYear;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public boolean isPetsEmpty() {
        if (pets != null) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", pets=" + pets +
                '}';
    }
}
