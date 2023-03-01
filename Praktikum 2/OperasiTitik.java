/**
 * File      : OperasiTitik.java		01/03/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Kelas yang berisi metode untuk operasi titik
 * 
 */

class OperasiTitik {
	private void refleksiSumbuX(Titik titik) {
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	private void refleksiSumbuY(Titik titik) {
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
		//titik.setAbsis(-titik.getAbsis());
	}
	public Titik refleksiX(Titik titik) {
		refleksiSumbuX(titik);
		return titik;
	}

	public Titik refleksiY(Titik titik) {
		refleksiSumbuY(titik);
		return titik;
	}
}
	