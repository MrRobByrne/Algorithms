class HashTable {
	private int bucketSize;
	private DLinkedList bucket[];
	public HashTable(int bucketSize) {
		this.bucketSize = bucketSize;
		bucket = new DLinkedList[bucketSize];
		for(int i = 0; i<bucketSize; i++)
			bucket[i] = new DLinkedList();
	}
	public void insert(int i) {
		int hashCode = i % bucketSize;
		bucket[hashCode].insert(i);
	}
	public boolean get(int i) {
		int hashCode = i % bucketSize;
		System.out.println("Searching bucket" + hashCode + " ");
		return bucket[hashCode].search(i);
	}
	public void remove(int i) {
		int hashCode = i % bucketSize;
		bucket[hashCode].remove(i);
	}
	public void print() {
		for(int i = 0; i<bucketSize; i++) {
			System.out.print("Bucket " + i + " ");
			bucket[i].print();
		}
	}
} 
