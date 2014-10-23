class TNode{
	private int data;
	private TNode left, right, parent;
	public TNode(){
		data=0;
		left=right=null;
	}
	public void setData(int data){
		this.data=data;
	}
	public int getData(){
		return data;
	}
	public void setLeft(TNode left){
		this.left=left;
	}
	public TNode getLeft(){
		return left;
	}
	public void setRight(TNode right){
		this.right=right;
	}
	public TNode getRight(){
		return right;
	}
// 	public void setParent(TNode parent){
// 		this.parent=parent;
// 	}
// 	public TNode getParent(){
// 		return parent;
// 	}
}