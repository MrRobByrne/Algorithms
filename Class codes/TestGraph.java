class TestGraph {
	public static void main(String[] args) {
		Graph g = new Graph();
		for(int i = 0; i<3, i++)
			g.insertVertex();
		g.insertEdge(0,1);
		g.insertEdge(1,0);
		g.insertEdge(0,2);
		g.insertEdge(1,2);
		g.insertEdge(3,4);
		g.print();
		}
	}