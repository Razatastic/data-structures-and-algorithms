package Tree;

import java.util.Objects;

public class Node<T> implements Comparable<T> {

  protected Node<T> left, right;
  private T data;

  Node(T data) {
    this.data = data;
    this.left = this.right = null;
  }

  T getData() {
    return this.data;
  }

  void setData(T data) {
    this.data = data;
  }

  @Override
  public int compareTo(T t) {
    return 0;
//        return getData().compareTo(t);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Node<?> node = (Node<?>) o;

    if (!Objects.equals(left, node.left)) {
      return false;
    }
    if (!Objects.equals(right, node.right)) {
      return false;
    }
    return Objects.equals(data, node.data);
  }

  @Override
  public int hashCode() {
    return data != null ? data.hashCode() : 0;
  }
}
