/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class Tester {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager mng = new Manager();
        Scanner input=new Scanner(System.in);
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukkan NIK : ");
        mng.setNik(input.next());
        System.out.print("Masukkan Nama : ");
        mng.setNama(input.next());
        System.out.print("Masukkan Golongan : ");
        mng.setGolongan(input.nextInt());
        System.out.print("Masukan Jabatan (manager/kabag) : ");
        mng.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mng.setKehadiran(input.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK : " + mng.getNik());
        System.out.println("NAMA : " + mng.getNama());
        System.out.println("GOLONGAN : " + mng.getGolongan());
        System.out.println("JABATAN : " + mng.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan Golongan : "+ mng.tunjanganGolongan(mng.getGolongan()));
        System.out.println("Tunjangan Jabatan : " + mng.tunjanganJabatan(mng.getJabatan()));
        System.out.println("Tunjangan Kehadiran : " +  mng.tunjanganKehadiran(mng.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAl : " + mng.gajiTotal());
        
        
    }
    
}
