import java.util.Arrays;

public class ArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Add an element to the ArrayList
     *
     * @param e the element being added
     */
    public void add(E e) {
        // Check if array is full
        if (size == elements.length) ensureCapacity();
        // Add the element & increment the size of the array
        this.elements[size++] = e;
    }

    /**
     * Get element at a certain index
     *
     * @param i index at which you're retrieving the element from
     * @return element at that particular index
     */
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        return (E) elements[i];
    }

    /**
     * Remove element at a certain index
     *
     * @param i the index at which you're removing the element from
     * @return element that was removed
     * @throws IndexOutOfBoundsException throw an exception for a non-valid index
     */
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        // Range check
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);

        Object item = elements[i];
        int numElms = elements.length - (i + 1);
        return (E) item;
    }

    /**
     * Remove specified element
     *
     * @param element the element being removed
     */
    public void remove(E element) throws Exception {
        // Check if array is empty
        if (size > 0) {
            // Search for the element
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) remove(i);
            }
        }
    }

    /**
     * Get size of list
     *
     * @return total number of elements in the list
     */
    public int size() {
        return size;
    }

    /**
     * Double the ArrayList's capacity when it fills up
     */
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}