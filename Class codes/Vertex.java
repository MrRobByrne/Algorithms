public class Vertex {
  private int label;
  private Vertex nextVertex;
  private Edge nextEdge;

  public Vertex() {
    label = 0;
    nextVertex = null;
    nextEdge = null;
  }

  public void setLabel(int n) {
    label = n;
  }

  public int getLabel() {
    return label;
  }

  public void setNextVertex(Vertex v) {
    nextVertex = v;
  }

  public Vertex getNextVertex() {
    return nextVertex;
  }

  public void setNextEdge(Edge e) {
    nextEdge = e;
  }

  public Edge getNextEdge() {
    return nextEdge;
  }
}
