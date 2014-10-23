class Vertex{
	private int label;
	private Edge nextEdge;
	private Vertex nextVertex;
	public Vertex(){
		label=0;
		nextEdge=null;
		nextVertex=null;
	}
	public void setLabel(int label){
		this.label=label;
	}
	public int getLabel(){
		return label;
	}
	public void setNextEdge(Edge nextEdge){
		this.nextEdge=nextEdge;
	}
	public Edge getNextEdge(){
		return nextEdge;
	}
	public void setNextVertex(Vertex nextVertex){
		this.nextVertex=nextVertex;
	}
	public Vertex getNextVertex(){
		return nextVertex;
	}
}