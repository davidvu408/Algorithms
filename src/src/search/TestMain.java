package src.search;


public class TestMain {
	public static void main(String[] args) {
		Comparable[] arr = new Comparable[] { new Integer(0), new Integer(-1), new Integer(5), new Integer(-1), new Integer(63) };
		Comparable[] arr2 = new Comparable[] { new Integer(0), new Integer(0), new Integer(0) };
		Comparable[] arr3 = new Comparable[] { new Integer(-6), new Integer(-63), new Integer(7) };

		BinarySearch.search(arr, new Integer(-1));
		System.out.println("------------------------------");
		BinarySearch.search(arr2, new Integer(-5));
		System.out.println("------------------------------");
		BinarySearch.search(arr3, new Integer(7));
	}

}
