/**
 * File      : Pegawai.java		03/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Pegawai.java adalah kelas yang berisi metode untuk menghitung gaji pegawai
 * 
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 500000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", " + "Gaji Pokok : " + this.gajiPokok);
    }
}