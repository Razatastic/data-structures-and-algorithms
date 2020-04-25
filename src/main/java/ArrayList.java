import java.util.Arrays;

public class ArrayList<T> {

    private int size, capacity;
    private Object[] elements;

    ArrayList() {
        this.size = 0;
        this.capacity = 1;
        this.elements = new Object[capacity];
    }

    /**
     * Add an element to the ArrayList
     *
     * @param element the element being added
     */
    void add(T element) {
        // Check if array is full
        if (size == capacity) doubleCapacity();
        // Add the element & increment the size of the array
        this.elements[size++] = element;
    }

    /**
     * Remove specified element
     *
     * @param element the element being removed
     */
    void remove(T element) {
        // Check if array is empty
        if (size != 0) {
            // Search for the element
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {

                }
            }
        }
    }

    /**
     * Remove element at a certain index
     *
     * @param elementIdx
     * @throws Exception for a non-valid index
     */
    void remove(int elementIdx) throws Exception {
        // Range check
        if (elementIdx < 0 || elementIdx >= size) throw new Exception("Please enter a valid index!");

        // Empty array check
        if (size != 0) {

        }
    }

    /**
     * Double the ArrayList's capacity when it fills up
     */
    private void doubleCapacity() {
        // Double capacity
        capacity *= 2;

        // Create temporary array
        Object[] temp = new Object[capacity];

        // Copy over the elements from the current array to the temporary array
        int i = 0;
        for (Object x : this.elements) {
            temp[i++] = x;
        }

        // Update elements array
        this.elements = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.elements);
    }
}