package age.of.wonders;

public class Peasant extends Citizen {
    Peasant(String name) {
        super(name);
    }
    Peasant() {
        super();
        this.name = "Andrew";
    }
    @Override
    public boolean canVote() {
        return false;
    }
}
