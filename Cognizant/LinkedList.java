// program to implement a Linked List in java
class Node {
    int data;
    Node link;

    public Node() {
        this.data = 0;
        this.link = null;
    }

    public Node(final int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(final int data) {
        if (this.head == null) {
            // simply insert a node at the head
            head = new Node(data);
        } else {
            Node temp = head;
            // traverse to the end of the list
            while (temp.link != null) {
                temp = temp.link;
            }
            // insert a node at the end
            temp.link = new Node(data);
        }
    }

    public int remove(int n) {
        Node temp = this.head;
        if (n == 0) {
            int data = head.data;
            head = head.link;
            return data;
        }
        // traverse to the (n-1)th node
        for (int i = 0; i < n - 1 && temp != null; i++) {
            temp = temp.link;
        }
        if (temp == null) {
            return (Integer) null;
        }
        temp.link = temp.link.link;
        return 1;
    }

    public int get(int n) {
        Node temp = this.head;
        // traverse to the nth node
        for (int i = 0; i < n && temp != null; i++) {
            temp = temp.link;
        }
        if (temp == null) {
            return (Integer) null;
        }
        return temp.data;
    }

    public int set(int n, int data) {
        Node temp = this.head;
        // traverse to the nth node
        for (int i = 0; i < n && temp != null; i++) {
            temp = temp.link;
        }
        if (temp == null) {
            return (Integer) null;
        }
        temp.data = data;
        return 1;
    }

    public void showList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}
