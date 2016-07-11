public class Graph {
	private int vertexLabel,shortest, cw;
	private Vertex head;
	private Vertex tail;
	
	public Graph() {
		vertexLabel = 0;
		head = tail = null;
	}
	public int getSize() {
		return vertexLabel;
	}
	public void insertVertex() {
		Vertex v = new Vertex();
		v.setLabel(vertexLabel);
		if(vertexLabel == 0)
			head = v;
		else
			tail.setNextVertex(v);
		tail = v;
		vertexLabel++;
	}
	public Vertex find(int x) {
		Vertex base = head;
		while(base.getLabel() != x) {
			base = base.getNextVertex();
			if(base == null)
				break;
		}
		return base;
	}
	public void insertEdge(int u, int v, int w) {
		Vertex base_u = find(u);
		Vertex base_v = find(v);
		if(base_u == null || base_v == null)
		System.out.println("Cannot insert edge between vertices " + u + " and " + v);
		else {
			Edge e = new Edge();
			e.setLabel(v);
			e.setWeight(w);
			if(base_u.getNextEdge() == null)
				base_u.setNextEdge(e);
			else {
				Edge temp = base_u.getNextEdge();
				while(temp.getNextEdge()!= null)
					temp = temp.getNextEdge();
				temp.setNextEdge(e);
			}
		}
	}
	public void print() {
		int vertex;
		int edge;
		int weight;
		Vertex baseVert = head;
		while(baseVert != null) {
			vertex = baseVert.getLabel();
			System.out.print("Vertex: " + vertex + " has Edges:");
			Edge baseEdge = baseVert.getNextEdge();
			while(baseEdge != null) {
				edge = baseEdge.getLabel();
				weight = baseEdge.getWeight();
				System.out.print(" (" + vertex + "," + edge + ") and weight "+weight+",");
				baseEdge = baseEdge.getNextEdge();
			}
			System.out.println();
			baseVert = baseVert.getNextVertex();
		}
	}
	public void traverse(int i, boolean[] visited){
		if(!visited[i]){
			Vertex v=find(i);
			visited[i]=true;
			Edge adjacent=v.getNextEdge();
			while(adjacent!=null){
				int index=adjacent.getLabel();
				System.out.print("("+i+","+index+")");
				adjacent=adjacent.getNextEdge();
				traverse(index,visited);
			}
		}
	}
	public void DFS(){
		System.out.print("DFS: ");
		boolean[] visited=new boolean[vertexLabel];
		for(int i=0; i<visited.length; i++)
			visited[i]=false;
		for(int i=0; i<visited.length; i++){
			if(!visited[i])
				traverse(i,visited);
		}
		System.out.println();
	}
	public void BFS(){
		System.out.print("BFS: ");
		boolean[] visited=new boolean[vertexLabel];
		for(int i=0; i<visited.length; i++)
			visited[i]=false;
		Queue q=new Queue();
		for(int i=0;i<visited.length; i++){
			if(!visited[i]){
				q.enqueue(i);
				do{
					int entry=q.getHead();
					if(visited[entry])
						q.dequeue();
					else{
						visited[entry]=true;
						q.dequeue();
						Vertex v=find(entry);
						Edge adjacent=v.getNextEdge();
						while(adjacent!=null){
							int index=adjacent.getLabel();
							int weight = adjacent.getWeight();
							System.out.print("("+entry+","+index+")");
							if(!visited[index])
								q.enqueue(index);
							adjacent=adjacent.getNextEdge();
						}
					}
				}while(!q.isEmpty());
			}
		}
		System.out.println();
	}
	public void path(int i, boolean[] visited){
		if(!visited[i]){
			Vertex v=find(i);
			visited[i]=true;
			Edge adjacent=v.getNextEdge();
			while(adjacent!=null){
				int index=adjacent.getLabel();
				int weight=adjacent.getWeight();
				System.out.print("("+i+","+index+") Weight is "+weight+",");
				adjacent=adjacent.getNextEdge();
				path(index,visited);
				shortest=shortest+weight;
			}
		}
	}
	public void shortestPath(int source, int dest){
		Vertex s=find(source);
		Vertex d=find(dest);
		System.out.print("Paths: ");
		boolean[] visited=new boolean[vertexLabel];
		for(int i=0; i<visited.length; i++)
			visited[i]=false;
		for(int i=0; i<visited.length; i++){
			if(!visited[i])
				path(i,visited);
		}
		System.out.println();
		System.out.println("Weight of Shortest Path: "+shortest);
	}
}