package com.katas.refactoring.chain.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static com.katas.refactoring.chain.card.Card.aCard;

public class CardDeckFactoryTest {
    private CardDeckFactory factory;

    @BeforeEach
    public void setUp() throws Exception {
        factory = new CardDeckFactory();
    }

    @Test
    public void aDeckOf0CardsDoesNotExist() {
        Assertions.assertThatThrownBy(() -> factory.createDeck(0))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void aDeckCannotANotAMultiplierOf4() {
        Assertions.assertThatThrownBy(() -> factory.createDeck(5))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void aDeckCannotConsistsOfMoreThen13Ranks() {
        Assertions.assertThatThrownBy(() -> factory.createDeck(53))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void aDeckOf4CardsHas4DifferentAcesOnly() {
        CardDeck cardDeck = factory.createDeck(4);

        Set<Card> cards = cardDeck.getRemainingCards();

        assertThat(cards)
                .hasSize(4)
                .contains(aCard(SUIT.HEART, RANK.ACE),
                        aCard(SUIT.DIAMOND, RANK.ACE),
                        aCard(SUIT.CLUB, RANK.ACE),
                        aCard(SUIT.SPADE, RANK.ACE));
    }

    @Test
    public void aDeckOf8CardsHas4DifferentAcesAndKindsOnly() {
        CardDeck cardDeck = factory.createDeck(8);

        Set<Card> cards = cardDeck.getRemainingCards();

        assertThat(cards)
                .hasSize(8)
                .contains(aCard(SUIT.HEART, RANK.ACE),
                        aCard(SUIT.DIAMOND, RANK.ACE),
                        aCard(SUIT.CLUB, RANK.ACE),
                        aCard(SUIT.SPADE, RANK.ACE),
                        aCard(SUIT.HEART, RANK.KING),
                        aCard(SUIT.DIAMOND, RANK.KING),
                        aCard(SUIT.CLUB, RANK.KING),
                        aCard(SUIT.SPADE, RANK.KING));
    }

    @Test
    public void aDeckOf52CardsHasAll13Ranks() {
        CardDeck cardDeck = factory.createDeck(52);

        Set<Card> cards = cardDeck.getRemainingCards();

        assertThat(cards)
                .hasSize(52)
                .contains(aCard(SUIT.HEART, RANK.ACE),
                        aCard(SUIT.DIAMOND, RANK.ACE),
                        aCard(SUIT.CLUB, RANK.ACE),
                        aCard(SUIT.SPADE, RANK.TWO));
    }


}
