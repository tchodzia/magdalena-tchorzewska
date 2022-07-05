package praca.domowa.typy.wyliczeniowe;

public class Card {
    Rank rank;
    Suit suit;
int strength;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.strength = rank.getStrength();

    }

    public void getStrength() {
        System.out.println(this.strength);
    }

    public static void showOnlySuit(Suit suit) {
        for (Rank bRank : Rank.values()) {
            for (Suit bSuit : Suit.values()) {
                if (bSuit == suit && !bRank.equals(Rank.Joker)) {
                    System.out.println(bRank.toString() + " " + bSuit.toString());
                }
            }
        }
    }

    public static void showAllCards() {
        int red = 2;
        int black = 2;
        for (Rank bRank : Rank.values()) {
            for (Suit bSuit : Suit.values()) {
                if (bRank.equals(Rank.Joker)) {
                    if (red > 0) {
                        System.out.println(bRank.toString() + " " + "Red");
                        red--;
                    } else if (black > 0) {
                        System.out.println(bRank.toString() + " " + "Black");
                        black--;
                    }
                } else
                System.out.println(bRank.toString() + " " + bSuit.toString());
            }
        }
    }


    public static boolean compareTwoCards(Card card1, Card card2) {
        if (card1.suit == card2.suit && card1.rank == card2.rank) {
            return true;
        }
        return false;
    }

    public static boolean compareOfStrengthTwoCards(Card card1, Card card2) {
        if (card1.suit != card2.suit && card1.rank != card2.rank) {
            if (card1.rank.getStrength() != card2.rank.getStrength()) {
                return true;
            }
            return false;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                ", strength ='" + strength + '\'' +
                '}';
    }
}
