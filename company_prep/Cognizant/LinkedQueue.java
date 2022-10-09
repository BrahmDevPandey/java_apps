import java.rmi.server.RemoteRef;

// to implement a linked queue in java
class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedQueue {
    Node start, end;

    LinkedQueue() {
        this.start = null;
        this.end = null;
    }

    public void add(int data) {
        Node temp = new Node(data);
        // for the first node addition
        if (this.start == null) {
            this.start = temp;
            this.end = temp;
        } else {
            // insert the newly formed node at the starting
            this.end.link = temp;
            this.end = temp;
        }
    }

    public Integer remove() {
        // if the list is empty
        if (this.start == null) {
            System.out.println("Error: Queue Empty!");
            return (Integer) null;
        }
        int data = this.start.data;
        // if only one node is present in the list
        if (this.start == end) {
            this.start = this.end = null;
        } else {
            this.start = this.start.link;
        }
        return data;
    }

    public void show() {
        Node temp = this.start;
        if (temp == null) {
            System.out.println("Queue Empty!");
            return;
        }
        while (temp.link != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
