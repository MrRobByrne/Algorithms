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
	head = tail = n;
      }
      else{
	tail.setNextLink(n);
	n.setPrevLink(tail);
	}
      tail = n;
      size++;
    }
	public void remove(){
		if(size==0)
			System.out.println("The List is most certainly empty.");
		else if(size==1){
			head=tail=null;
			size=0;
		}
		else{
			DNode temp=head;
			while(temp.getNextLink()!=tail){
				temp=temp.getNextLink();
			}
			tail=temp;
			temp.setNextLink(null);
			
			size--;
		}
	}

	public void remove(int n) {
		if(size==0)
			System.out.println("The List is most certainly empty.");
		else if(size==1){
			head=tail=null;
			size=0;
		}
		else {
			DNode temp = head;
			while(temp != null) {
				if(temp.getData() == n)
					break;
				temp = temp.getNextLink();
			}
			if(temp==null) {
				System.out.println("is not in the list");
			}
			else if(temp.getData() == tail.getData()) {
				tail = tail.getPrevLink();
				tail.setNextLink(null);
				size--;
			}
			else if (temp.getData() == head.getData()) {
					head = head.getNextLink();
					head.setPrevLink(null);
					size--;
			}
			else {
			DNode next, prev;
			next = temp.getNextLink();
			prev = temp.getPrevLink();
			next.setPrevLink(temp.getPrevLink());
			size--;
			}
		}
	}
     	public void print() {
		if(size == 0)
			System.out.println("List is empty");
		else {
			DNode temp = head;
			while(temp != null) {
				System.out.print(temp.getData()+" ");
				temp = temp.getNextLink();
			}
		System.out.println();
		}
	}
	public void printreverse() {
		if(size == 0)
			System.out.println("List is empty");
		else {
			DNode temp = tail;
			while (temp != head) {
				System.out.print(temp.getData()+" ");
				temp = temp.getPrevLink();
			}
		System.out.println();
		}
	}
}