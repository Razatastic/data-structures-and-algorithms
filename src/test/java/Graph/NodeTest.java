package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class NodeTest {

  @Test
  void dataRetrievalMethods() {
    Node<String> test = new Node<>("yo");
    assertEquals(test.getData(), test.toString());
  }

  @Test
  void hashCodeCheck() {
    Node<String> test = new Node<>("yo");
    Node<String> test1 = new Node<>("yo");
    Node<String> test2 = new Node<>("Yo");
    assertEquals(test, test1);
    assertNotEquals(test, test2);
  }
}