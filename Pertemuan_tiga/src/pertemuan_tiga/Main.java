/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_tiga;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Main { //untuk menampilkan atau meng-run
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Ferrari ", 315, 6500);
        Kendaraan motor = new Motor("Ducati ",  280, 998);
        
        mobil.bergerak();
        motor.bergerak();
        
        //Interface
        Pesawat pesawat = new Pesawat("Batik Air");
        pesawat.terbang();
        
        //Overloading
        Helper helper = new Helper();
        helper.cetakInfo("Truk");
        helper.cetakInfo("Bus ", 120,  11000);
        helper.cetakInfo("Pesawat Batik Air");
    }
}
