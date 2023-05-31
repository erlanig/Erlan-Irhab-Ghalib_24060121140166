import java.util.ArrayList;

/**
 * File      : LambdaList.java		31/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai paramener
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
