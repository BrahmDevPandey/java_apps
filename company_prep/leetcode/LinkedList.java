// porgram to implement all functionalities of LinkedList in java
// Model, View, Controller

class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int length;

    public LinkedList() {
        this.head = null;
        length = 0;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public void insertAtBegining(int data) {
        // create a new node first
        Node newNode = new Node(data);
        newNode.next = this.head; // O(1)
        this.head = newNode;
        System.out.println("Inserted " + data);
        this.length++;
    }

    public void insertAtEnd(int data) {
        // create a new node first
        Node newNode = new Node(data);
        // if list is empty
        if (this.isEmpty()) {
            this.head = newNode;
        }
        // if there are some nodes in the list
        else {
            // go to the end of the list
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // now insert newNode at the end
            temp.next = newNode;
        }
        System.out.println("Inserted " + data);
        this.length++;
    }

    public void insertAfter(int pos, int data) {
        // search for the node having data = pos
        Node temp = head;
        while (temp != null && temp.data != pos) {
            temp = temp.next;
        }

        // now if temp has reached the end of the list and pos was not found
        if (temp == null) {
            System.out.println(pos + " node not present in the list.");
            return;
        }

        // if the control has reached here, this means that temp.data == pos
        // so insert data node after temp
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Inserted " + data + " after " + pos);
        this.length++;
    }

    public void insertAtIndex(int index, int data) {
        if (index >= this.length || index < 0) {
            System.out.println("Index " + index + " not present in list.");
            return;
        }

        // to insert at index i, we need to traverse upto the i-1th node
        Node temp = this.head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }

        // now, temp will be pointing to the i-1th node
        Node newNode = new Node(data);
        if (index == 0) {
            // to be inserted at beginning
            this.insertAtBegining(data);
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Inserted " + data + " at index " + index);
        this.length++;
    }

    public int deleteFromBegining() {
        int data; // will store data of node to be deleted
        if (this.isEmpty()) {
            System.out.println("List is empty. Can't delete.");
            return -1;
        }

        data = head.data;
        head = head.next;
        this.length--;
        return data;
    }

    public int deleteFromEnd() {
        if (this.isEmpty()) {
            System.out.println("List is empty. Can't delete.");
            return -1;
        }

        Node temp = this.head;
        // traverse to the second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        int data = temp.next.data; // store data of temp.next
        temp.next = null; // delete next from list
        this.length--;
        return data;
    }

    public int deleteNode(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty. Can't delete.");
            return -1;
        }

        if (head.data == data) { // for the first node (an edge case)
            return deleteFromBegining();
        }

        // traverse to the node just before the one having data = data
        Node temp = this.head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node " + data + " not present in the list.");
            data = -1;
        } else {
            data = temp.next.data;
            temp.next = temp.next.next;
        }
        this.length--;
        return data;
    }

    public int deleteAtIndex(int index) {
        if (this.isEmpty()) {
            System.out.println("List is empty. Can't delete.");
            return -1;
        }

        if (index < 0 || index >= this.length) {
            System.out.println("Index not present in list.");
            return -1;
        }

        // for the first node
        if (index == 0) {
            return deleteFromBegining();
        }

        int count = 0;
        Node temp = this.head;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        // now temp is pointing to the node just before index node
        int data = temp.next.data;
        temp.next = temp.next.next;
        this.length--;
        return data;
    }

    public int length() {
        return this.length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}