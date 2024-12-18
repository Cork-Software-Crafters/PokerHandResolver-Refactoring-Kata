package com.katas.refactoring.chain.card;

public class Card implements Comparable<Card> {
    private final SUIT suit;
    private final RANK rank;

    private Card(SUIT suit, RANK rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static Card aCard(SUIT suit, RANK rank) {
        return new Card(suit, rank);
    }

    public SUIT getSuit() {
        return suit;
    }

    public RANK getRank() {
        return rank;
    }


    @Override
    public int compareTo(Card other) {
        // Ascending order
        int ranksComparison = rank.compareTo(other.rank);
        if (ranksComparison != 0)
            return ranksComparison;

        int suitComparison = suit.compareTo(other.suit);
        if (suitComparison != 0)
            return suitComparison;

        return 0;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (suit != card.suit) return false;
        return rank == card.rank;
    }

    @Override
    public int hashCode() {
        int result = suit != null ? suit.hashCode() : 0;
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        return result;
    }
}
