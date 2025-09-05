/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_tiga;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Mobil extends Kendaraan {
    public Mobil(String nama, int kecepatan, int kapasitasMesin){
        super(nama, kecepatan, kapasitasMesin);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + "melaju di jalan tol dengan kecepatan " + kecepatan + "km/jam");
    }
}
