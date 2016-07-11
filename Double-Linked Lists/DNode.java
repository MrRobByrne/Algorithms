class DNode {
  protected int data;
  protected DNode next, prev;

  public DNode() {
    data = 0;
    prev = null;
    next = null;
  }
  public int getData() {
    return data;
  }
  public void setData(int data) {
    this.data = data;
  }
  public DNode getNextLink() {
    return next;
  }
  public void setNextLink(DNode next) {
    this.next=next;
  }
  public void setPrevLink(DNode prev) {
    this.prev = prev;
  }
  public DNode getPrevLink() {
    return prev;
  }
}