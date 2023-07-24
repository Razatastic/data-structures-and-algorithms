package LinkedList;

import Interfaces.List;

public class DoublyLinkedList<T> implements List<T> {

  private final int size;
  private final Node<T> head, tail;

  DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  DoublyLinkedList(T val) {
    this.head = new Node<>(val);
    this.tail = head;
    this.size = 1;
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
  public T get(int index) {
    return null;
  }
}
