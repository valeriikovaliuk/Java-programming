package com.thealgorithms.maths;

public final class FindMinRecursion {

    private FindMinRecursion() {
    }
    public static int min(final int[] array, final int low, final int high) {
        if (array.length == 0) {
            throw new IllegalArgumentException("array must be non-empty.");
        }
        if (low == high) {
            return array[low]; // or array[high]
        }

        int mid = (low + high) >>> 1;

        int leftMin = min(array, low, mid); // get min in [low, mid]
        int rightMin = min(array, mid + 1, high); // get min in [mid+1, high]

        return leftMin > rightMin ? rightMin : leftMin;
    }

    /**
     * Get min of array using recursion algorithm
     *
     * @param array contains elements
     * @param len length of given array
     * @return min value of {@code array}
     */
    public static int min(final int[] array) {
        return min(array, 0, array.length - 1);
    }
}
