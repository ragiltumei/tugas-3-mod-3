import java.util.ArrayList;

public class NotaPemesanan {
    private String namaPelanggan;
    private int nomorMeja;
    private ArrayList<MenuItem> daftarPesanan;
    private double totalHarga;

    public NotaPemesanan(String namaPelanggan, int nomorMeja) {
        this.namaPelanggan = namaPelanggan;
        this.nomorMeja = nomorMeja;
        this.daftarPesanan = new ArrayList<>();
        this.totalHarga = 0;
    }

    public void tambahPesanan(MenuItem menuItem) {
        daftarPesanan.add(menuItem);
    }


    public void hitungTotal() {
        totalHarga = 0;
        for (MenuItem item : daftarPesanan) {
            totalHarga += item.getSubtotal();
        }
    }

    public void cetakNota() {
        System.out.println("=== Nota Pemesanan ===");
        System.out.println("Pelanggan: " + namaPelanggan);
        System.out.println("Meja: " + nomorMeja);
        System.out.println("Pesanan:");

        for (MenuItem item : daftarPesanan) {
            System.out.println("- " + item.getNamaMakanan() + " x" + item.getJumlah() + " = Rp" + item.getSubtotal());
        }

        System.out.println("Total: Rp" + totalHarga);
    }
}
