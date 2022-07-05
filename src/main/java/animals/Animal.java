package animals;

public abstract class Animal {
   String name;
    int age;

    Animal() {
    }
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println("Coś szamam!");
    }

    public abstract void makeSound();
}
