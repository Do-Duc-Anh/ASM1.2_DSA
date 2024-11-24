/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author LENOVO
 */
public class Main {
    // Main method to demonstrate Queue operations
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueuing elements
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.traverse();  // Expected: 100 -> 200 -> 300 -> null

        // Peeking front element
        queue.peek();      // Expected: 100

        // Dequeuing elements
        queue.dequeue();   // Removes 100
        queue.traverse();  // Expected: 200 -> 300 -> null

        queue.dequeue();   // Removes 200
        queue.traverse();  // Expected: 300 -> null

        queue.size();      // Expected: 1

        // Checking if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: false

        queue.dequeue();   // Removes 300
        queue.traverse();  // Expected: Queue is empty.

        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: true

        // Attempting to dequeue from empty queue (will throw exception)
        // queue.dequeue();
    }
}

