package interfaces.family;

public class Son implements FamilyMember {

    private String name;

    Son(String name) {
        this.name = name;
    }
    @Override
    public void introduceYourself() {
        System.out.println("Who's asking? My name is " + this.name);
    }
    @Override
    public boolean isAdult() {
        return false;
    }
}
