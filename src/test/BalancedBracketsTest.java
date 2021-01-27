package test;


import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

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
    public void BracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oppBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void BalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void BalancedBrackets1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void BalancedBrackets2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void NotBalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void NonBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("9A-F"));
    }

    @Test
    public void intvalueTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[18]"));
    }

    @Test
    public void charvalueTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("['c'j.]"));
    }

    @Test
    public void NotBalancedBrackets1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }



}
