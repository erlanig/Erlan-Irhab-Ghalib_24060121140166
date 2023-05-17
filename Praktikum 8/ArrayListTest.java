/**
 * File      : ArrayListTest.java		17/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Program penggunaan objek ArrayList sebagai Collection class
 * 
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //mengahpus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println(s + " ");
        }
    }
}