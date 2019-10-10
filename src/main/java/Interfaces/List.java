package Interfaces;

import LinkedList.OutOfRangeException;

public interface List<E> {
    int size();

    boolean add(E e);

    boolean remove(E e);

    E get(int index) throws OutOfRangeException;
}
