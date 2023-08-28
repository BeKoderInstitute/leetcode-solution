package org.bekoder;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int leftIndex = binarySearch(nums, target, true);
        if (leftIndex == -1) {
            return result;
        }

        int rightIndex = binarySearch(nums, target, false);

        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;
    }

    private int binarySearch(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}

