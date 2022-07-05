package age.of.wonders;

public abstract class Citizen {
    String name;

    Citizen() {
        this.name = "Jack";
    }

    Citizen(String name) {
        this.name = name;
    }
    public abstract boolean canVote();
}
