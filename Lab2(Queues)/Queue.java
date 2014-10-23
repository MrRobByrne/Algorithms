class Queue {
  private Node head;
  private Node tail;
  private int size;

  Queue() {
    head = tail = null;
    size = 0;
  }

  private boolean isEmpty() {
    if (size == 0)
      return true;
    else
      return false;
  }

  public void enqueue(int x) {
    Node n = new Node();
    n.setData(x);
    if(isEmpty())
      head = n;
    else
      tail.setNextNode(n);
    tail = n;
    size++;
  }

  public void dequeue() {
    if(isEmpty())
      System.out.println("can't do that, the queue is deserted, empty I say!");
    else if(head == tail) {
      head = tail = null;
      size = 0;
    }
    else {
      head = head.getNextNode();
    }
  }

  public void print() {
    if(isEmpty())
      System.out.println("Can't print, queue is empty, she's toast");
    else {
      Node temp = head;
      while(temp != null) {
	System.out.print(temp.getData() + " ");
	temp = temp.getNextNode();
      }
      System.out.println();
    }
  }
}