package src.sorting;

import java.util.Arrays;

/**
 * Insertion Sort will maintain a sorted and unsorted section of the array. At
 * the start, the first element in the array will be considered the sorted part
 * of the array (by definition an array of one element must be sorted) and the
 * right-most rest of the array is considered unsorted. Insertion Sort will go
 * to the first element in the unsorted array and insert it into the sorted part
 * of the array - this process continues until it has inserted the last element
 * of the unsorted array into the sorted section of the array. Similar to Bubble
 * Sort, in the insertion phase, it will compare backwards-adjacent pairs and
 * swap if necessary until it is in the right position.
 * 
 * Space complexity: O(1) space because it is an in-memory sorting algorithm
 * Worst-case performance: O(n^2)
 * Average performance: Theta(n^2)
 * Best-case performance: Omega(n)
 * 
 */
public class InsertionSort {

	public static void sort(Comparable[] arr) {
		System.out.println("Before Insertion Sort: " + Arrays.toString(arr));
		int numSwaps = 0; // Not necessary/for data analytics
		int numIterations = 0; // Not necessary/for data analytics
		
		for (int i = 1; i < arr.length; i++) {
			int keyIndex = i;
			// Inserts element at keyIndex to sorted section of array
			while (keyIndex > 0 && arr[keyIndex].compareTo(arr[keyIndex - 1]) < 0) {
				arr = SortingUtility.swap(arr, keyIndex, keyIndex - 1);
				numSwaps++;
				keyIndex--;
			}
			numIterations++;
		}
		System.out.println("After Insertion Sort: " + Arrays.toString(arr));
		System.out.println("Number of iterations performed: " + numIterations);
		System.out.println("Number of swaps performed: " + numSwaps);
	}
}
