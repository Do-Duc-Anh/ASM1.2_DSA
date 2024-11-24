/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){
        Students s1 = new Students(1,"tran van trom", 8.0);
        Students s2 = new Students(2,"nguyen thi than", 8.0);
        Students s3 = new Students(3,"pham tu toi", 8.0);
        MyList ml=new MyList();
        ml.add(s1);
        ml.add(s2);
        ml.add(s3);
        ml.traverse();
    }
}
