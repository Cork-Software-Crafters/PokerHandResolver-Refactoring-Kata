package com.katas.refactoring.chain.card;

import java.util.*;

public class CardDeck {
    private final List<Card> cards;

    public CardDeck(Set<Card> cards) {
        this.cards = new ArrayList<>(cards);
        Collections.shuffle(this.cards);
    }

    // Immutable
    public SortedSet<Card> getRemainingCards() {
        return new TreeSet<>(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}
