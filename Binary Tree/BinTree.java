/**
 ____  __  __ _   __   ____  _  _    ____  ____  ____  ____ 
(  _ \(  )(  ( \ / _\ (  _ \( \/ )  (_  _)(  _ \(  __)(  __)
 ) _ ( )( /    //    \ )   / )  /     )(   )   / ) _)  ) _) 
(____/(__)\_)__)\_/\_/(__\_)(__/     (__) (__\_)(____)(____)

This file is a sorted Binary tree written with the ability to insert values into the proper place,
as well as search for a particular value in the tree. It also has the ability to print the values
of the tree in different orders.
*/

class BinTree {
	private TNode root;
	private int height, left, right;
	
	public BinTree() {
		root = null;
	}
    /**
    insert: Searched through the tree and inserts the value in the 
    appropriete value in the tree at the right spot.
     Note: lower values to the lef and higher values to the right.
     */
	public void insert(int x) {
		TNode n = new TNode();
		n.setData(x);
		if(root == null) {  //inserting first value
			root = n;
		}
		else {
			TNode temp = root;
			while(temp != null) {   //continue search until null value is found for insert into
				if(x<temp.getData()){	//if x<temp
					if(temp.getLeft() != null)
						temp = temp.getLeft();
					else {
						temp.setLeft(n);
						break;
					}
				}
				else if(x>temp.getData()) {     //if x>temp
					if(temp.getRight() != null)
						temp = temp.getRight();
					else {
						temp.setRight(n);
						break;
					}
				}
				else {
					System.out.println("Error, number already in tree");
					break;
				}
			}
		}
	}
	public boolean search(int y) {
		TNode temp = root;
		while(temp != null) {
			if(y == temp.getData())
				break;
			else if(y>temp.getData())
				temp = temp.getRight();
			else
				temp.getLeft();
		}
		if(temp != null)
			return true;
		else
			return false;
	}
	public int height() {
		height = left = right = -1;
		getHeight(root);
		return height -1;
	}
	public int getHeight(TNode t) {
		if(t == null)
			return 0;
		int heightLeft = getHeight(t.getLeft());
		int heightRight = getHeight(t.getRight());

		if(heightLeft > heightRight)
			return heightLeft -1;
		else
			return heightRight -1;
	}
	public int height(Bintree b) {
		if(b == null)
			return -1;
		else
			return 1 + max(height(b.getLeft()), height(b.getRight());
	}
	public int max(int x, int y) {
		if(x>y)
			return x;
		else
			return y;
	}

	public void inorder(TNode t){
		if(t!=null){
			inorder(t.getLeft());
			System.out.print(t.getData() +" ");
			inorder(t.getRight());
		}
	}
	public void preorder(TNode t){
		if(t!=null){
			System.out.print(t.getData() +" ");
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}
	public void postorder(TNode t){
		if(t!=null){
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() +" ");
		}
	}
	public void showInorder(){
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println();
	}
	public void showPreorder(){
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println();
	}
	public void showPostorder(){
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println();
	}
}