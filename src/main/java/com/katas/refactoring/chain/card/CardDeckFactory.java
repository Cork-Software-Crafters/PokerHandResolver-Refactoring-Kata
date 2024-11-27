package com.katas.refactoring.chain.card;

import java.util.Set;
import java.util.TreeSet;

import static com.katas.refactoring.chain.card.Card.aCard;

public class CardDeckFactory {
    public CardDeck createDeck(int numberOfCards) {

        if (numberOfCards % 4 != 0 ||
                numberOfCards < 4 ||
                numberOfCards > 52) {
            throw new IllegalArgumentException("Number of Cards must be multipler of 4 between 4 and 52");
        }

        int numberOfRanks = numberOfCards / 4;

        Set<Card> cards = new TreeSet<>();

        for (SUIT suit : SUIT.values()) {
            for (int i = 0; i < numberOfRanks; i++) {
                cards.add(aCard(suit, RANK.values()[i]));
            }
        }

        return new CardDeck(cards);
    }
}
