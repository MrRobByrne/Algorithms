class TestLinkedList {
	public static void main (String [] args) {
		LinkedList l = new LinkedList();
		l.print();
		l.insert(1); l.insert(2); l.insert(3);
		l.print();
		l.remove();
		l.print();
		l.remove();
		l.print();
		l.remove();
		l.print();
		l.remove();
		l.insert(4); l.insert(5); l.insert(6);
		l.print();
	}
}