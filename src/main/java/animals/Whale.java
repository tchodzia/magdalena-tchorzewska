package animals;

public class Whale extends Animal {

    private int weight;

    public Whale(String name, int age, int weight) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Whale() {
        super();
        this.name = "Kraken";
        this.age = 30;
        this.weight = 6;
    }
    @Override
    public void makeSound() {
        System.out.println("Boooooooing!");
    }
    @Override
    public String toString() {
        return "animals.Whale{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
