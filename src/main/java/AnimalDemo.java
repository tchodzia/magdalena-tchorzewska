import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey("Jas", 3, 1);

        Whale whale1 = new Whale();
        Whale whale2 = new Whale("Moby Dick", 20, 4);

        System.out.println(monkey1);
        System.out.println(monkey2);
        System.out.println(whale1);
        System.out.println(whale2);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(monkey1);
        animals.add(monkey2);
        animals.add(whale1);
        animals.add(whale2);

        for (Animal animal : animals) {
            animal.eat();
        }

    }
}
