class TestQueueAlt {
  public static void main(String []args) {
    QueueAlt x = new QueueAlt();
      x.print();
      x.enqueue(1);
      x.enqueue(3);
      x.print();
      x.dequeue();
      x.print();
      x.dequeue();
      x.enqueue(4);
      x.enqueue(43);
      x.enqueue(15);
      x.enqueue(36);
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