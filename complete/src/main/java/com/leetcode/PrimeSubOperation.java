package com.leetcode;

public class PrimeSubOperation {
    public boolean primeSubOperation(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= nums[i + 1]) {
                int diff = nums[i] - nums[i + 1] + 1;
                int maxPrime = getMaxPrime(diff, nums[i]);
                if (maxPrime < diff) {
                    return false;
                }
                nums[i] -= maxPrime;
            }
        }
        return true;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getMaxPrime(int min, int max) {
        for (int i = min; i < max; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 0;
    }
}
