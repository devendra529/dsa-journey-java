import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class display {
    void view(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null"); // adds the null at the end
    }
}
class linkedlist{
   Node head;

    void insert(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode; // fix
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newnode;
        }
    
}
public class Input {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the value how much node you make");
          int n=sc.nextInt();
          linkedlist list =new linkedlist();

          for(int i=0;i<n;i++){
            int num=sc.nextInt();
             list.insert(num);
          }
           display a = new display();
        System.out.println("Your linked list:");
        a.view(list.head);

    }
}
