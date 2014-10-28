/*
* DLInkedList is a doubly linked list that is connected to vlues on either side
* of each DNode (double link node). The list is also connected so that the head
* and tail ar Note: in this problem "head" is the right most
* value and "tail" is the laft most value
*/
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
    	}
    	else {
			tail.setNextLink(n);
    		n.setPrevLink(tail);
    	}
    	tail = n;
    	size++;
    }
    /*
	* Remove(); removes the right most node (head) by using a temp node,
	* and then sets the temp node to
    */
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
    /*
	* Remove(int x): removes the value of x from the list if it is in the list.
	* Checks if size=0, size=1, x=head, x=tail, otherwise it sets the links of
	* prev and next node to connect to each other, essentially taking x from the
	* graph.
    */
    public void remove(int n) {
     	if (size == 0)
			System.out.println("List is almost certainly empty");
      	else if (size == 1) {
			head = tail = null;
			size = 0;
    	}
      	else{
			DNode temp = head;
			while(temp != null) {
				if(temp.getData() == n)
					break;
				temp = temp.getNextLink();
			}
			if(temp == null) {
				System.out.println("Not in the list");
			}
			else if(temp.getData() == head.getData()) {
				head = head.getNextLink();
				head.setPrevLink(null);
				size--;
			}
			else if(temp.getData() == tail.getData()) {
				tail = tail.getPrevLink();
				tail.setNextLink(null);
				size--;
			}
			else {
				DNode prev, next;
				prev = temp.getPrevLink();
				next = temp.getNextLink();
				next.setPrevLink(temp.getPrevLink());
				prev.setNextLink(temp.getNextLink());
				size--;
			}
    	}
    }
    /*
	* Print function: prints all the values in the DLinkedList from left to right
	* starting at the head (most left) and printing each consecutive node from
	* left to right until it reaches the value of tail (the right most value)
    */
    public void print() {
		if(size == 0)
			System.out.println("List is empty");
		else {
			DNode temp = head;
			while(temp != null) {
				System.out.print(temp.getData() + " ");
				temp=temp.getNextLink();
			}
		System.out.println();
		}
	}

	public void revrPrint()	{
		if(size == 0)
			System.out.println("List is empty.");
		else	{
			DNode temp = tail;
			while(temp != null)	{
				System.out.print(temp.getData() + " ");
				temp = temp.getPrevLink();
			}
		System.out.println();
		}
	}
}