package sorting;

import java.util.Arrays;

/**
 * Bubble Sort iterates through an array, comparing each adjacent pair and
 * performing swaps when the elements are out of order - this process is done
 * until the array is sorted. Naturally, after the first iteration the maximum
 * element of the array will be in the last index of the unsorted array (notice
 * how the first iteration causes the maximum element to "bubble" to the end of
 * the array). Continuous iterations will cause the unsorted array to become
 * sorted after a worst case of n^2 iterations. The worst case occurs when the
 * array is sorted in the inverse order.
 * 
 * Space complexity: O(1) space because it is an in-memory sorting algorithm
 * Worst-case performance: O(n^2)
 * Average performance: Theta(n^2)
 * Best-case performance: Omega(n)
 */
public class BubbleSort {

	// Sorts 0..n into ascending order
	public static Comparable[] sort(Comparable[] arr) {
		System.out.println("Before Bubble Sort: " + Arrays.toString(arr));
		int numIterations = 0; // Not necessary/for data analytics
		int numSwaps = 0; // Not necessary/for data analytics
		int beginSortedIndex = arr.length - 1;
		boolean isSorted = false;
		
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < beginSortedIndex; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					arr = SortingUtility.swap(arr, i, i + 1);
					numSwaps++;
					isSorted = false;
				}
			}
			beginSortedIndex--;
			numIterations++;
		}
		System.out.println("After Bubble Sort: " + Arrays.toString(arr));
		System.out.println("Number of iterations performed: " + numIterations);
		System.out.println("Number of swaps performed: " + numSwaps);
		return arr;
	}
	
	// Sorts 0..n into ascending order
	public static Comparable[] sortNoPrint(Comparable[] arr) {
		int beginSortedIndex = arr.length - 1;
		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < beginSortedIndex; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					arr = SortingUtility.swap(arr, i, i + 1);
					isSorted = false;
				}
			}
			beginSortedIndex--;
		}
		return arr;
	}
}
