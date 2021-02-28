/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

public class Uji  {
    public static void main(String[] args) {
        Line a = new Line (10,20,30,40);
        Line b = new Line (100,200,300,400);
        
        a.getLength();
        b.getLength();
        
        System.out.println("Garis a > Garis b is "+a.isGreater(a, b));
        System.out.println("Garis a < Garis b is "+a.isLess(a, b));
        System.out.println("Garis a = Garis b is "+a.isEqual(a, b));
    }
}
