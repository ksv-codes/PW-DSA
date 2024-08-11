package queue;
class QueueA {
    // Front of the queue
    int f = -1;
    // Rear of the queue
    int r = -1;
    // Current size of the queue
    int size = 0;
    // Array to store queue elements
    int[] arr = new int[5];
    
    // Method to add an element to the queue
    void add(int val) {
        // Check if the queue is full
        if (r == arr.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        // If queue is empty, initialize front and rear
        if (f == -1) {
            f = r = 0; // Set both front and rear to 0
            arr[0] = val; // Add the element at index 0
        } else {
            arr[++r] = val; // Increment rear and add element
        }
        size++; // Increase the size of the queue
    }
    
    // Method to remove and return the front element from the queue
    int remove() {
        // Check if the queue is empty
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedValue = arr[f]; // Get the front element
        f++; // Move front index to the next element
        size--; // Decrease the size of the queue
        return removedValue; // Return the removed element
    }
    
    // Method to get the front element without removing it
    int peek() {
        // Check if the queue is empty
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[f]; // Return the front element
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
            // Print elements from front to rear
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); // New line after displaying all elements
        }
    }
}

public class ArrayImplementation {
    public static void main(String[] args) {
        QueueA q = new QueueA(); // Create a new QueueA object
        q.display(); // Display initial empty queue
        q.add(56); // Add an element to the queue
        q.display(); // Display queue after adding the element
        System.out.println(q.size);
    }
}

/*Queue Implementation Using Array
Queue ek data structure hai jo First-In-First-Out (FIFO) principle follow karta hai. Iska matlab hai ki pehle jo element add hota hai, woh pehle remove hota hai. Array-based queue mein, hum ek fixed-size array ka use karte hain aur front aur rear pointers ke saath queue ke operations manage karte hain.

Methods and Their Explanations:

enqueue(int val):
Theory: Yeh method ek element ko queue mein add karne ke liye use hota hai.
Explanation:
Full Check: Sabse pehle, hum check karte hain ki queue full hai ya nahi. Agar rear array ke last index par hai, to queue full hai.
Empty Check: Agar queue empty hai (i.e., front -1 hai), to hum front aur rear dono ko 0 set karte hain aur element ko arr[0] par add karte hain.
Normal Addition: Agar queue empty nahi hai, to rear ko increment karke naya element add karte hain aur size ko bhi increment karte hain.

dequeue():
Theory: Yeh method queue se front element ko remove karne aur return karne ke liye use hota hai.
Explanation:
Empty Check: Agar size 0 hai, to queue empty hai aur method -1 return karta hai.
Remove Element: Agar queue empty nahi hai, to front index se element ko retrieve karte hain, front ko increment karte hain aur size ko decrease karte hain.
Reset Check: Agar size 0 ho jata hai after removal, to front aur rear ko -1 set kar dete hain, queue ko empty indicate karne ke liye.

peek():
Theory: Yeh method queue ke front element ko retrieve karne ke liye use hota hai bina remove kiye.
Explanation:
Empty Check: Agar size 0 hai, to queue empty hai aur method -1 return karta hai.
Retrieve Element: Agar queue empty nahi hai, to front index se element ko return karte hain.

isEmpty():
Theory: Yeh method check karta hai ki queue empty hai ya nahi.
Explanation:
Size Check: Agar size 0 hai, to queue empty hai aur method true return karta hai. Otherwise, false return karta hai.

display():
Theory: Yeh method queue ke elements ko display karne ke liye use hota hai.
Explanation:
Empty Check: Agar size 0 hai, to queue empty hai aur method "Queue is empty" print karta hai.
Print Elements: Agar queue empty nahi hai, to front se rear tak ke elements ko print karte hain. */