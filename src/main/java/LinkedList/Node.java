/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author LENOVO
 */
public class Node {
    Students student;
    Node next;
    
    public Node(Students student){
        this.student = student;
        this.next=null;
    }
    public void print(){
        student.printInfo();
    }
}
