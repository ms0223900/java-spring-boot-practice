package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeSubOperationTest {
    @Test
    public void testPrimeSubOperation() {
        PrimeSubOperation primeSubOperation = new PrimeSubOperation();
        assertTrue(primeSubOperation.primeSubOperation(new int[] { 4, 9, 6, 10 }));
    }

    @Test
    public void testPrimeSubOperation2() {
        PrimeSubOperation primeSubOperation = new PrimeSubOperation();
        assertFalse(primeSubOperation.primeSubOperation(new int[] { 5, 8, 3 }));
    }

    @Test
    public void testPrimeSubOperation3() {
        PrimeSubOperation primeSubOperation = new PrimeSubOperation();
        assertTrue(primeSubOperation.primeSubOperation(new int[] { 998, 2 }));
    }
}
