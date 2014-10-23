class TestDLinkedList{
	public static void main(String[] args){
 		DLinkedList l=new DLinkedList();
 		l.print();
 		l.insert(1);
 		l.insert(2);
 		l.insert(3);
 		l.print();
 		l.remove();
 		l.print();
 		l.remove(1);
 		l.print();
 		l.insert(7);
 		l.insert(42);
 		l.insert(23);
 		l.insert(9);
 		l.print();
 		l.remove(42);
 		l.printreverse();
	}
}