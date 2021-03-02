/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveCoding;

public class karyawan1 extends utama {
    private String nomorPegawai;
    
    public karyawan1 (String nama, String nomorPegawai, String jenisKelamin){
        super (nama,jenisKelamin);
        this.nomorPegawai = nomorPegawai;
    }
    public void gaji(int gaji1){
      System.out.println("Gaji utama yang didapat : Rp"+gaji1);
    }
    
    public void gaji(int gaji1, int bonus1){
        
        System.out.println("Gaji yang didapat jika bekerja dengan baik : Rp"+(gaji1+bonus1)+"\n");
    }
    
    public void cetak(){
        System.out.println("Berikut identitas karyawan : ");
        System.out.println("No. Karyawan : "+this.nomorPegawai); 
        super.cetak();
    }
    
}
