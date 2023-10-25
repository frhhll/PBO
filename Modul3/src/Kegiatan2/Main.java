package Kegiatan2;

import Kegiatan2isA.Mobil;

public class Main {

    public static void main(String[] args) {
        Mobil k1 = new Mobil(759000000, 4, "Putih", "BMW");
        Mobil k2 = new Mobil(979000000, 4, "Hitam", "Mercy");

        System.out.println("===== Dealer Mobil Baru Buka =====");
        System.out.println("");
        System.out.println("Mobil 1");
        System.out.println("Merk Mobil  : " + k1.nama);
        System.out.println("Harga       : " + k1.getHarga());
        System.out.println("Jumlah Roda : " + k1.jumlahRoda);
        System.out.println("Warna       : " + k1.warna);
        System.out.println();
        System.out.println("Mobil 2");
        System.out.println("Merk Mobil  : " + k2.nama);
        System.out.println("Harga       : " + k2.getHarga());
        System.out.println("Jumlah Roda : " + k2.jumlahRoda);
        System.out.println("Warna       : " + k2.warna);

    }
}