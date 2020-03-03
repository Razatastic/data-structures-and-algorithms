package Tree;

public class Tree<T> {
    Node<T> root;

    Tree(T data) {
        root = new Node<>(data);
    }

    Tree() {
        root = null;
    }

    Tree(T... data) {

    }

    void addNode(T data) {
        if (root == null) root = new Node<>(data);
        else {

        }
    }

    void removeNode(T data) {
        Node<T> nodeBeingRemoved = new Node<>(data);

    }
}
