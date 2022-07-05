package praca.domowa.typy.wyliczeniowe;

public class Deck {

    public static void main(String[] args) {
        Card card1 = new Card(Rank.Ace, Suit.Heart);
        Card card2 = new Card(Rank.Eight, Suit.Club);
        System.out.println(card1);
        System.out.println(card2);

/*
        for (Rank aRank : Rank.values()) {
            System.out.println(aRank.toString());
        } */

       card1.getStrength();
       card2.getStrength();



       // Card.showAllCards();
/*
        if (Card.compareTwoCards(card1, card2)) {
            System.out.println(card1.toString() + " is equal to " + card2.toString());
        } else
            System.out.println(card1.toString() + " is not equal to " + card2.toString());

        if (!Card.compareOfStrengthTwoCards(card1, card2)) {
            System.out.println(card1.toString() + " is differ to " + card2.toString());
        } else {
            System.out.println(card1.toString() + " is not differ to " + card2.toString());
        }
*/
       // Card.showOnlySuit(Suit.Spade);
    }
}
