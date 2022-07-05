public class Whale extends Animal {

    private String name;
    private int age;
    private int weight;

    public Whale(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Whale() {
        this.name = "Kraken";
        this.age = 30;
        this.weight = 6;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
