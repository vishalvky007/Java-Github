/**
 * BasicsLinkedList
 */

public class BasicsLinkedList {

  public static void display(Node head) {
    Node temp = head;
    while(temp!=null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void recursiveDisplay(Node head) {
    if(head == null) return;
    System.out.print(head.data + " ");
    recursiveDisplay(head.next);
  }

  public static void reverseDisplay(Node head) {
    if(head == null) {
      System.out.println();
      return;
    }
    reverseDisplay(head.next);
    System.out.print(head.data + " ");
  }

  public static int length(Node head) {
    int count=0;
    while(head!=null) {
      count++;
      head = head.next;
    }
    return count;
  }

  public static class Node {
    int data; // value
    Node next; // address of next node

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(3);
    Node c = new Node(9);
    Node d = new Node(8);
    Node e = new Node(100);

    // 5 -> 3 -> 9 -> 8 -> 16

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = null;

    Node temp = a;

    // for (int i = 1; i <= 5; i++) {
      // System.out.print(temp.data + " ");
      // temp = temp.next;
    // }

    // while(temp!=null) {
      // System.out.print(temp.data + " ");
      // temp = temp.next;
    // }

    // display(a);
    // recursiveDisplay(a);
    // reverseDisplay(a);
    System.err.println(length(a));

  }
}