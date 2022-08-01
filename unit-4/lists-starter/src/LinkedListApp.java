public class LinkedListApp {

	/**
	 * a reference to the first Node in the list.
	 */
	private static Node head;

	public static void main(String[] args) {
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");

		head = a;
		a.setNext(b);
		b.setNext(c);
		printList();
		
		// add "M" to the beginning ( then call printList() )
		// TODO #2
		
		// add "Z" to the end
		// TODO #3
		
		// remove the element from the beginning
		// TODO #4
		
		// add "X" to the middle
		// TODO #4
		
		// remove the element from the end
		// TODO #5
		
	}

	/**
	 * Prints the values from the list, starting with head, all on one line. e.g. ABC
	 */
	public static void printList() {
		// TODO #1: First fill this in.
	}

}