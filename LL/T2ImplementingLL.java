package LL;
class SLL{
    private Node head;
    private Node tail;
    int size;
    void insertAtEnd(int value){
        Node temp = new Node(value);
        if (head==null) {
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void insertAtBeginning(int value){
        Node temp = new Node(value);
        if (head==null) {
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public int getSize() {
        System.out.print("Size of the Linked list is: ");
        return size;
    }
}
public class T2ImplementingLL {
    public static void main(String[] args) {
        SLL a = new SLL();
        a.insertAtEnd(10);
        a.insertAtEnd(20);
        a.insertAtEnd(30);
        a.display();
        a.insertAtBeginning(5);
        a.display();
        System.out.println(a.getSize());
    }
}
