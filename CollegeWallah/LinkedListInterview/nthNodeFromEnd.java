package LinkedListInterview;

/**
 * nthNodeFromEnd
 */
public class nthNodeFromEnd {

  // nth node from last in two traversals
  public static Node nthNodeFromLast(Node head, int n) {
    int size = 0;
    Node temp = head;
    while(temp != null) {
      size++;
      temp = temp.next;
    }
    int m = size - n + 1;
    // mth node from start

    temp = head;
    for(int i=0; i<m-1; i++) {
      temp = temp.next;
    }
    return temp;
  }

  // nth node from last in one traversal
  public static Node nthNodeFromLast2(Node head, int n) {
    Node slow = head;
    Node fast = head;

    for(int i=0; i<n; i++) {
      fast = fast.next;
    }

    while(fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }

  // delete nth from end
  public static Node deleteNthFromEnd(Node head, int n) {
    Node slow = head;
    Node fast = head;

    for(int i=0; i<n; i++) {
      fast = fast.next;
    }

    if(fast == null) {
      head = head.next;
      return head;
    }

    while(fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;
    return head;
  }

  // Finding middle element of a linked list
  // Hint:  Slow & Fast pointers approach
  public static Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }


  public static void display(Node head) {
    Node temp = head;
    while(temp != null) {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    Node a = new Node(100);
    Node b = new Node(13);
    Node c = new Node(4);
    Node d = new Node(5);
    Node e = new Node(12);
    Node f = new Node(10);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;

    // 100->13->4->5->12->10

    // Node temp = nthNodeFromLast2(a,4);
    // System.out.println("Value: "+temp.data);

    // display(a);
    // a = deleteNthFromEnd(a, 6);
    display(a);
    Node middle = findMiddle(a);
    System.out.println("Value at mid: " + middle.data);
  }
}