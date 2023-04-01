/**
 * File      : Asersi1.java		01/04/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *            jari-jari lingkaran yang bernilai nol
 */

//class lingkaran
class Lingkaran{
    private double jariJari;

    //konstruktor
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 5;
        //menguji ekspresi jari jari tidak boleh sama dengan 0
        assert(jariJari > 0): "jari-jari tidak boleh nol";
        //jari jari = 0 false, maka akan diterminate ada kesalahan kode
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
Pertanyaan : 
secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 

Jawaban :
Secara umum, konsep program Asersi2 sudah tepat. Namun, ada satu hal yang kurang tepat yaitu pada saat penggunaan assert.
Pada program tersebut, assert digunakan untuk memastikan bahwa jariJari > dari nol sebelum objek Lingkaran dibuat. Namun, 
secara default, assert akan dinonaktifkan pada waktu runtime. Oleh karena itu, kondisi jariJari>0 tidak akan dicek pada 
waktu program dijalankan.
Sebaiknya, untuk memastikan kondisi tersebut selalu terpenuhi, kita bisa menggunakan mekanisme exception (eksepsi). Dapat dicatat 
bahwa asersi biasanya digunakan untuk tujuan debugging dan pengujian dan seharusnya tidak digunakan untuk penanganan kesalahan dalam
kode produksi. Dalam kode produksi, disarankan untuk menggunakan mekanisme penanganan kesalahan yang sesuai yaitu eksepsi, untuk 
menangani kesalahan dan kondisi yang tidak terduga yang mungkin terjadi selama eksekusi program karena konsep dari asersi merupakan 
bukan bagian dari implementasi digunakan untuk keperluan debugging, semestinya tidak digunakan untuk mengubah state dari objek.
*/