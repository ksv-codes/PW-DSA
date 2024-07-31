package LL;
class Node{
    int value;
    Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    Node(int value){
        this(value, null);
    }
}
public class T1CreatingNode {
    public static void LLprinter(Node head){
        while (head!=null) {
            System.out.print(head.value+" ");
            head= head.next;
        }
        System.out.println();
    }
    public static void LLprinterR(Node head){
        if (head==null) {System.out.println(); return;}
        System.out.print(head.value+" ");
        LLprinter(head.next);
    }
    public static void reverseLLPrinter(Node head){
        if (head==null){
            return;} 
        reverseLLPrinter(head.next);
        System.out.print(head.value+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next=b;
        b.next=c;
        c.next=null;
        LLprinter(a);
        LLprinterR(a);
        reverseLLPrinter(a);
    }
}
