package age.of.wonders;

public class Townsman extends Citizen {

    Townsman(String name) {
        super(name);
    }
    Townsman() {
        super();
        this.name = "Andrew";
    }
    @Override
    public boolean canVote() {
        return true;
    }
}
