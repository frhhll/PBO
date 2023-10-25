package Kegiatan1;

public class MainOutput {
    public static void main(String[] args) {
        BangunRuang kerucut = new Kerucut (14,12,10);
        BangunRuang bola = new Bola (21);

        System.out.println("");
        System.out.println("======================================");
        System.out.println(" Luas Permukaan & Volume Bangun Ruang ");
        System.out.println("======================================");
        System.out.println("     =====     Kerucut     =====      ");
        System.out.println("Luas Permukaan Kerucut  : " + kerucut.getLuasPermukaan());
        System.out.println("Volume Kerucut          : " + kerucut.getVolume());
        System.out.println("");

        System.out.println("       =====     Bola     =====       ");
        System.out.println("Luas Permukaan Bola : " + bola.getLuasPermukaan());
        System.out.println("Volume Bola         : " + bola.getVolume());
    }
}