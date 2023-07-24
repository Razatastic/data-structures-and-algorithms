package Graph;

class Node<T> {

  State currentState;
  private T data;

  Node(T input) {
    this.data = input;
    currentState = State.UNVISITED;
  }

  T getData() {
    return data;
  }

  @Override
  public int hashCode() {
    return 31 * data.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Node && ((Node) o).data.equals(this.data);
  }

  @Override
  public String toString() {
    return data.toString();
  }
}