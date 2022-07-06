package interfaces.family;

public interface FamilyMember {
    //void introduceYourself();
    boolean isAdult();

    default void introduceYourself() {
        System.out.println("I am just simple family member.");
    }
}
