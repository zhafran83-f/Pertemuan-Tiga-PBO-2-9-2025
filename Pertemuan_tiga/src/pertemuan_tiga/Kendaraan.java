/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_tiga;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public abstract class Kendaraan { 
    protected String nama;
    protected int kecepatan;
    protected int kapasitasMesin;
    
    public Kendaraan(String nama, int kecepatan, int kapasitasMesin){
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public abstract void bergerak();
    
    public void info() {
        System.out.println("Nama: " + nama + "Kecepatan: "+ kecepatan + "km/jam" + kapasitasMesin + "Kapasitas Mesin: ");
    }
}
