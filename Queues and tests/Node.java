/**
 * Node Class for creating and manipulating notes
 * - to be used in Queue.java
 */
class Node {
  private int data;
  private Node next;

  /**
   * Node constructor
   */
  Node() {
    data = 0;
    next = null;
  }

  /**
   * setData() function sets the currentnodes data to n
   * @param {int} n, the int to be set to the data portion of the current node 
   */
  public void setData(int n) {
    data = n;
  }

/**
 * getData() function to the the data of a node, used when adding a node
 * @return {int} data, the data portion of a node
 */
  public int getData() {
    return data;
  }

  /**
   * setNextNode() sets the next Node to node n
   * @param {Node} n, the node being added next Node in the queue
   */
  public void setNextNode(Node n) {
    next = n;
  }

  public Node getNextNode() {
    return next;
  }
}