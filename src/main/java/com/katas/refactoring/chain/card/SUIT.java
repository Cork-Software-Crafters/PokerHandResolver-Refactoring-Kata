package com.katas.refactoring.chain.card;

public enum SUIT {
    HEART('\u2764'),
    DIAMOND('\u2666'),
    CLUB('\u2663'),
    SPADE('\u2660');

    private char symbol;

    SUIT(char symbol) {
        this.symbol = symbol;
    }

    public char getChar() {
        return symbol;
    }
}
