package LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NodeTest
{
  private static Node<String> nodeOne = new Node<>("dummy");

  @Test
  @DisplayName("Checks if the node has an assigned value")
  void nodeIsInitialized()
  {
    assertEquals("dummy", nodeOne.data);
  }
}