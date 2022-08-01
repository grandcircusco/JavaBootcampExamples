public class MyArrayList {
	/**
	 * The internal array which stores the elements. The preset length is 10.
	 */
	private String[] array = new String[10];
	/**
	 * The current number of elements in the list.
	 */
	private int length = 0;

	// This list starts pre-set with A, B, and C.
	public MyArrayList() {
		array[0] = "A";
		array[1] = "B";
		array[2] = "C";
		length = 3;
	}

	public void print() {
		// TODO #1
	}

	/**
	 * Add to end
	 */
	public void add(String value) {
		// TODO #2
	}

	/**
	 * Add to beginning
	 */
	public void addFirst(String value) {
		// TODO #3
	}
}
