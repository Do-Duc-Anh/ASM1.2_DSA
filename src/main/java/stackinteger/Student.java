/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackinteger;

/**
 *
 * @author LENOVO
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private double marks;  // Thêm thuộc tính marks (điểm)

    // Constructor
    public Student(String id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks; // Khởi tạo giá trị cho thuộc tính marks
    }

    // Getter và Setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {  // Thêm getter cho marks
        return marks;
    }

    public void setMarks(double marks) {  // Thêm setter cho marks
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', age=" + age + ", marks=" + marks + "}";
    }
}
