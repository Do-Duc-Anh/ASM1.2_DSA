/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLL;

/**
 *
 * @author LENOVO
 */
public class MyList {
    // Pointers to the head (first) and tail (last) nodes of the doubly linked list
    Node head, tail;

    // Constructor to initialize an empty list with head and tail set to null
    public MyList() {
        head = tail = null;  // Both head and tail are null, indicating an empty list
    }

    // Method to check if the list is empty (true if head is null)
    public boolean isEmpty() {
        return (head == null);  // If head is null, the list is empty
    }

    // Method to add a new element 'x' to the end of the list
    public void add(int x) {
        if (isEmpty()) {
            // If the list is empty, create a new node and set both head and tail to this node
            head = tail = new Node(x, null, null);  // First node has no next or previous nodes
        } else {
            // If the list is not empty, add a new node at the end
            Node n = new Node(x, null, tail);  // Create a new node with 'x', next = null, prev = tail
            tail.next = n;  // Set the next of the current tail to the new node
            tail = n;       // Update the tail to the new node
        }
    }

    // Method to add multiple elements from an array to the list
    public void addMany(int[] a) {
        // Iterate through the array and add each element to the list
        for (int i : a) {
            add(i);  // Call the add() method for each element
        }
    }

    // Method to traverse the list from head to tail and print each node's info
    public void traverse() {
        Node p = head;  // Start from the head of the list
        while (p != null) {
            System.out.println(p.info);  // Print the info of the current node
            p = p.next;  // Move to the next node in the list
        }
    }
}
