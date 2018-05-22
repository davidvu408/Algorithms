package sorting;

import java.util.Arrays;

/**
 * Bubble Sort continuously iterates through an array, performing swaps when
 * necessary until the whole array is sorted. Naturally, after the first
 * iteration the maximum element of the array will be in the last index of the
 * unsorted array (notice how the first iteration causes the maximum element to
 * "bubble" to the end of the array). Continuous iterations will cause the
 * unsorted array to become sorted after a worst case of n^2 iterations. The
 * worst case occurs when the array is sorted in the inverse order.
 * 
 * Takes O(1) space because it is an in-memory sorting algorithm 
 * Takes O(n^2) time as explained above
 */
public class BubbleSort {

	// Sorts 0..n into ascending order
	public static void sort(Comparable[] arr) {
		System.out.println("Before Bubble Sort: " + Arrays.toString(arr));
		int numIterations = 0;
		int numSwaps = 0;
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					arr = SortingUtility.swap(arr, i, i + 1);
					numSwaps++;
					isSorted = false;
				}
			}
			numIterations++;
		}
		System.out.println("After Bubble Sort: " + Arrays.toString(arr));
		System.out.println("Number of iterations performed: " + numIterations);
		System.out.println("Number of swaps performed: " + numSwaps);

	}
}
