package Graph;

class Node {
    private String data;
    private int degree; // Number of adjacent vertices

    Node(String input) {
        this.data = input;
        this.degree = 0;
    }

    public String getData() {
        return data;
    }

    @Override
    public int hashCode() {
        return 31 * data.toString().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Node && ((Node) o).data.equals(this.data);
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