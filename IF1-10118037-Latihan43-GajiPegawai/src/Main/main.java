/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program penggajian karyawan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       GajiPegawai gaji = new GajiPegawai();
       
        //input
        System.out.print("Masukkan Nama Karyawan : ");
        gaji.setNama(input.nextLine());
        System.out.print("Masukkan Alamat Karyawan : ");
        gaji.setAlamat(input.nextLine());
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        
        //output
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(),gaji.getUangTransport(),
                gaji.getGajiPokok(), gaji.totalGaji(gaji.getUangTunjangan(),gaji.getUangTransport(),gaji.getGajiPokok()));
    }
    
}
