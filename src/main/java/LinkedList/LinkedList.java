package LinkedList;

import Exceptions.OutOfRangeException;
import Interfaces.List;

/**
 * Singly-linked list implementation
 *
 * @param <T>
 */
class LinkedList<T> implements List<T> {
    private Node<T> head, tail;
    private int size;

    LinkedList(T input) {
        head = tail = new Node<>(input);
        size = 1;
    }

    LinkedList() {
        head = tail = null;
        size = 0;
    }

    T peek() {
        if (head == null) return null;
        return head.data;
    }

    T getLast() {
        if (tail == null) return null;
        return tail.data;
    }

    @Override
    public boolean add(T element) {
        // Edge cases
        if (element == null) return false;

        // Make dummy node
        Node<T> curr = new Node<T>(null);

        // Traverse list
        curr.next = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Add node & increment list size
        curr.next = new Node<>(element);
        this.size++;
        tail = curr.next;

        return true;
    }

    @Override
    public boolean remove(T element) {
        // Edge cases
        if (element == null) return false;

        // Create a temporary node for comparison
        Node<T> nodeBeingDeleted = new Node<>(element);

        // Create a dummy node that points to the head
        Node<T> tempNode = new Node<T>(null);
        tempNode.next = head;

        // Traverse through the list
        while (tempNode.next != null) {
            if (tempNode.next.equals(nodeBeingDeleted)) {
                if (tempNode.next.equals(tail)) tail = tempNode;
                tempNode.next = tempNode.next.next;
                return true;
            }
            tempNode = tempNode.next;
        }

        return false;
    }

    @Override
    public T get(int index) throws OutOfRangeException {
        // Edge cases
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