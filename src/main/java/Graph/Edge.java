package Graph;

public class Edge<T, V extends Comparable<V>> implements Comparable<Edge<T, V>> {
    private Node<T> start, end;
    private V weight;

    Edge(Node<T> start, Node<T> end, V weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    Node<T> getStart() {
        return start;
    }

    Node<T> getEnd() {
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
    public int compareTo(Edge<T, V> o) {
        if (o.getWeight() instanceof Number) {
            return this.weight.compareTo(o.weight);
        }
        return -1;
    }

    @Override
    public String toString() {
        return String.format("Start Node: " + start + "\nEnd Node: " + end + "\nWeight: %d", weight);
    }
}