/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    @Override
    public void fuel(){
        System.out.println("Fuels Alreaady on AeroPlan");  
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan ();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
