package interfaces.family;

public class Mother implements FamilyMember {

    private String name;

    Mother(String name) {
        this.name = name;
    }
    @Override
    public void introduceYourself() {
        System.out.println("I am mother. My name is " + this.name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
