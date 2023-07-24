package Graph;

import java.util.Objects;

public class Edge<T, V extends Comparable<V>> implements Comparable<Edge<T, V>> {

  private final Node<T> start, end;
  private final V weight;

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
    if (this == o) {
      return true;
    }
    if (!(o instanceof Edge<?, ?> that)) {
      return false;
    }

    return Objects.equals(this.start, that.start)
        && Objects.equals(this.end, that.end);
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