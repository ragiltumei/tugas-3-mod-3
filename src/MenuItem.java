public class MenuItem {
    private String namaMakanan;
    private double harga;
    private int jumlah;

    public MenuItem(String namaMakanan, double harga, int jumlah) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return harga * jumlah;
    }

    public String getNamaMakanan() { return namaMakanan; }
    public double getHarga() { return harga; }
    public int getJumlah() { return jumlah; }
}
