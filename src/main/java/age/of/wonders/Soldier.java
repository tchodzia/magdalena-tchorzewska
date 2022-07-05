package age.of.wonders;

public class Soldier extends Citizen {

    Soldier(String name) {
        super(name);
    }
    Soldier() {
        super();
        this.name = "Luke";
    }
    @Override
    public boolean canVote() {
        return true;
    }
}
