package LinkedList;

class Node<T> {
    T data;
    Node<T> next, prev;

    /**
     * Constructor
     *
     * @param data initial value of node
     */
    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Node) {
            @SuppressWarnings("unchecked")
            Node<T> castedObj = (Node<T>) o;
            return castedObj.data == data && castedObj.next == next && castedObj.prev == prev;
        }
        return false;
    }
}
