package Graph;

public class Edge<V extends Comparable<V>> implements Comparable<Edge<V>> {
    private Node start, end;
    private V weight;

    Edge(Node start, Node end, V weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    Node getStart() {
        return start;
    }

    Node getEnd() {
        return end;
    }

    private V getWeight() {
        return weight;
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

    @Override
    public int compareTo(Edge<V> o) {
        if (o.getWeight() instanceof Number) {
            return this.weight.compareTo(o.weight);
        }
        return -1;
    }
}