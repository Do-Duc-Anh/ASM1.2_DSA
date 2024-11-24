/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLL;


/**
 *
 * @author LENOVO
 */
public class TestDoublyLinkedList {

    // The main method is the entry point of the program
    public static void main(String[] args) {

        // Create an instance of MyList, which presumably represents a doubly linked list
        MyList ml = new MyList();

        // Add three elements (1, 2, 3) to the list
        ml.add(1);  // Adds element 1 to the list
        ml.add(2);  // Adds element 2 to the list
        ml.add(3);  // Adds element 3 to the list

        // Traverse the list to print or process the elements in it
        ml.traverse();  // Traverses and likely prints the elements in the list
    }
}
