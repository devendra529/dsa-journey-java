class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Display {
    void view(Node head) {
        Node temp = head;

        while (temp != null) {  
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

class Linkedlist {
    Node head;

    void insert(int data) {
        Node newnode = new Node(data);     //making the object of the Node class 

        if (head == null) {     //if head is null the head is the newnode
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();   // making object of the Linkedlist class

        // inserting using method
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(9);

        Display d = new Display();    //making the object of the Display

        d.view(list.head); 
    }
}