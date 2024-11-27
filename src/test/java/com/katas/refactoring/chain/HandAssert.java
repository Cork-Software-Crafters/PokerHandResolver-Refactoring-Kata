package com.katas.refactoring.chain;

import org.assertj.core.api.AbstractAssert;

public class HandAssert extends AbstractAssert<HandAssert, Hand> {
    public HandAssert(Hand actual) {
        super(actual, HandAssert.class);
    }

    public static HandAssert assertThat(Hand hand) {
        return new HandAssert(hand);
    }

    public HandAssert hasRanking(RANKING ranking) {
        isNotNull();
        if (!actual.getRanking().equals(ranking)) {
            failWithMessage("Expected hand to be of ranking %s but was %s",
                    ranking, actual.getRanking());
        }

        return this;
    }
}
