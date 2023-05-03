/**
 * File      : Manajer.java		03/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Manajer.java adalah kelas yang berisi metode untuk menghitung gaji manajer
 * 
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan); //this untuk nunjuk parameter
    }
}