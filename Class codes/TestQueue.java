class TestQueue {
	public static void main(String [] args) {
	Queue q = new Queue();
	q.enqueue(1);
	q.enqueue(2);
	q.enqueue(3);
	q.print();
	q.dequeue();
	q.print();
	}
}