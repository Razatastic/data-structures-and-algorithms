package Tree;

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
    public int hashCode() {
        return 31 * data.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Node && ((Node) o).data.equals(this.data);
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
