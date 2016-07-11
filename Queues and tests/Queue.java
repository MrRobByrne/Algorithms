/**
 * Queue Class creates a queue
 */
class Queue {
  
  private Node head;
  private Node tail;
  private int size;

  /**
   * Queue() is the constructor class
   */
  Queue() {
    head = tail = null;
    size = 0;
  }

  /**
   * isEmpty() function returns true if the the queue is empty
   * @return {boolean} true is queue is empty
   */
  private boolean isEmpty() {
    if (size == 0)
      return true;
    else
      return false;
  }
/**
 * enqueue() function addes a new Node to the queue
 * @param x [the new node to be added to the queue ]
 */
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

  /**
   * [dequeue() removes the Node at the top of the queue]
   */ 
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

  /**
   * print() prints out the queue
   */
  public void print() {
    if(isEmpty())
      System.out.println("Can't print, queue is empty.\nWhy not try adding something to the queue first.\n");
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