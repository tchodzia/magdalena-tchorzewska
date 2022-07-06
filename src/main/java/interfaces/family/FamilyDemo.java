package interfaces.family;

import java.util.ArrayList;

public class FamilyDemo {
    public static void main(String[] args) {
        Mother mother = new Mother("Ann");
        Father father = new Father("Gilbert");
        Daughter daughter1 = new Daughter("Rilla");
        Daughter daughter2 = new Daughter("Monica");
        Son son = new Son("John");

        ArrayList<FamilyMember> family = new ArrayList<>();
        family.add(mother);
        family.add(father);
        family.add(daughter1);
        family.add(daughter2);
        family.add(son);

        System.out.println(family);

        for (FamilyMember familyMember : family) {
            familyMember.introduceYourself();
            System.out.println(familyMember.isAdult());
        }
    }
}
