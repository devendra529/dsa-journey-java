import java.util.Scanner;

class Node {
    int data;   //making the data which store
    Node next;  // initialized the reference variable

    Node(int data){
        this.data = data;     
        this.next = null;
    }
}
//Display class is making for the Display the Linkedlist
class Display {
    void view(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;     // print the same data then go to the next node and the restart the while loop
        }
        System.out.println("null");   // after the completing the loop null while print pointing to the null or last node of the linkedlist
    }
}

class LinkedList {
    Node head;

    void insert(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;
        }
    }

    // DELETE METHOD INSIDE SAME CLASS
    void deleteAtIndex(int idx){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(idx == 0){
            head = head.next;
            return;
        }

        Node temp = head;

        for(int i = 0; i < idx - 1; i++){
            if(temp.next == null){
                System.out.println("Index out of range");
                return;
            }
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Index out of range");
            return;
        }

        temp.next = temp.next.next;
    }
}

public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        LinkedList ll = new LinkedList();
         // using for loop to take input from the user and insert that value to the linkedlist class
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            ll.insert(val);
        }
       // making the object of the display class
        Display di = new Display();

        System.out.println("Original List:");
        di.view(ll.head);

        System.out.print("Enter index to delete: ");
        int idx = sc.nextInt();

        ll.deleteAtIndex(idx); 

        System.out.println("After Deletion:");
        di.view(ll.head);

        sc.close();
    }
}