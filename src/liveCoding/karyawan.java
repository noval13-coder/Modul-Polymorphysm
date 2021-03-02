/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveCoding;

/**
 *
 * @author ASUS
 */
public class karyawan {
    public static void main(String[] args) {
        karyawan1 baru = new karyawan1("Andi","2020202","Laki-laki");
        baru.cetak();
        baru.gaji(100000);
        baru.gaji(100000, 50000);
        
        karyawan2 baru2 = new karyawan2("Abar","0899711","Laki-laki");
        baru2.cetak();
        baru.gaji(100000);
        baru.gaji(100000, 40000);
       
        
    }
}
