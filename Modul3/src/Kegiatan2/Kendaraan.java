package Kegiatan2;

public class Kendaraan {

    private int harga;
    public int jumlahRoda;
    protected String warna;

    public Kendaraan(int harga) {
        this.harga = harga;
    }

    public Kendaraan(int harga, int jumlahRoda) {
        this.harga = harga;
        this.jumlahRoda = jumlahRoda;
    }

    public Kendaraan(int harga, int jumlahRoda, String warna) {
        this.harga = harga;
        this.jumlahRoda = jumlahRoda;
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}