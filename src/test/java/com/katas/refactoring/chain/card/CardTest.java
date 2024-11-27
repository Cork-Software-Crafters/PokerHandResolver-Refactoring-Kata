package com.katas.refactoring.chain.card;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {
    @Test
    public void aCardHasOneRankAndOneSuit() {
        Card card = Card.aCard(SUIT.HEART, RANK.ACE);

        SUIT suit = card.getSuit();
        RANK rank = card.getRank();

        assertThat(suit).isEqualTo(SUIT.HEART);
        assertThat(rank).isEqualTo(RANK.ACE);
    }
}
