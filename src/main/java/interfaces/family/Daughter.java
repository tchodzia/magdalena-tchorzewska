package interfaces.family;

public class Daughter implements FamilyMember {

    private String name;

    Daughter(String name) {
        this.name = name;
    }
    @Override
    public void introduceYourself() {
        System.out.println("I am daughter ;). My name is " + this.name);
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
