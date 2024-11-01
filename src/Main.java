import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NotaPemesanan nota = new NotaPemesanan("Budi", 5);

        nota.tambahPesanan(new MenuItem("Nasi Goreng", 25000, 2));
        nota.tambahPesanan(new MenuItem("Teh Manis", 5000, 1));
        nota.tambahPesanan(new MenuItem("Ayam Goreng", 20000, 1));

        nota.hitungTotal();
        nota.cetakNota();
    }
}






