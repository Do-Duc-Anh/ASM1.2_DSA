/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackinteger;

/**
 *
 * @author LENOVO
 */
public class Stack {
    private Node top;

    // Constructor để khởi tạo ngăn xếp rỗng
    public Stack() {
        this.top = null;
    }

    // Phương thức kiểm tra ngăn xếp rỗng
    public boolean isEmpty() {
        return top == null;
    }

    // Phương thức thêm một phần tử vào ngăn xếp
    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
    }

    // Phương thức xóa một phần tử khỏi ngăn xếp
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            Student poppedStudent = top.data;
            top = top.next;
            return poppedStudent;
        }
    }

    // Phương thức xem phần tử đầu tiên (top) của ngăn xếp
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            return top.data;
        }
    }

    // Phương thức in toàn bộ ngăn xếp
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
