package queue;

// Node class representing each element in the LinkedList
class Node {
    int val; // Value of the node
    Node next; // Reference to the next node in the queue

    // Constructor to initialize the node with a value
    Node(int val) {
        this.val = val;
    }
}

// LLQueue class implementing Queue using LinkedList
class LLQueue {
    Node head; // Head of the queue (front)
    Node tail; // Tail of the queue (rear)
    int size = 0; // Size of the queue

    // Method to add an element to the queue
    void add(int x) {
        Node temp = new Node(x); // Create a new node with value x
        if (size == 0) { // Queue empty check
            head = tail = temp; // Set both head and tail to the new node
        } else {
            tail.next = temp; // Link the new node to the end of the queue
            tail = temp; // Update tail to the new node
        }
        size++; // Increment the size of the queue
    }

    // Method to get the front element without removing it
    int peek() {
        if (size == 0) { // Queue empty check
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.val; // Return the value at the front
    }

    // Method to remove and return the front element from the queue
    int remove() {
        if (size == 0) { // Queue empty check
            System.out.println("Queue is Empty, nothing to remove");
            return -1;
        }
        int x = head.val; // Store the front element value
        head = head.next; // Move head to the next node
        size--; // Decrease the size of the queue
        return x; // Return the removed element's value
    }

    // Method to display all elements of the queue
    void display() {
        if (isEmpty()) { // Queue empty check
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = head; // Start from the head node
        while (temp != null) { // Traverse the entire queue
            System.out.print(temp.val + " "); // Print each node's value
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // New line after displaying all elements
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        return size == 0; // Return true if size is 0, indicating an empty queue
    }
}

public class LLImplementation {
    public static void main(String[] args) {
        LLQueue q = new LLQueue(); // Create a new LLQueue object
        System.out.println(q.isEmpty()); // Check if the queue is empty
        q.display(); // Display the initial empty queue
        q.add(1); // Add elements to the queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display(); // Display the queue after adding elements
        System.out.println(q.peek()); // Display the front element
    }
}

/* LinkedList-based Queue Implementation
Queue ek data structure hai jo FIFO (First-In-First-Out) principle follow karta hai. 
Is implementation mein hum LinkedList ka use karte hain jismein elements nodes ki form mein store hote hain.

Methods and Their Explanations

add(int x):
Theory: Yeh method ek element ko queue mein add karne ke liye use hota hai.
Explanation:
1. Empty Check: Agar queue empty hai, to naya node head aur tail dono ban jata hai.
2. Normal Addition: Agar queue empty nahi hai, to tail ke next mein naya node add hota hai 
aur tail update hota hai. Size ko increment karte hain.

peek():
Theory: Yeh method queue ke front element ko retrieve karne ke liye use hota hai bina remove kiye.
Explanation:
1. Empty Check: Agar size 0 hai, to queue empty hai aur method -1 return karta hai.
2. Retrieve Element: Agar queue empty nahi hai, to head node ke value ko return karte hain.

remove():
Theory: Yeh method queue se front element ko remove karne aur return karne ke liye use hota hai.
Explanation:
1. Empty Check: Agar size 0 hai, to queue empty hai aur method -1 return karta hai.
2. Remove Element: Agar queue empty nahi hai, to head node ke value ko store karte hain, 
head ko next node par move karte hain aur size ko decrement karte hain.

display():
Theory: Yeh method queue ke elements ko display karne ke liye use hota hai.
Explanation:
1. Empty Check: Agar size 0 hai, to queue empty hai aur method "Queue is Empty" print karta hai.
2. Print Elements: Agar queue empty nahi hai, to head se tail tak ke elements ko print karte hain.

isEmpty():
Theory: Yeh method check karta hai ki queue empty hai ya nahi.
Explanation:
1. Size Check: Agar size 0 hai, to queue empty hai aur method true return karta hai. Otherwise, false return karta hai.
*/
