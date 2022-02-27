import java.util.ArrayList;

public class TugasZahraSDA6 {
    public static void main(String[] args) {
        
        ArrayList <String> namaakhir = new ArrayList<String>();
        namaakhir.add("Z");
        namaakhir.add("A");
        namaakhir.add("K");
        namaakhir.add("I");

        namaakhir.add(0,"e");
        System.out.println("penambahan e pada indeks-0 = " +namaakhir);

        namaakhir.add(2,"f");
        System.out.println("penambahan f pada indeks-2 = " +namaakhir);

        namaakhir.add(3,"g");
        System.out.println("penambahan g pada indeks-3 = " +namaakhir);

        namaakhir.add(4,"h");
        System.out.println("penambahan h pada indeks-4 = " +namaakhir);

        namaakhir.add(6,"h");
        System.out.println("penambahan h pada indeks-6 = " +namaakhir);

        namaakhir.add(-3,"j");
        System.out.println("penambahan e pada indeks-0 = " +namaakhir);
    }
}



