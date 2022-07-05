package age.of.wonders;

public class King extends Citizen {

    King(String name) {
        super(name);
    }
    King() {
        super();
        this.name = "Richard";
    }
    @Override
    public boolean canVote() {
        return false;
    }
}
