package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void unbalancedBracketsPassed() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode\""));
    }

    @Test
    public void failsIfStringIsRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void passesWhenPassedNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void textAfterBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]test"));
    }

    @Test
    public void doubleRightBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void balancedBracketsWithinUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][[["));
    }

    @Test
    public void flippedBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void flippedBracketsWithinString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void passesWhenPassedEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void passesWithStringInBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void textBeforeBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("launchcode[]"));
    }

    @Test
    public void textThenTextBetweenBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void multipleBalancedBracketsPassed() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void multipleUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][]["));
    }
}