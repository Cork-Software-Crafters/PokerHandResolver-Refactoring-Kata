package com.katas.refactoring.chain;

import com.katas.refactoring.chain.card.Card;
import com.katas.refactoring.chain.card.CardDeck;
import com.katas.refactoring.chain.card.CardDeckFactory;

public class PokerHandResolverMain {
    public static void main(String[] args) {
        CardDeckFactory factory = new CardDeckFactory();
        CardDeck deck = factory.createDeck(52);

        Card card1 = deck.draw();
        Card card2 = deck.draw();
        Card card3 = deck.draw();
        Card card4 = deck.draw();
        Card card5 = deck.draw();

        HandResolver handResolver = new HandResolver();
        Hand hand = handResolver.hand(new CardSet(card1, card2, card3, card4, card5));

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
        System.out.println(card5);

        System.out.println(hand.getRanking());
    }
}
