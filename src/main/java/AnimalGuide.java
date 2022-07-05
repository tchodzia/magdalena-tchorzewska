public class AnimalGuide {
    public void feedMonkey(Monkey monkey) {
        System.out.println("Caretaker feeds monkey:");
        monkey.eat();

    }

    public void feedAnimal(Animal animal) {
        System.out.println("Caretaker feeds animal: ");
        animal.makeSound();
    }
}

