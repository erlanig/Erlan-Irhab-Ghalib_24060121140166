/**
 * File      : Programmer.java		03/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Programmer.java adalah kelas yang berisi metode untuk mencetak nama dan gaji pegawai
 * 
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}