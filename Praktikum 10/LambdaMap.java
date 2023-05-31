import java.util.HashMap;
import java.util.Map;

/**
 * File      : LambdaMap.java		31/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Implementasi lambda pada hash map
 *
 */

public class LambdaMap{
    public static void main(String[] args){
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140166 :", " Erlan" );
        mahasiswaMap.put("24060121130062 :", " Varrel" );
        mahasiswaMap.put("24060121130090 :", " Dorino" );
        mahasiswaMap.put("24060121140139 :", " Thirafi" );
        mahasiswaMap.put("24060121140122 :", " Fikri" );

        //lambda digunakan sebagai paramener
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + nama));
    }
}