/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan35.tunjanganoo;

/**
 *
 * @author programmer
 */
public class Tunjangan {
    private double gaji, tunjangan = 0;
    private String status;
    private boolean isMenikah;

    public void setGajiAndStatus(double gaji, String status) {
        this.gaji = gaji;
        this.status = status;
    }
    
    private double hitungTunjangan(double gaji, String status) {
        if(status.toLowerCase().equals("menikah")) {
            tunjangan = gaji * 0.35;
        }
        return tunjangan;
    }
    
    public void hasil() {
        System.out.println("\n--Hasil perhitungan gaji Anda--");
        System.out.println("Gaji pokok : Rp"+gaji);
        System.out.println("Tunjangan : Rp"+hitungTunjangan(gaji, status));
        System.out.println("Total gaji : Rp"+(tunjangan+gaji));
    } 
    
}
