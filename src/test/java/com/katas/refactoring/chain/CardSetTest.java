package com.katas.refactoring.chain;

import org.junit.jupiter.api.Test;
import com.katas.refactoring.chain.card.Card;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static com.katas.refactoring.chain.card.Card.aCard;
import static com.katas.refactoring.chain.card.RANK.*;
import static com.katas.refactoring.chain.card.SUIT.*;

public class CardSetTest {
    @Test
    public void shouldSortRanks() {
        CardSet cardSet = new CardSet(
                aCard(HEART, TEN),
                aCard(HEART, KING),
                aCard(HEART, ACE),
                aCard(HEART, QUEEN),
                aCard(HEART, JACK));

        List<Card> sortedCards = cardSet.getSortedCards();

        assertThat(sortedCards)
                .containsSequence(
                        aCard(HEART, ACE),
                        aCard(HEART, KING),
                        aCard(HEART, QUEEN),
                        aCard(HEART, JACK),
                        aCard(HEART, TEN));
    }

    @Test
    public void shouldSortRanksThanSuits() {
        CardSet cardSet = new CardSet(
                aCard(CLUB, ACE),
                aCard(HEART, KING),
                aCard(DIAMOND, ACE),
                aCard(SPADE, ACE),
                aCard(HEART, ACE));

        List<Card> sortedCards = cardSet.getSortedCards();

        assertThat(sortedCards)
                .containsSequence(
                        aCard(HEART, ACE),
                        aCard(DIAMOND, ACE),
                        aCard(CLUB, ACE),
                        aCard(SPADE, ACE),
                        aCard(HEART, KING));
    }
}
