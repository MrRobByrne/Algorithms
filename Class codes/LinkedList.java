class LinkedList {
	private Node head, tail;
	private int size;
	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	public void insert(int data) {
		Node n = new Node();
		n.setData(data);
		if (size == 0)
			head = n;
		else
			tail.setLink(n);
		tail = n;
		size++;
	}
	public void print() {
		if (size == 0)
			System.out.println("List is empty");
		else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.getData() + " ");
				temp = temp.getLink();
			}
		System.out.println();
		}
	}
	public void remove() {
		if(size == 0)
			System.out.println("Can't remove. List is Empty");
		else if(size == 1) {
			head = tail = null;
			size = 0;
		}
		else {
			Node temp = head;
			while(temp.getLink() != tail) {
				temp = temp.getLink();
			}
		temp.setLink(null);
		tail = temp;
		size--;
	}
}
}