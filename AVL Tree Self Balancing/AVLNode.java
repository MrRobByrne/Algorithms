class AVLNode {
  private int data;
  private AVLNode left;
  private AVLNode right;
  private AVLNode parent;
  
  public AVLNode() {
    data = 0;
    left = right = null;
  }

  public void setData(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setLeft(AVLNode left) {
    this.left = left;
  }

  public AVLNode getLeft() {
    return left;
  }

  public void setRight(AVLNode right) {
    this.right = right;
  }

  public AVLNode getRight() {
    return right;
  }
  public void setParent(AVLNode parent){
    this.parent=parent;
  }
  public AVLNode getParent() {
    return parent;
  }
}