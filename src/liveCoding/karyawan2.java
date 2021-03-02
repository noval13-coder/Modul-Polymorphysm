/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveCoding;

public class karyawan2 extends utama {
    private String nomorPegawai2;
    
    public karyawan2 (String nama, String nomorPegawai2, String jenisKelamin){
        super (nama,jenisKelamin);
        this.nomorPegawai2 = nomorPegawai2;
    
    }
    public void gaji(int gaji2){
       System.out.println("Gaji utama yang didapat : Rp"+gaji2);
    }
    
    public void gaji(int gaji2, int bonus2){
        
        System.out.println("Gaji yang didapat jika bekerja dengan baik : Rp"+(gaji2+bonus2));
    }
    public void cetak(){
        System.out.println("No. Karyawan : "+this.nomorPegawai2); 
        super.cetak();
    }
   
}
