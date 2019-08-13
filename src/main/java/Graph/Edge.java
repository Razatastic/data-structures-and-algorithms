package Graph;

public class Edge<V extends Comparable<V>> {
    private V weight;
    private Vertex start, end;

    Edge(Vertex start, Vertex end, V weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public V getWeight() {
        return weight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }
}