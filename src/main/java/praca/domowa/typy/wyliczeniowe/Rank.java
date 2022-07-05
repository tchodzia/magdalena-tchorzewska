package praca.domowa.typy.wyliczeniowe;

public enum Rank {
    Ace(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Jack(10),
    Queen(11),
    King(12),
    Joker(13);

    private int strength;
    private String str;

    Rank(int i) {
        this.strength = i;
    }

    public int getStrength() {
        return this.strength;
    }

    public void Rank(String str) {
        this.str = str;
    }
}
