/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

public class UjiRect {
    public static void main(String[] args) {
        Rect a = new Rect(1, 1, 4, 4);
        Rect b = new Rect(2, 3, 5, 6);
    
        System.out.println("2,3 is inside the union");
        System.out.println(a+" union "+b+" = "+a.union(b));
        System.out.println(a+" intersect "+b+" = "+a.intersection(b));
        
        System.out.print(a.intersection(b)+" digeser sejauh (1,3)");
        a.move(1, 3);
        b.move(1, 3);
        System.out.println(" --> "+a.intersection(b));
    }
    
}
