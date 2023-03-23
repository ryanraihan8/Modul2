import java.util.ArrayList;

/**
 * @author Ryan
 */

    public class latihan2 {
    public static void main(String[] args) {

        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("Contoh Hewan: ");
        System.out.println(""+ hewan);

        ArrayList<String> delete = new ArrayList<String>();
        String element1 = hewan.remove(2);
        delete.add(element1);
        String element2 = hewan.remove(3);
        delete.add(element2);
        System.out.println("\nSetelah menghapus elemen kedua: ");
        System.out.println(""+ hewan);
        System.out.println("\nElemen yang dihapus adalah: ");
        System.out.println("" + delete);
    }
}
