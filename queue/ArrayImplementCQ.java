package queue;

class CircularQueue {
    private int front = -1; // Front index of the queue
    private int rear = -1;  // Rear index of the queue
    private int size = 0;   // Number of elements in the queue
    public final int[] arr = new int[5]; // Array to store queue elements

    // Method to add an element to the queue
    void add(int x) throws Exception {
        // Check if the queue is full
        if (size == arr.length) {
            throw new Exception("Queue is full");
        }
        
        // If queue is empty, initialize front and rear
        if (size == 0) {
            front = rear = 0;
            arr[rear] = x; // Add element at the front position
            size++;
        } else {
            // Check if rear is at the end of the array
            if (rear == arr.length - 1) {
                rear = 0; // Wrap around to the start of the array
            } else {
                rear++; // Move to the next position
            }
            arr[rear] = x; // Add element at the new rear position
            size++;
        }
    }

    // Method to remove and return the front element from the queue
    int remove() throws Exception {
        // Check if the queue is empty
        if (size == 0) {
            throw new Exception("Queue is empty");
        }
        
        int val = arr[front]; // Get the front element
        
        // Move front to the next position
        if (front == arr.length - 1) {
            front = 0; // Wrap around to the start of the array
        } else {
            front++;
        }
        
        size--; // Decrease the size of the queue
        return val; // Return the removed element
    }

    // Method to get the front element without removing it
    int peek() throws Exception {
        // Check if the queue is empty
        if (size == 0) {
            throw new Exception("Queue is empty");
        }
        return arr[front]; // Return the front element
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        return size == 0; // Return true if size is 0
    }

    // Method to display all elements of the queue
    void display() {
        // Check if the queue is empty
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            // Display elements from front to rear
            if (front <= rear) {
                // When front is before or at the rear
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                // When front has wrapped around
                // Print elements from front to end of array
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                // Print elements from start of array to rear
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println(); // Print new line after displaying elements
        }
    }
}

public class ArrayImplementCQ {
    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue(); // Create a new CircularQueue object
        q.display(); // Display the queue (should be empty initially)
        q.add(1); // Add elements to the queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // Display the queue after adding elements
        q.remove();
        q.display();
        q.add(5);
        q.add(6);
        q.display();
        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i]+" ");
        }
    }
}
