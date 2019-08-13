package LinkedList;

class LinkedList {
    private int size;
    private Node head;

    /**
     * Constructor
     *
     * @param input value of the head node
     */
    LinkedList(String input) {
        head = new Node(input);
        incrementSize();
    }

    /**
     * Constructor (Overloaded)
     */
    LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Prints the entire list
     */
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Adds an element to the end of the list
     *
     * @param input element being added
     * @return value of the newly created node
     */
    Node add(String input) {
        if (size() == 0) addFirst(input);

        Node current = head;
        while (current.next != null) current = current.next;
        current.next = new Node(input);

        incrementSize();
        return head;
    }

    Node addFirst(String input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        incrementSize();
        return head;
    }

    /**
     * Add an element to a specific part of the list
     *
     * @param index where you want to add the list
     * @param input element being added
     * @return head node
     * @throws OutOfRangeException when index < 0 || index > list size
     */
    Node add(int index, String input) throws OutOfRangeException {
        // Check if the index is in a valid range
        if (index > size() || index < 0)
            throw new OutOfRangeException("Please enter a valid range from 0 to " + size());

        // If the index is 0, insert the node at the head
        if (index == 0) addFirst(input);

        // Traverse to the node right before the index you're inserting at
        int i = 0;
        Node current = head;
        while (i != index - 1) {
            current = current.next;
            i++;
        }

        // Insert the new node
        Node newNode = new Node(input);
        newNode.next = current.next;
        current.next = newNode;

        incrementSize();
        return head;
    }

    /**
     * Removes the last element in the list
     */
    Node removeLast() throws OutOfRangeException {
        if (size == 0) throw new OutOfRangeException("There are no elements to remove!");
        if (size == 1) return null;

        Node current = head;
        while (current != null && current.next.next != null) {
            current = current.next;
        }
        assert current != null;
        current.next = null;

        return head;
    }

    /**
     * Get the element at the given index
     *
     * @param index the index of the element you're looking for
     * @return item at the inputted index
     * @throws OutOfRangeException if index < 0 || index > size
     */
    String get(int index) throws OutOfRangeException {
        if (index >= size || index < 0)
            throw new OutOfRangeException("Index out of bounds! Try an index between 0 and " + size);
        Node current = head;
        int i = 0;
        while (i != index) {
            current = current.next;
            i++;
        }
        return current.data;
    }

    String getFirst() {
        return peek();
    }

    String getLast() throws OutOfRangeException {
        return get(size() - 1);
    }

    /**
     * Increases the list size by 1
     */
    private void incrementSize() {
        size++;
    }

    /**
     * Decreases the list size by 1
     */
    private void decrementSize() {
        size--;
    }

    /**
     * Get size of list
     *
     * @return size of list
     */
    private int size() {
        return size;
    }

    /**
     * Get head value
     *
     * @return value of head
     */
    String peek() {
        return head == null ? null : head.data;
    }
}