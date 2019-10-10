package LinkedList;

import Interfaces.List;

/**
 * Singly-linked list implementation
 *
 * @param <T>
 */
class LinkedList<T> implements List<T> {
    Node<T> head;
    private int size;

    LinkedList(T input) {
        head = new Node<>(input);
        size = 1;
    }

    LinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public boolean add(T element) {
        // Edge cases
        if (element == null) return false;
        if (head == null) head = new Node<>(element);

        // Traverse list
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Add node & return
        curr.next = new Node<>(element);
        return true;
    }

    @Override
    public boolean remove(T element) {
        Node<T> elm = new Node<>(element);
        if (head.equals(elm)) head = head.next;
        return false;
    }

    @Override
    public T get(int index) throws OutOfRangeException {
        if (index >= size || index < 0)
            throw new OutOfRangeException("Index out of bounds! Try an index between 0 and " + size);
        // Traverse list
        Node<T> current = head;
        int i = 0;
        while (i != index) {
            current = current.next;
            i++;
        }
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        // Traverse through list
        Node<T> current = head;
        while (current != null) {
            result.append(current.data).append(" "); // Store result
            current = current.next;
        }
        return result.toString();
    }
}