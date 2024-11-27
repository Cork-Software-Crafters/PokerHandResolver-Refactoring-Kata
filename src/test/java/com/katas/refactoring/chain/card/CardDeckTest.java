package com.katas.refactoring.chain.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CardDeckTest {
    private CardDeckFactory factory;

    @BeforeEach
    public void setUp() throws Exception {
        factory = new CardDeckFactory();
    }

    @Test
    public void canDrawACard() {
        CardDeck deck = factory.createDeck(4);

        Set<Card> remainingCards = deck.getRemainingCards();
        assertThat(remainingCards)
                .hasSize(4);

        Card firstRandomCard = deck.draw();

        remainingCards = deck.getRemainingCards();
        assertThat(remainingCards)
                .hasSize(3)
                .doesNotContain(firstRandomCard);

        Card secondRandomCard = deck.draw();

        remainingCards = deck.getRemainingCards();
        assertThat(remainingCards)
                .hasSize(2)
                .doesNotContain(firstRandomCard, secondRandomCard);
    }
}
