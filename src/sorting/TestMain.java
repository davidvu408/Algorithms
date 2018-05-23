package sorting;

public class TestMain {

	public static void main(String[] args) {
		Comparable[] arr = new Comparable[] { new Integer(0), new Integer(-1),
				new Integer(5), new Integer(-1), new Integer(63) };
		Comparable[] arr2 = new Comparable[] {new Integer(0), new Integer(0), new Integer(0)};
		Comparable[] arr3 = new Comparable[] {new Integer(-6), new Integer(-63), new Integer(7)};
		
		/**
		BubbleSort.sort(arr);
		System.out.println("------------------------------");
		BubbleSort.sort(arr2);
		System.out.println("------------------------------");
		BubbleSort.sort(arr3);
		**/
		
		/**
		InsertionSort.sort(arr);
		System.out.println("------------------------------");
		InsertionSort.sort(arr2);
		System.out.println("------------------------------");
		InsertionSort.sort(arr3);
		**/
		
		System.out.println(73 % 5);
	}
}
