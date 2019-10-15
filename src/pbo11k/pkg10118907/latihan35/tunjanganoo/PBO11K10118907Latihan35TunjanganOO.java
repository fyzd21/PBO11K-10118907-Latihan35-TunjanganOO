/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan35.tunjanganoo;

import java.util.Scanner;

/**
 *
 * @author programmer
 */
public class PBO11K10118907Latihan35TunjanganOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gaji;
        String status;
        
        System.out.println("--Program Tunjangan--\n");
        System.out.print("Berapa gaji pokok Anda perbulan? Rp");
        Scanner s = new Scanner(System.in);
        gaji = Double.parseDouble(s.next());
        
        System.out.print("Status Anda (Menikah/belum)? ");
        Scanner s2 = new Scanner(System.in);
        status = s2.next();
        
        Tunjangan t = new Tunjangan();
        t.setGajiAndStatus(gaji, status);
        t.hasil();
        
        System.out.println("\nDeveloped by : Yazid");
    }
    
}
