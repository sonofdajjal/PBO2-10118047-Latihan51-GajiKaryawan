/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan51.gajikaryawan;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan,tunjanganjabatan,tunjanganKehadiran;
    
    
    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return hadir=kehadiran*10000;
    }   
    public float tunjanganJabatan(String jabatan){
        int tunjangan = 0;
        switch(jabatan) {
            case "manager": tunjangan = 2000000;break;
            case "kabag": tunjangan = 1000000;break;
            default:tunjangan=0;
        }
        return tunjangan;
    }
    public float tunjanganGolongan(int golongan){
        int tunjangan;
        switch(golongan) {
            case 1: tunjangan = 500000;break;
            case 2: tunjangan = 1000000;break;
            default:tunjangan=0;
        }
        return tunjangan;
    }
    public float gajiTotal(){
        return tunjanganJabatan(jabatan)+tunjanganGolongan(golongan)+tunjanganKehadiran(kehadiran);
    }
    
}
