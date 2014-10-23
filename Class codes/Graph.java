class Graph {
	private int vertexLabel;
	private Vertex head;
	private Vertex tail;

	public Graph() {
		vertexLabel = 0;
		head = tail = null;
	}
	
	public void insertVertex() {
		Vertex v = new Vertex();
		v.setLabel(vertexLabel);
		if(vertexLabel ==0)
			head = v;
		else
			tail.setNextVertex(v);
		tail = v;
		vertexLabel++;
	}
	
	public void insertEdge(int u, int v) {
		Vertex base_u = find(u);
		Vertex base_v = find(v);
		if(base_u == null || base_v == null)
			System.out.println("cannot inset edge between vertices" + u + "and" + v);
		else {
			Edge e = new Edge();
			e.setLabel(v);
			if(base_u.setNextEdge() == null)
				base_u.setNextEdge(e);
			else {
				Edge temp = base_u.getNextEdge();
				while(temp.getNextEdge() != null)
					temp = temp.getNextEdge();
				temp.setNextEdge(e);
			}
		}
	}
	
	public Vertex find(int x) {
		Vertex base = head;
		while(base.getLabel() != x) {
			base = base.getNextVertex();
			if(base == null) // takes care of null pointer exception.
				break;
		}
		return base;
	}
	
	public void DFS() {
		System.out.print("DFS:");
		boolean[] visited = new boolean[vertexLabel];
		for(int i = 0; i<visited.length; i++)
			visited[i] = false;
		for(int i = 0; i<visited.length; i++)
			if(!visited[i])
				traverse (i, visited);
		System.out.println();
	}
	
	public void traverse(int i, boolean[] visited) {
		if(!visited[i]) {
			Vertex v = find(i);
			visited[i] = true; //to prevent infinite recursion.
			Edge adjacent = v.getNextEdge();
			while(adjacent != null) {
				int index = adjacent.getLabel();
				System.out.print("(" + i + "," + index + ")");
				adjacent = adjacent.setNextEdge();
				traverse(index, visited);
			}
		}
	}

	public void BFS() {
		System.out.print("BFS:");
		boolean[] visited = new boolean[vertexLabel];
		for(int i = 0; i<visited.length; i++)
			visited[i] = false;
		Queue q = new Queue();
		for(int i = 0; i<visited.length; i++) {
			if(!visited[i]) {
				q.enqueue(i);
				do {
					int entry = q.getHead();
					if(visited[entry])
						q.dequeue();
					else {
						visited[entry] = true;
						q.dequeue();
						Vertex V = find(entry);
						Edge adjacent = v.getNextEdge();
						while(adjacent != null) {
							int index = adjacent.getLabel();
							System.out.print("(" + entry + index + ")");
							if (visited[index] == false)
								q.enqueue();
							adjacent = adjacent.getNextEdge();
							}
					}
				}
				while(!q.isEmpty());
			}
		}
	
	}
	public void print() {
		int vertex, edge;
		vertex baseVertex = head;
		while(baseVertex != null) {
			vertex = baseVertex.getLabel();
			System.out.print("Vertex: " + vertex + "Edge: ");
			Edge baseEdge = baseVertex.getNextEdge();
			while(baseEdge != null) {
				edge = baseEdge.getLabel();
				System.out.print("(" + vertex + "," + edge + ")");
				baseEdge = baseEdge.getNextEdge();
			}
		System.out.println();
		baseVertex = baseVertex.getNextVertex();
		}
	}
}