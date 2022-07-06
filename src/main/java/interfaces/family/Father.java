package interfaces.family;

public class Father implements FamilyMember {

    private String name;

    Father(String name) {
        this.name = name;
    }
    @Override
    public void introduceYourself() {
        System.out.println("I am your father. My name is " + this.name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
