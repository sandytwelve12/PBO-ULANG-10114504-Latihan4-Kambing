/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan4.kambing;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program Kambing
 */
public class PBOULANG10114504Latihan4Kambing {
    
    public void tambahKambing() {
        // Dekralasi Variabel Lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : "+ jumlahKambing);
    }
    
    public static void main(String[] args) {
        PBOULANG10114504Latihan4Kambing kambingJantan = new Kambing ();
        kambingJantan.tambahKambing();
    }

    private static class Kambing extends PBOULANG10114504Latihan4Kambing {

        public Kambing() {
        }
    }
}
