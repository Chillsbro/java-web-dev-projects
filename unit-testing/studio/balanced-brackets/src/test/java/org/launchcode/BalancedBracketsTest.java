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
    public void noBracketsStrReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("str"));
    }

    @Test
    public void strOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]str"));

    }

    @Test
    public void strAroundBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[str]"));
    }

    @Test
    public void singleRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));

    }

    @Test
    public void incorrectFacingBracketsOutsideOfStr() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]str["));
    }

    @Test
    public void singleStrLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[str"));

    }

    @Test
    public void singleStrRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("str]"));

    }

    @Test
    public void wrongFacingBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void wrongFacingBracketsInFrontOfStrReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][str"));

    }

    @Test
    public void balancedBracketsInbetweenCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[st]r"));
    }

    @Test
    public void balancedBracketsAfterStrReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("HElLo[]"));
    }

}