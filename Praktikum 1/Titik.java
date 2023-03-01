/**
 * File      : Titik.java		22/02/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Kelas yang berisi metode titik
 * 
 */

class Titik {
    //atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //overload constructor baru
    Titik(double a, double o) { //karena ada parameternya maka bisa diakses langsung di main
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    Titik() { 
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    void setAbsis(double a) {
        absis = a;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    int getCounterTitik() {
        return counterTitik;
    }
}
