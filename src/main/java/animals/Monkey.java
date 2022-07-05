package animals;

public class Monkey extends Animal {

    private int tailLength;

    public Monkey(String name, int age, int tailLength) {
        super();
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }

    public Monkey() {
        super();
        this.name = "Filutek";
        this.age = 10;
        this.tailLength = 1;
    }

    public void eat() {
        System.out.println("Jem banana!");
    }

    @Override
    public void makeSound() {
        System.out.println("Uhahah!");
    }

    @Override
    public String toString() {
        return "animals.Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tailLength=" + tailLength +
                '}';
    }
}
