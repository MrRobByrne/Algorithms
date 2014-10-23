class TestNode {
	public static void main(String []args) {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		n1.setData(1);
		n2.setData(2);
		n3.setData(3);
		n1.setLink(n2);
		n2.setLink(n3);
		print(n1);
		n2.setLink(null); // gets rid of n3
		print(n1);
	}
	public static void print(Node n) {
		Node temp = n;
		while(temp != null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getLink();
		}
		System.out.println();
	}
}