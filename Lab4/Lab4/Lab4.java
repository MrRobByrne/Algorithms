class Lab4 {
	public static void main(String[]args) {
		AVLTree x=new AVLTree();
		x.insert(7);
		x.insert(4);
		x.insert(8);
		x.insert(3);
		x.insert(5);
		x.insert(8);
		x.insert(9);
		x.insert(2);
		x.Inorder();
		x.insert(1);
		x.Inorder();
		x.depth();
		x.remove(1);
		AVLTree y=new AVLTree();
		y.insert(9);
		y.insert(5);
		y.insert(9);
		y.insert(1);
		y.insert(5);
		y.insert(7);
		y.insert(9);
		y.insert(1);
		y.Inorder();
		y.insert(2);
		y.Inorder();
		y.depth();
		y.remove(2);
		y.Inorder();
		}
	}