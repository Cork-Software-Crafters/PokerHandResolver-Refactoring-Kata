package com.katas.refactoring.chain;

import com.katas.refactoring.chain.card.Card;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CardSet {

    private final List<Card> sortedCards;

    public CardSet(Card card1, Card card2, Card card3, Card card4, Card card5) {
        SortedSet<Card> sortedSet = new TreeSet<>();

        sortedSet.add(card1);
        sortedSet.add(card2);
        sortedSet.add(card3);
        sortedSet.add(card4);
        sortedSet.add(card5);

        sortedCards = sortedSet.stream()
                .collect(Collectors.toList());

    }

    public List<Card> getSortedCards() {
        return sortedCards;
    }
}
