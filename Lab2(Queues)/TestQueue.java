/**
 * main class to test Queue.java and Node.java
 */
class TestQueue {
  public static void main(String []args) {
    Queue x = new Queue();
      x.print();
      x.enqueue(1);
      x.enqueue(3);
      x.print();
      x.dequeue();
      x.print();
      x.dequeue();
      x.enqueue(4);
      x.enqueue(8);
      x.enqueue(15);
      x.enqueue(16);
      x.enqueue(23);
      x.enqueue(42);
      x.print();
      System.out.println("a small tribute to lost");
      x.dequeue();
      x.dequeue();
      x.dequeue();
      x.dequeue();
      x.print();
  }
}