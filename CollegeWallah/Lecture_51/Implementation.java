public class Implementation {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    void insertAtEnd(int val) {
      Node temp = new Node(val);

      if (head == null) {
        head = temp;
      } else {
        tail.next = temp;
      }
      tail = temp;
      size++;
    }

    void insertAtBeginning(int val) {
      Node temp = new Node(val);

      if (head == null) { // empty list
        head = tail = temp;
      } else { // non-empty list
        temp.next = head;
        head = temp;
      }
      size++;
    }

    void insertAt(int idx, int val) {
      Node t = new Node(val);
      Node temp = head;

      if (idx == size) {
        insertAtEnd(val);
        return;
      }

      else if (idx == 0) {
        insertAtBeginning(val);
        return;
      }
      else if(idx < 0 || idx > size) {
        System.out.println("Wrong index");
        return;
      }
      else {
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
      }
    }

    void deleteAtIndex(int idx) {
      Node temp = head;

      if(idx == 0) {
        head = head.next;
        size--;
        return;
      }
      else if (idx == size) {
        tail = temp;
        size--;
        return;
      }
      else {
        for(int i=0; i<idx-1; i++) {
          temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
      }
    }

    int getAt(int idx) {
      Node temp = head;
      
      if(idx < 0 || idx > size) {
        System.out.println("Wrong index");
        return -1;
      }

      for(int i=0; i<idx; i++) {
        temp = temp.next;
      }

      return temp.data;
    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }

    // int size() {
    //   Node temp = head;
    //   int count = 0;
    //   while (temp != null) {
    //     count++;
    //     temp = temp.next;
    //   }

    //   return count;
    // }

  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtEnd(4); // 4
    // ll.display();
    ll.insertAtEnd(5); // 4 -> 5
    // ll.display();
    ll.insertAtEnd(10); // 4 -> 5 -> 10
    // ll.display();
    ll.insertAtBeginning(2); // 2 -> 4 -> 5 -> 10
    // ll.display();
    ll.insertAt(0, 6);
    ll.display();

    // System.out.println(ll.size);

    // System.out.println(ll.getAt(89));

    

    ll.deleteAtIndex(3);
    ll.deleteAtIndex(0);
    ll.display();
    
    System.out.println("Head: " + ll.head.data);
    System.out.println("Tail: " + ll.tail.data);

  }
}
