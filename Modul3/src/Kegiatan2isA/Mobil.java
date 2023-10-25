package Kegiatan2isA;

import Kegiatan2.Kendaraan;

public class Mobil extends Kendaraan {

    public String nama;

    public Mobil(int harga, String nama) {
        super(harga);
        this.nama = nama;
    }

    public Mobil(int harga, int jumlahRoda, String nama) {
        super(harga, jumlahRoda);
        this.nama = nama;
    }

    public Mobil(int harga, int jumlahRoda, String warna, String nama) {
        super(harga, jumlahRoda, warna);
        this.nama = nama;
    }
}
