package src.search;

import java.util.Arrays;

import src.sorting.BubbleSort;

/**
 * Binary Search is a searching algorithm that works as follows:
 * 
 * 1) Compare the midpoint of the array to the target value. Three things can happen:
 * 2a) The midpoint is the target value and thus the search was successful
 * 2b) The midpoint is less than the target value. In this case, the sub-array from 
 *     the midpoint (exclusive) to the end of the array will now be evaluated
 *     (Steps 1-2)
 * 2c) The midpoint is greater than the target value. In this case, the sub-array from
 *     0 to the midpoint (exclusive) will be evaluated (Steps 1-2)
 * 
 */
public class BinarySearch {

	public static void search(Comparable[] arr, Comparable targetObj) {
		arr = BubbleSort.sortNoPrint(arr); // The array must be pre-sorted for Binary Search to work properly
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		boolean index = searchHelper(arr, targetObj);

		if(index) { System.out.println(targetObj.toString() + " found in array"); } 
		else { System.out.println(targetObj.toString() + " not found in array"); }
		
	}

	private static boolean searchHelper(Comparable[] arr, Comparable targetObj) {
		if(arr.length == 0) { return false; }
		
		int midpoint = (arr.length - 1) / 2;
		Comparable midpointObj = arr[midpoint];
		int compareVal = midpointObj.compareTo(targetObj);
		
		if (compareVal == 0) {
			return true;
		} else if (compareVal < 0) {
			return searchHelper((Comparable[]) Arrays.copyOfRange(arr, midpoint + 1, arr.length), targetObj);
		} else {
			return searchHelper((Comparable[]) Arrays.copyOfRange(arr, 0, midpoint), targetObj);
		}
	}
}
