package Graph;

public class Edge {
    private int weight;
    private Node start, end;

    Edge(Node start, Node end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    Node getStart() {
        return start;
    }

    Node getEnd() {
        return end;
    }

    @Override
    public int hashCode() {
        return 31 * start.getData().hashCode() + end.getData().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Edge)) return false;
        Edge castedInput = (Edge) o;
        return castedInput.getStart().equals(this.getStart()) && (castedInput.getEnd().equals(this.getEnd()));
    }
}