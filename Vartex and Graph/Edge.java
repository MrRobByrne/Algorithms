class Edge{
	private int label, weight;
	private Edge next;
	public Edge(){
		label=0;
		weight=0;
		next=null;
	}
	public void setLabel(int label){
		this.label=label;
	}
	public int getLabel(){
		return label;
	}
	public void setNextEdge(Edge next){
		this.next=next;
	}
	public Edge getNextEdge(){
		return next;
	}
	public void setWeight(int weight){
		this.weight=weight;
	}
	public int getWeight(){
		return weight;
	}
}