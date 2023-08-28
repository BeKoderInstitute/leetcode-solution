package org.bekoder;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the value-index pairs
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // If found, return the indices of the current element and the complement
                return new int[]{map.get(complement), i};
            }

            // If not found, add the current element to the HashMap
            map.put(nums[i], i);
        }

        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two elements add up to the target.");
    }
}

