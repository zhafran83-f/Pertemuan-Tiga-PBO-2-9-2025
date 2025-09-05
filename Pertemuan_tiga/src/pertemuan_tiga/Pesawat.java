/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_tiga;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Pesawat implements bisa_terbang, bisa_dikendarai, bisa_mengapung { 
    private String nama;

    public Pesawat(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void terbang(){
        System.out.println(nama + " sedang terbang di langit.");
    }
    
    @Override
    public void dikendarai(){
        System.out.println(nama + " sedang terbang dikendarai oleh pilot dan co-pilot.");
    }

    @Override
    public void mengapung(){
        System.out.println(" sedang mengapung untuk pendaratan darurat");
    }
}
