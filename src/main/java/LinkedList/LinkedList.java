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
     * Traverses through the entire list
     *
     * @param n head node
     * @return the 2nd to last element
     */
    private Node traverse(Node n) { // Returns last element of linked list
        if (n.next.next == null) return n;
        return traverse(n.next);
    }

    /**
     * Helper function
     *
     * @return the last element
     */
    private Node traverse() {
        return traverse(head);
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
    }

    /**
     * Adds an element to the end of the linked list
     *
     * @param input element being added
     * @return value of the newly created node
     */
    String add(String input) {
        if (size == 1) {
            head.next = new Node(input);
            return head.next.data;
        }
        Node lastElm = traverse().next;
        lastElm.next = new Node(input); // set the last node's pointer to a newly created node with the user-supplied data
        incrementSize();
        return lastElm.next.data;
    }

    /**
     * Removes the last element in the list
     */
    void remove() {
        Node current = traverse();
        current.next = null;
    }

    /**
     * Get the element at the given index
     *
     * @param index the index of the element you're looking for
     * @return item at the inputted index
     * @throws OutOfRangeException if index < 0 || index > size
     */
    String getElement(int index) throws OutOfRangeException {
        if (index > size || index < 0)
            throw new OutOfRangeException("Index out of bounds! Try an index between 0 and " + size);
        Node current = head;
        int i = 0;
        while (i != index) {
            current = current.next;
            i++;
        }
        return current.data;
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
     * Get head value
     *
     * @return value of head
     */
    String peek() {
        return head.data;
    }
}