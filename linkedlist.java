import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        // Membuat objek LinkedList Hewan dan menambahkan beberapa data
        LinkedList<String> hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("Data Hewan Sebelum Evolusi: ");
        System.out.println("" + hewan);

        LinkedList<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("\nHewan yang dihapus: ");
        System.out.println("" + deleteHewan);

        for (String data : deleteHewan) {
            hewan.remove(data);
        }
        System.out.println("\nLinkedList Hewan setelah penghapusan: ");
        System.out.println("" + hewan);
    }
}
