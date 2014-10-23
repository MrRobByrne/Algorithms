public boolean search(int data) {
	boolean found = false;
	DNode temp = head;
	while(temp!=null && !found) {
		if(data == temp.getData())
			found = true;
		temp = temp.getNextLink();
	}
	return found;
}