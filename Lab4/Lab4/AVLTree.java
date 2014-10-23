class AVLTree{
	private AVLNode root;
	public AVLTree() {
		root=null;
		}
	
	public void insert(int data) {
		AVLNode a=new AVLNode();
		AVLNode b=new AVLNode();
		AVLNode c=new AVLNode();
		AVLNode d=new AVLNode();
		AVLNode e=new AVLNode();
		AVLNode T0=new AVLNode();
		AVLNode T1=new AVLNode();
		AVLNode T2=new AVLNode();
		AVLNode T3=new AVLNode();
		b.setData(data);
		if (root==null)
			root=b;
		else {
			AVLNode temp=root;
			while(temp!=null) {
				if (data<temp.getData()) {
					if(temp.getLeft()!=null)
						temp=temp.getLeft();
					else {
						temp.setLeft(b);
						b.setParent(temp);
						break;
						}
					}
				else if (data>temp.getData()) {
					if (temp.getRight()!=null)
						temp=temp.getRight();
					else {
						temp.setRight(b);
						b.setParent(temp);
						break;
						}
					}
				else {
					System.out.println("Error.Duplicate");
					break;
					}
				}
			}
		e=b;
		while(e!=null) {
			if ((int)Math.abs(height(e.getLeft())-height(e.getRight()))>1)
				break;
			e=e.getParent();
			}
		if(e!=null&&height(e.getLeft())-height(e.getRight())<-1) {
			a=e.getParent();
			d=e.getRight();
			if(b.getData()>d.getData()) {
				c=d.getRight();
				T0 = e.getLeft();
				T1 = d.getLeft();
				T2 = c.getLeft();
				T3 = c.getRight();
				d.setLeft(e);
				d.setRight(c);
				d.setParent(e.getParent());
				e.setLeft(T0);
				e.setRight(T1);
				e.setParent(d);
				c.setLeft(T2);
				c.setRight(T3);
				c.setParent(d);
				a.setRight(d);
				if(e == root)
					root = d;
				}
			else {
				c=d.getLeft();
				T0 = e.getLeft();
				T1 = c.getLeft();
				T2 = c.getRight();
				T3 = d.getRight();
				c.setLeft(e);
				c.setRight(d);
				c.setParent(e.getParent());
				e.setLeft(T0);
				e.setRight(T1);
				e.setParent(c);
				d.setLeft(T2);
				d.setRight(T3);
				d.setParent(c);
				a.setRight(c);
				if(e == root)
					root = c;
				}
			}
		else if(e!=null&&height(e.getLeft())-height(e.getRight())>1) {
			a=e.getParent();
			d=e.getLeft();
			if(b.getData()<d.getData()) {
				c=d.getLeft();
				T0 = c.getLeft();
				T1 = c.getRight();
				T2 = d.getRight();
				T3 = e.getRight();
				d.setLeft(c);
				d.setRight(e);
				d.setParent(e.getParent());
				c.setLeft(T0);
				c.setRight(T1);
				c.setParent(d);
				e.setLeft(T2);
				e.setRight(T3);
				e.setParent(d);
				a.setLeft(d);
				if(e == root)
					root = d;
				}
			else {
				c=d.getRight();
				T0 = d.getLeft();
				T1 = c.getLeft();
				T2 = c.getRight();
				T3 = e.getRight();
				c.setLeft(d);
				c.setRight(e);
				c.setParent(e.getParent());
				d.setLeft(T0);
				d.setRight(T1);
				d.setParent(c);
				e.setLeft(T2);
				e.setRight(T3);
				e.setParent(c);
				a.setLeft(c);
				if(e == root)
					root = c;
				}
			}
		}
	
	public void inorder(AVLNode t) {
		if (t!=null) {
			inorder(t.getLeft());
			System.out.print(t.getData());
			inorder(t.getRight());
			}
		}
	
	public void preorder(AVLNode t) {
		if(t!=null) {
			System.out.print(t.getData());
			preorder(t.getLeft());
			preorder(t.getRight());
			}
		}
	
	public void postorder(AVLNode t) {
		if(t!=null) {
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData());
			}
		}
	
	public void Inorder() {
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println(" ");
		}
	
	public void Preorder() {
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println(" ");
		}
	
	public void Postorder() {
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println(" ");
		}
	
	public boolean search(int n) {
		boolean flag=false;
		AVLNode temp=root;
		while (temp!=null&&flag==false) {
			if (temp.getData()==n)
				flag=true;
			else if(temp.getData()>n)
				temp=temp.getLeft();
			else
				temp=temp.getRight();
			}
		return flag;
		}
	
	public int height(AVLNode n) {
		return getDepth(n);
		}
	
	public void depth() {
		System.out.println(getDepth(root));
		}
	
	public int getDepth(AVLNode n) {
		if (n==null)
		return -1;
		int leftDepth = getDepth(n.getLeft());
		int rightDepth = getDepth(n.getRight());
		if(leftDepth>=rightDepth)
			return leftDepth +1;
		else
			return rightDepth +1;
		}
	
	public void printRoot() {
		System.out.println(root.getData()+" ");
		}
	
	public void remove(int data) {
		AVLNode temp=root;
		while (temp!=null) {
			if (temp.getData()==data)
				break;
			else if(temp.getData()>data)
				temp=temp.getLeft();
			else
				temp=temp.getRight();
			}
		if (temp==null)
			System.out.println(data+" is not in the tree!");
		else if(temp.getLeft()==null&&temp.getRight()==null) {
			if (temp==root)
				root=null;
			else if(temp.getData()>temp.getParent().getData()) {
				temp=temp.getParent();
				temp.setRight(null);
				}
			else {
				temp=temp.getParent();
				temp.setLeft(null);
				}
			}
		}

	}