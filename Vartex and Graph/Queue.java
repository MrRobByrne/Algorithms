class Queue{
	private Node head, tail;
	private int size;
	public Queue(){
		head=tail=null;
		size=0;
	}
	public void enqueue(int data){
		Node n=new Node();
		n.setData(data);
		if(size==0)
			head=n;
		else
			tail.setLink(n);
		tail=n;
		size++;
	}
	public void dequeue(){
		if(size==0)
			System.out.println("Queue is empty");
		else if(size==1){
			head=tail=null;
			size=0;
		}
		else{
			head=head.getLink();
			size--;
		}
	}
	public int getHead(){
		return head.getData();
	}
	public boolean isEmpty(){
		if(size==0)
			return true;
		else
			return false;
	}
	public void print(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.getData()+" ");
			temp=temp.getLink();
		}
		System.out.println();
	}
}