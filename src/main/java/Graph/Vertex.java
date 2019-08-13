package Graph;

class Vertex<T> {
    private T data;
    private int degree;
    // Number of adjacent vertices = degree

    Vertex(T input) {
        this.data = input;
        this.degree = 0;
    }

    public T getData() {
        return data;
    }

    @Override
    public int hashCode() {
        return 31 * data.toString().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Vertex && ((Vertex) o).data.equals(this.data);
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public void incrementDegree() {
        degree++;
    }

    public void decrementDegree() {
        degree--;
    }
}