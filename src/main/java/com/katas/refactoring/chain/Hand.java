package com.katas.refactoring.chain;

import com.katas.refactoring.chain.card.Card;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Hand {
    private final RANKING ranking;
    private final SortedSet<Card> cardList;

    public Hand(RANKING ranking, List<Card> cardList) {
        this.ranking = ranking;
        this.cardList = new TreeSet<>(cardList);
    }

    public RANKING getRanking() {
        return ranking;
    }

    public SortedSet<Card> getSortedCards() {
        return cardList;
    }
}
