class Queue {
  private DNode head;
  private DNode tail;
  private int size;

  Queue() {
    head = tail = null;
    size = 0;
  }

public void enqueue(int x) {
    DNode data = new DNode();
    data.setData(x);
    if(size == 0)
	head = tail = data;
    else {
	DNode temp = head;
    while(temp != null) {
	if(temp.getData() > data.getData())
		break;
	    temp = temp.getNextLink();
    }
    if (temp == null) {
	tail.setNextLink(data);
	data.setPrevLink(tail);
	tail = data;
    }
    else if(temp == head) {
	data.setNextLink(temp);
	temp.setPrevLink(data);
	head = data;
    }
    else {
	DNode prev = temp.getPrevLink();
	prev.setNextLink(data);
	temp.setPrevLink(data);
	data.setNextLink(temp);
	data.setPrevLink(prev);
    }
   }
   size++;
 }


  public void dequeue() {
    if(size == 0)
      System.out.println("can't do that, the queue empty!");
    else if(size == 1) {
      head = tail = null;
      size = 0;
    }
    else {
      head = head.getNextLink();
      head.setPrevLink(null);
      size--;
    }
  }

  public void print() {
    DNode temp = head;
    if(size == 0)
	System.out.println("Empty queue.");
    else {
	while(temp != null) {
	System.out.print(temp.getData() + " ");
	temp = temp.getNextLink();
    }
   System.out.println();
   }
  }
}