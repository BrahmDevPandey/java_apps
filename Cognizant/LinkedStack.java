// program to implement a linkedstack in java
class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedStack {
    Node top;

    LinkedStack() {
        this.top = null;
    }

    public void push(int data) {
        // for the first push
        Node temp = new Node(data);
        if (top == null) {
            top = temp;
        } else {
            temp.link = top; // make temp point to the start of the stack
            top = temp; // make top point to the new start again
        }
    }

    public Integer pop() {
        // checking for stack underflow
        if (top == null) {
            System.out.println("Error: Stack Underflow.");
            return null;
        }
        int data = top.data;
        top = top.link;
        return data;
    }

    public void show() {
        Node temp = this.top;
        while (temp.link != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
