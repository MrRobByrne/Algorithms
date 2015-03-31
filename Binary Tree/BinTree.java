/**
 ____  __  __ _   __   ____  _  _    ____  ____  ____  ____ 
(  _ \(  )(  ( \ / _\ (  _ \( \/ )  (_  _)(  _ \(  __)(  __)
 ) _ ( )( /    //    \ )   / )  /     )(   )   / ) _)  ) _) 
(____/(__)\_)__)\_/\_/(__\_)(__/     (__) (__\_)(____)(____)

This file is a sorted Binary tree written with the ability to insert values into the proper place,
as well as search for a particular value in the tree. It also has the ability to print the values
of the tree in different orders.
Note: TNode.java is required to be in the same folder as BinTree.java because it is used within it.
*/

class BinTree 
{
	private TNode root;
	private int height, left, right;
	
	public BinTree() 
	{
		root = null;
	}
    /*
    *  insert: Searched through the tree and inserts the value in the 
    *  appropriete value in the tree at the right spot.
    *  Note: lower values to the lef and higher values to the right.
    */
	public void insert(int x) 
	{
		TNode n = new TNode();
		n.setData(x);
		
		// empty binary tree condition
		if(root == null)
		{  
			root = n;
		}
		
		else 
		{
			TNode temp = root;

			// continue until the correct position in the tree is found
			// or a null value (tree edges) is found.
			while(temp != null)	
			{
				// insert value less than temp
				if(x<temp.getData())
				{
					// compare next left value to x
					if(temp.getLeft() != null)
					{
						temp = temp.getLeft();
					} // if
					
					// set value to left most poition (smallest value) in tree
					else 
					{
						temp.setLeft(n);
						break;
					} // else
				} //if

				// insert value greater than temp
				else if(x>temp.getData())
				{
					if(temp.getRight() != null)		//right node is not empty
					{	
						temp = temp.getRight();		//get next right node
					} // if
					else 
					{
						temp.setRight(n);		//else set right node to n
						break;		//break out of while loop
					} // else
				} // else if
				else {
					System.out.println("Error, number already in tree");
					break;
				} // else
			} // while
		} // else
	}
	
	// search() method seaarches for a certain value in the binary tree
	// @Param int y, the input to be searched for
	public boolean search(int y) 
	{
		TNode temp = root;
		
		// search mechanics
		while(temp != null) 
		{
			if(y == temp.getData())
			{
				break;
			} // if
			else if(y>temp.getData())
			{
				temp = temp.getRight();
			} // else if
			else
			{
				temp.getLeft();
			} // else
		} // while
		
		// return based on wether a null value was output from the above while loop
		if(temp != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int height() 
	{
		height = left = right = -1;
		getHeight(root);
		return height - 1;
	}
	
	public int getHeight(TNode t) 
	{
		if(t == null)
			return 0;
		int heightLeft = getHeight(t.getLeft());
		int heightRight = getHeight(t.getRight());

		if(heightLeft > heightRight)
		{
			return heightLeft - 1;
		}
		else
		{
			return heightRight - 1;
		}
	}
	
	public int height(BinTree b) 
	{
		if(b == null)
		{
			return -1;
		}
		else
		{
			return 1 + max(heightLeft, heightRight);
		}
	}
	
	public int max(int x, int y) 
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}

	// print array in order
	public void inorder(TNode t)
	{
		if(t!=null)
		{
			inorder(t.getLeft());
			System.out.print(t.getData() +" ");
			inorder(t.getRight());
		}
	}
	
	public void preorder(TNode t)
	{
		if(t!=null)
		{
			System.out.print(t.getData() +" ");
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}
	
	public void postorder(TNode t)
	{
		if(t!=null)
		{
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() +" ");
		}
	}
	
	public void showInorder()
	{
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println();
	}
	
	public void showPreorder()
	{
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println();
	}
	
	public void showPostorder()
	{
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println();
	}
}