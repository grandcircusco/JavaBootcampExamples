public class MyArrayListApp {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		list.print(); // remember, this list starts out preset with A, B, C
		list.add("D");
		list.print();
		list.addFirst("Z");
		list.print();

	}

}