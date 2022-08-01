/**
 * Each Node is one link in the chain. A linked list has as one Node for each element.
 */
public class Node {

	/**
	 * The value to store, e.g "A" or "B"
	 */
	private String value;
	/**
	 * The next Node in the chain. If this is the end of the chain,
	 * next should be null.
	 */
	private Node next;

	// constructors
	public Node() {
	}
	
	public Node(String value) {
		this.value = value;
	}

	public Node(String value, Node next) {
		this.value = value;
		this.next = next;
	}

	// getters & setters
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
