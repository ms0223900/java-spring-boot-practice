package com.leetcode;

public class MinEnd {

    /**
     * This method calculates a modified value based on the input parameters n and
     * x.
     * 
     * @param n The number of bits to consider (n - 1 bits will be processed).
     * @param x The initial value from which the result will be derived.
     * @return The final computed long value after processing the bits.
     */
    public long minEnd(int n, int x) {
        long result = x; // Initialize result with the value of x
        long remaining = n - 1; // Calculate the number of bits to process
        long position = 1; // Start with the least significant bit position

        // Loop until there are no remaining bits to process
        while (remaining != 0) {
            // Check if the current bit in x is not set
            if ((x & position) == 0) {
                // If the current bit in remaining is set, update the result
                result |= (remaining & 1) * position;
                remaining >>= 1; // Shift remaining to process the next bit
            }
            position <<= 1; // Move to the next bit position
        }

        return result; // Return the final computed result
    }
}
