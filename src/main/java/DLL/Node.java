/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLL;

/**
 *
 * @author LENOVO
 */
public class Node {
    // Variable to store data for the node
    int info;

    // Pointers to the next and previous nodes in the doubly linked list
    Node next, prev;

    // Default constructor (no parameters), initializes a node without setting any values
    public Node() {
        // Empty constructor, could be used for manual initialization later
    }

    // Parameterized constructor to initialize the node with data and links to next and previous nodes
    public Node(int info, Node next, Node prev) {
        this.info = info;     // Store the data in the current node
        this.next = next;     // Set the reference to the next node
        this.prev = prev;     // Set the reference to the previous node
    }
}
