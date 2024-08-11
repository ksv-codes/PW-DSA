package queue;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        // Create a Queue of Integer using LinkedList implementation
        Queue<Integer> q = new LinkedList<>();
        // Check if the queue is empty
        System.out.println(q.isEmpty());
        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5); // Elements added to the rear of the queue (rear --> 5 4 3 2 1 --> front)
        // Print the queue directly
        System.out.println("Directly: " + q);

        // Print the queue elements using the custom qPrinter method
        qPrinter(q);
    }

    // Method to print and then restore the elements of the queue
    public static void qPrinter(Queue<Integer> q) {
        // Create a helper queue to temporarily hold elements
        Queue<Integer> helper = new LinkedList<>();

        // Print and remove each element from the original queue
        while (q.size() > 0) {
            System.out.print(q.peek() + " "); // Print the front element
            helper.add(q.poll()); // Remove the front element and add it to the helper queue
        }
        System.out.println(); // Move to the next line after printing all elements

        // Restore elements to the original queue
        while (helper.size() > 0) {
            q.add(helper.poll()); // Remove elements from helper queue and add them back to the original queue
        }
        System.out.println(); // Move to the next line after restoring all elements
    }
}




/*Queue in Java
A Queue is a collection designed for holding elements prior to processing. It follows the First-In-First-Out (FIFO) principle, meaning elements are added at the rear and removed from the front.

Key Methods of Queue Interface:

add(E e): Inserts the specified element into the queue.
offer(E e): Inserts the specified element into the queue, returning true upon success.
remove(): Retrieves and removes the head of the queue.
poll(): Retrieves and removes the head of the queue, or returns null if the queue is empty.
peek(): Retrieves, but does not remove, the head of the queue.
isEmpty(): Checks if the queue is empty.
size(): Returns the number of elements in the queue.
Implementations of Queue:

LinkedList: Implements Queue and provides methods to manipulate both ends of the queue.
PriorityQueue: Implements Queue but orders elements based on priority rather than insertion order.
ArrayDeque: Implements Queue and provides a resizable array implementation. */
