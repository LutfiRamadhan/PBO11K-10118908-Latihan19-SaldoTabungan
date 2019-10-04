/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo = 2500000, lama = 6, bunga = (double) 0.15;
        for (int i = 1; i <= lama; i++) {
            saldo += (saldo*bunga);
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,9.0f \n", saldo);
        }
    }
    
}
