class Node {
  private int data;
  private Node next;

  Node() {
    data = 0;
    next = null;
  }

  public void setData(int n) {
    data = n;
  }

  public int getData() {
    return data;
  }

  public void setNextNode(Node n) {
    next = n;
  }

  public Node getNextNode() {
    return next;
  }
}