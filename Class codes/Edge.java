class Edge {
	private int label;
	private Edge next;
	
	public Edge() {
		label = 0;
		next = null;
	}
	public int getLabel() {
		return label;
	}
	public void setLabel(int lable) {
		this.label = label;
	}
	public void setNextEdge(Edge next) {
		this.next = next;
	}
	public Edge getNextEdge() {
		return next;
	}
}