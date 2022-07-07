package machine;

public class Game {

    String name;
    double price;

    Game(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void getGame() {

    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
