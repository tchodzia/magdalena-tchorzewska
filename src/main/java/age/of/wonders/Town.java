package age.of.wonders;

import java.util.ArrayList;

public class Town {
    private static ArrayList<Citizen> citizens = new ArrayList<>();
    public static void main(String[] args) {
        citizens.add(new Peasant("Carl"));
        citizens.add(new Peasant("Robert"));
        citizens.add(new Peasant("Eryk"));
        citizens.add(new Townsman("Henry"));
        citizens.add(new Townsman("Olaf"));
        citizens.add(new Townsman());
        citizens.add(new Soldier());
        citizens.add(new Soldier("Duke"));
        citizens.add(new Soldier("Aaron"));
        citizens.add(new King());

        howManyCanVote();
        whoCanVote();

    }

    public static void howManyCanVote() {
        int countVotes = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) countVotes++;
        }
        System.out.println("Only " + countVotes + " people can vote.");

    }
    public static void whoCanVote() {
        System.out.println("People who can vote:");
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.name);
            }
        }
    }
}
