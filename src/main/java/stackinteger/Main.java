/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackinteger;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Thêm một số đối tượng Student vào ngăn xếp với điểm số (marks)
        stack.push(new Student("S01", "Alice", 20, 85.5));
        stack.push(new Student("S02", "Bob", 22, 90.0));
        stack.push(new Student("S03", "Charlie", 21, 78.3));

        // In nội dung của ngăn xếp
        System.out.println("Current Stack:");
        stack.display();

        // Lấy phần tử đầu tiên (pop) khỏi ngăn xếp
        System.out.println("\nPopping one element:");
        System.out.println(stack.pop());

        // In ngăn xếp sau khi pop
        System.out.println("\nStack after pop:");
        stack.display();

        // Xem phần tử đầu tiên (peek)
        System.out.println("\nPeek top element:");
        System.out.println(stack.peek());
    }
}
