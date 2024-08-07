package LinkedListInterview;

/**
 * ReverseList
 */
public class ReverseList {

  public static class Node {
    int val;
    Node next;
    Node(int val) {
      this.val = val;
    }
  }

  public static Node reverse(Node head) {
    if(head.next == null) return head;
    Node newHead = reverse(head.next);
    head.next.next = head;  // interchaning the connections
    head.next = null;
    return newHead;
  }

  public static void display(Node head) {
    if(head == null) {
      System.out.println();
      return;
    };
    System.out.print(head.val + " ");
    display(head.next);
  }

  public static void displayRev(Node head) {
    if(head == null) return;  // base case
    displayRev(head.next); // call 
    System.out.print(head.val + " "); // work
  }

  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(5);
    Node c = new Node(1);
    Node d = new Node(2);
    Node e = new Node(4);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    display(a);
    a = reverse(a);
    display(a);
  }
}