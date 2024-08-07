package LinkedListInterview;

/**
 * SplitLinkedList
 */
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class SplitLinkedList {

  static class Heads {
    Node oddHead;
    Node evenHead;
  }

  public static Heads splitList(Node head) {
    Node oddDummy = new Node(0);
    Node evenDummy = new Node(0);
    Node oddTail = oddDummy;
    Node evenTail = evenDummy;

    Node current = head;

    while(current != null) {
      if (current.data % 2 == 0) {
        evenTail.next = current;
        evenTail = evenTail.next;
      } else {
        oddTail.next = current;
        oddTail = oddTail.next;
      }
      current = current.next;
    }

    evenTail.next = null;
    oddTail.next = null;

    Heads h = new Heads();
    h.oddHead = oddDummy.next;
    h.evenHead = evenDummy.next;

    return h;
  }

  public static void printList(Node head) {
    Node current = head;
    while(current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    Heads h = splitList(head);

    System.out.println("Odd List: ");
    printList(h.oddHead);

    System.out.println("Even List: ");
    printList(h.evenHead);
  }
  
}