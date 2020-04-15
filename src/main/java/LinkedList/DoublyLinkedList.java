package LinkedList;

import Exceptions.OutOfRangeException;
import Interfaces.List;

public class DoublyLinkedList<T> implements List<T> {
    private int size;
    private Node<T> head, tail;

    DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    DoublyLinkedList(T val) {
        head = new Node<>(val);
        tail = head;
        size = 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public T get(int index) throws OutOfRangeException {
        return null;
    }
}
