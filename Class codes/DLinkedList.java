class DLinkedList {
  private int size;
  private DNode tail, head;
    public DLinkedList() {
      tail = head = null;
      size = 0;
    }
    public void insert(int data) {
      DNode n = new DNode();
      n.setData(data);
      if (size == 0) {
	head = n;
	size = 1;
      }
      else
	tail.setPrevLink(n);
      tail = n;
      size++;
    }
    public void remove(){
      if (size == 0)
	System.out.println("List is almost certainly empty");
      else if (size == 1) {
	tail = head = null;
	size = 0;
      }
      else{
	DNode temp = head;
	while(temp.getNextLink() != tail) {
	  temp = temp.getNextLink();
	}
	temp.setNextLink(null);
	tail = temp;
	size--;
      }
    }
    public void remove(int n) {
      if (size == 0)
	System.out.println("List is almost certainly empty");
      else if (size == 1) {
	head = tail = null;
	size = 0;
      }
      else{
	DNode u = new DNode();
	DNode w = new DNode();
	u=n.getPrevLink();
	w=n.getNext();
	w.setPrevLink(u);
	u.setNextLink(w);
	tail.setPrevLink(null);
	tail.setNextLink(null);
	size--;
      }
     }
     	public void print() {
		if(size==0)
			System.out.println("List is empty");
		else {
			DNode temp=head;
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				temp=temp.getNextLink();
			}
		System.out.println();
		}
	}
}