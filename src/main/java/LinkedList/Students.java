/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author LENOVO
 */
public class Students {
    private int Id;
    private String Name;
    private double Marks;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double Marks) {
        this.Marks = Marks;
    }
    
    public Students(int Id,String Name, double Marks){
        this.Id=Id;
        this.Name=Name;
        this.Marks=Marks;
    }
    
    public Students(){
        
    }
    
    public void printInfo(){
        System.out.println("\t Id"+Id+"\t Name"+Name+"\t Mark"+Marks);
    }
}

