/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ASUS
 */
public class pembayaranGaji {
    public int hitungGaji (Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        return uang;
    }
    public static void main(String[] args) {
        pembayaranGaji pg = new pembayaranGaji();
        Staf ali = new Staf();
        Direktur tony = new Direktur ();
        System.out.println("Gaji yang dibayarkan untuk Staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada DIrektur = "+pg.hitungGaji(tony));
        
    }
}