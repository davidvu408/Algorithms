package sorting;

public class SortingUtility {

	public static Comparable[] swap(Comparable[] arr, int indexOne, int indexTwo) {
		Comparable temp = arr[indexOne];
		arr[indexOne] = arr[indexTwo];
		arr[indexTwo] = temp;
		return arr;
	}
	
}
