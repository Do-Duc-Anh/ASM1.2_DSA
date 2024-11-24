/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author LENOVO
 */
public class Queue {
    private Node front;  // Front of the queue
    private Node rear;   // Rear of the queue

    // Constructor to initialize an empty queue
    public Queue() {
        this.front = this.rear = null;
    }

    // Method to enqueue an element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data); // Create a new node

        if (isEmpty()) {                          // If queue is empty
            front = rear = newNode;               // New node is both front and rear
            System.out.println(data + " enqueued as the first element.");
            return;
        }

        rear.next = newNode;                      // Link the new node at the end of queue
        rear = newNode;                           // Update the rear to new node
        System.out.println(data + " enqueued.");
    }

public int dequeue() {
        if (isEmpty()) {                          // Check if queue is empty
            throw new IllegalStateException("Queue Underflow. Cannot dequeue from an empty queue.");
        }

        int dequeuedData = front.data;             // Get data from front node
        front = front.next;                        // Update front to next node

        if (front == null) {                       // If queue becomes empty
            rear = null;                           // Update rear to null
        }

        System.out.println(dequeuedData + " dequeued from the queue.");
        return dequeuedData;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {                          // Check if queue is empty
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        System.out.println("Front element is: " + front.data);
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Traverse queue
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
            }

        System.out.print("Queue (front to rear): ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
   
    // Method to get the size of the queue
    public int size() {
        int count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Queue size: " + count);
        return count;
    }
}
