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
public class utama {
    private String nama,nomorPegawai,jenisKelamin;
    
    public utama (String nama,  String jenisKelamin){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }    
    public void cetak(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Jenis Kelamin : "+this.jenisKelamin);
        System.out.println("Bekerja di bidang admin");
        
    
    }
   
        
}
